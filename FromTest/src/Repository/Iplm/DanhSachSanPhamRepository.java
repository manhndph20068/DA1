/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import DomainModel.HoaDon;
import Repository.IDanhSachSanPhamRepository;
import Utilities.SQLServerConnection;
import ViewModels.DanhSachSanPhamResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DanhSachSanPhamRepository implements IDanhSachSanPhamRepository {

    @Override
    public ArrayList<DanhSachSanPhamResponse> getAll() {
        String query = "SELECT dbo.SanPhamChiTiet.Id, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.SanPhamChiTiet.NamBH, dbo.KichCo.Ten AS Expr1, dbo.SanPhamChiTiet.SoLuongTon, dbo.SanPhamChiTiet.GiaNhap, dbo.SanPhamChiTiet.GiaBan, \n"
                + "                  dbo.SanPhamChiTiet.HinhAnh, dbo.SanPhamChiTiet.QrCode\n"
                + "FROM     dbo.SanPhamChiTiet INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.SanPhamChiTiet.IdSanPham = dbo.SanPham.Id INNER JOIN\n"
                + "                  dbo.KichCo ON dbo.SanPhamChiTiet.IdKichCo = dbo.KichCo.Id";
        ArrayList<DanhSachSanPhamResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhSachSanPhamResponse danhSachSanPhamResponse = new DanhSachSanPhamResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getFloat(7), rs.getFloat(8), rs.getString(9), rs.getString(10));
                list.add(danhSachSanPhamResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updateSoLuongSP(DanhSachSanPhamResponse dsspr, String id) {
        String query = "UPDATE [dbo].[SanPhamChiTiet]\n"
                + "   SET [SoLuongTon] = ?"
                + " WHERE Id = ?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, dsspr.getSoLuong());
            ps.setObject(2, id);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public ArrayList<DanhSachSanPhamResponse> getSoLuongById(String id) {
        String query = "SELECT SoLuongTon\n"
                + "FROM     dbo.SanPhamChiTiet Where Id = ?";
        ArrayList<DanhSachSanPhamResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhSachSanPhamResponse danhSachSanPhamResponse = new DanhSachSanPhamResponse(rs.getInt(1));
                list.add(danhSachSanPhamResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<DanhSachSanPhamResponse> getAllByTheLoai(String tenTH, String tenKC, String tenDongSp) {
        String query = "SELECT dbo.SanPhamChiTiet.Id, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.SanPhamChiTiet.NamBH, dbo.KichCo.Ten AS Expr1, dbo.SanPhamChiTiet.SoLuongTon, dbo.SanPhamChiTiet.GiaNhap, dbo.SanPhamChiTiet.GiaBan, \n"
                + "                  dbo.SanPhamChiTiet.HinhAnh, dbo.SanPhamChiTiet.QrCode\n"
                + "FROM     dbo.SanPhamChiTiet INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.SanPhamChiTiet.IdSanPham = dbo.SanPham.Id INNER JOIN\n"
                + "                  dbo.ThuongHieu ON dbo.SanPhamChiTiet.IdThuongHieu = dbo.ThuongHieu.Id INNER JOIN\n"
                + "                  dbo.KichCo ON dbo.SanPhamChiTiet.IdKichCo = dbo.KichCo.Id INNER JOIN\n"
                + "                  dbo.DongSP ON dbo.SanPhamChiTiet.IdDongSP = dbo.DongSP.Id Where dbo.ThuongHieu.Ten =? and dbo.KichCo.Ten =? and dbo.DongSP.Ten = ?";
        ArrayList<DanhSachSanPhamResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, tenTH);
            ps.setObject(2, tenKC);
            ps.setObject(3, tenDongSp);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhSachSanPhamResponse danhSachSanPhamResponse = new DanhSachSanPhamResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getFloat(7), rs.getFloat(8), rs.getString(9), rs.getString(10));
                list.add(danhSachSanPhamResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
