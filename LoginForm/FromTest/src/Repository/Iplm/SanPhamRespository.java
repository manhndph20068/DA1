/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import DomainModel.SanPham;
import Repository.ISanPhamRespository;
import java.util.List;
import Utilities.SQLServerConnection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class SanPhamRespository implements ISanPhamRespository {

    @Override
    public List<SanPham> getAll() {
        String query = "select * from DA1.dbo.SanPham";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<SanPham> lstSp = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                lstSp.add(sp);
            }
            return lstSp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(SanPham sp) {
        String query = "INSERT INTO [dbo].[SanPham]"
                + "           ([Ma]"
                + "           ,[Ten]"
                + "           ,[TrangThai])"
                + "     VALUES(?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, sp.getMa());
            ps.setObject(2, sp.getTen());
            ps.setObject(3, sp.getTrangThai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

    @Override
    public boolean update(SanPham sp, String id) {
        String query = "UPDATE [dbo].[SanPham]"
                + "   SET [Ma] = ?"
                + "      ,[Ten] = ?"
                + "      ,[TrangThai] = ?"
                + " WHERE [Id] = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, sp.getMa());
            ps.setObject(2, sp.getTen());
            ps.setObject(3, sp.getTrangThai());
            ps.setObject(4, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[SanPham]"
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

    @Override
    public List<SanPham> getMaSp(String ma) {
        String query = "select * from DA1.dbo.SanPham where Ma = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ma);
            List<SanPham> sp = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                SanPham lstSp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                sp.add(lstSp);
            }
            return sp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public List<SanPham> getTenSp(String ten) {
        String query = "select * from DA1.dbo.SanPham where Ten = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ten);
            List<SanPham> sp = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                SanPham lstSp = new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                sp.add(lstSp);
            }
            return sp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
