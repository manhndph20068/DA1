/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import DomainModel.ChiTietHoaDon;
import Repository.IChiTietHoaDonRepository;
import Utilities.SQLServerConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDonRepository implements IChiTietHoaDonRepository {

    @Override
    public ArrayList<ChiTietHoaDon> getDataByID(String id) {
        String query = "SELECT dbo.HoaDonChiTiet.IdCTSP, dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia\n"
                + "FROM     dbo.HoaDonChiTiet INNER JOIN\n"
                + "                  dbo.SanPhamChiTiet ON dbo.HoaDonChiTiet.IdCTSP = dbo.SanPhamChiTiet.Id INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.SanPhamChiTiet.IdSanPham = dbo.SanPham.Id Where dbo.HoaDonChiTiet.IdHD = ?";
        ArrayList<ChiTietHoaDon> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getFloat(5));
                list.add(chiTietHoaDon);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean saveHoaDonCT(ChiTietHoaDon chiTietHoaDon) {
        String query = "INSERT INTO [dbo].[HoaDonChiTiet]\n"
                + "           ([IdHD]\n"
                + "           ,[IdCTSP]\n"
                + "           ,[SoLuong]\n"
                + "           ,[DonGia])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, chiTietHoaDon.getIdHD());
            ps.setObject(2, chiTietHoaDon.getIdCTSP());
            ps.setObject(3, chiTietHoaDon.getSoLuong());
            ps.setObject(4, chiTietHoaDon.getDonGia());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;

    }

    public boolean delete(String idHD, String idCTSP) {
        String query = "DELETE FROM [dbo].[HoaDonChiTiet]\n"
                + "      WHERE IdHD = ? and IdCTSP = ?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, idHD);
            ps.setObject(2, idCTSP);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

}
