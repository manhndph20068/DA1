/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import Utilities.SQLServerConnection;
import DomainModel.ChatLieu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Repository.IChatLieuRespository;

/**
 *
 * @author admin
 */
public class ChatLieurepository implements IChatLieuRespository {

    @Override
    public List<ChatLieu> getAll() {

        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[DaChinh]\n"
                + "      ,[DaPhu]\n"
                + "      ,[DeNgoai]\n"
                + "      ,[LopLotTrong]\n"
                + "      ,[TrangThai]\n"
                + "  FROM [dbo].[ChatLieu]";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<ChatLieu> listChiTietSP = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChatLieu qlCt = new ChatLieu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                listChiTietSP.add(qlCt);
            }
            return listChiTietSP;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;

    }

    @Override
    public boolean add(ChatLieu t) {
        String query = "INSERT INTO [dbo].[ChatLieu]\n"
                + "           ([Ma]\n"
                + "           ,[DaChinh]\n"
                + "           ,[DaPhu]\n"
                + "           ,[DeNgoai]\n"
                + "           ,[LopLotTrong]\n"
                + "           ,[TrangThai])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, t.getMa());
            ps.setObject(2, t.getDaChinh());
            ps.setObject(3, t.getDaPhu());
            ps.setObject(4, t.getDeNgoai());
            ps.setObject(5, t.getLopLotTrong());
            ps.setObject(6, t.getTrangThai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[ChatLieu]\n"
                + "      WHERE Id = ? ";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(ChatLieu cv, String ma) {
        String query = "UPDATE [dbo].[ChatLieu]\n"
                + "   SET [DaChinh] = ?\n"
                + "      ,[DaPhu] = ?\n"
                + "      ,[DeNgoai] = ?\n"
                + "      ,[LopLotTrong] = ?\n"
                + "      ,[TrangThai] = ?\n"
                + " WHERE [Id] = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, cv.getDaChinh());
            ps.setObject(2, cv.getDaPhu());
            ps.setObject(3, cv.getDeNgoai());
            ps.setObject(4, cv.getLopLotTrong());
            ps.setObject(5, cv.getTrangThai());
            ps.setObject(6, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;

    }

}
