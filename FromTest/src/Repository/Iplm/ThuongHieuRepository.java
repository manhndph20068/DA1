/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import Utilities.SQLServerConnection;
import DomainModel.ThuongHieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Repository.IThuongHieu;

/**
 *
 * @author admin
 */
public class ThuongHieuRepository implements IThuongHieu {

    @Override
    public List<ThuongHieu> getAll() {

        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "      ,[TrangThai]\n"
                + "  FROM [dbo].[ThuongHieu]";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<ThuongHieu> listChiTietSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThuongHieu qlCt = new ThuongHieu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                listChiTietSP.add(qlCt);
            }
            return listChiTietSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;

    }

    @Override
    public boolean add(ThuongHieu t) {
        String query = "INSERT INTO [dbo].[ThuongHieu]\n"
                + "           ([Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[TrangThai])\n"
                + "     VALUES\n"
                + "           (?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, t.getMa());
            ps.setObject(2, t.getTen());
            ps.setObject(3, t.getTrangThai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[ThuongHieu]\n"
                + "      WHERE Id = ? ";
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
    public boolean update(ThuongHieu cv, String id) {
        String query = "UPDATE [dbo].[ThuongHieu]\n"
                + "     SET   [Ten] = ?"
                + "      ,[TrangThai] = ?"
                + " WHERE id = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, cv.getTen());
            ps.setObject(2, cv.getTrangThai());
            ps.setObject(3, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

}
