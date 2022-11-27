/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import DomainModel.NhanVien;
import Repository.INhanVien;
import java.util.List;
import Utilities.SQLServerConnection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class NhanVienRespository implements INhanVien {

    @Override
    public List<NhanVien> getAll() {
        String query = "select * from DA1.dbo.NhanVien";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<NhanVien> lstNv = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12));
                lstNv.add(nv);
            }
            return lstNv;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(NhanVien nv) {
        String query = "INSERT INTO [dbo].[NhanVien]"
                + "           ([Ma]"
                + "           ,[Ten]"
                + "           ,[GioiTinh]"
                + "           ,[NgaySinh]"
                + "           ,[DiaChi]"
                + "           ,[Sdt]"
                + "           ,[ChucVu]"
                + "           ,[TrangThai]"
                + "           ,[TenTK]"
                + "           ,[MatKhau]"
                + "           ,[HinhAnh])"
                + "     VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getGioiTinh());
            ps.setObject(4, nv.getNgaySinh());
            ps.setObject(5, nv.getDiaChi());
            ps.setObject(6, nv.getSoDienThoai());
            ps.setObject(7, nv.getChucVu());
            ps.setObject(8, nv.getTrangThai());
            ps.setObject(9, nv.getTenTaiKhoan());
            ps.setObject(10, nv.getMatKhau());
            ps.setObject(11, nv.getHinhAnh());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(NhanVien nv, String id) {
        String query = "UPDATE [dbo].[NhanVien]"
                + "   SET [Ma] = ?"
                + "      ,[Ten] = ?"
                + "      ,[GioiTinh] = ?"
                + "      ,[NgaySinh] = ?"
                + "      ,[DiaChi] = ?"
                + "      ,[Sdt] = ?"
                + "      ,[ChucVu] = ?"
                + "      ,[TrangThai] = ?"
                + "      ,[TenTK] = ?"
                + "      ,[MatKhau] = ?"
                + "      ,[HinhAnh] = ?"
                + " WHERE [Id] = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, nv.getMa());
            ps.setObject(2, nv.getTen());
            ps.setObject(3, nv.getGioiTinh());
            ps.setObject(4, nv.getNgaySinh());
            ps.setObject(5, nv.getDiaChi());
            ps.setObject(6, nv.getSoDienThoai());
            ps.setObject(7, nv.getChucVu());
            ps.setObject(8, nv.getTrangThai());
            ps.setObject(9, nv.getTenTaiKhoan());
            ps.setObject(10, nv.getMatKhau());
            ps.setObject(11, nv.getHinhAnh());
            ps.setObject(12, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[NhanVien]"
                + "      WHERE Id = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}
