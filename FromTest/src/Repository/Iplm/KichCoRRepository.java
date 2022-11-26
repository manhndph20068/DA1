/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import Repository.IKichCoRRepository;
import Utilities.SQLServerConnection;
import ViewModels.KichCoRResponse;
import ViewModels.ThuongHieuRResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class KichCoRRepository implements IKichCoRRepository {

    @Override
    public ArrayList<KichCoRResponse> getAll() {
        String query = "SELECT Ten\n"
                + "FROM     dbo.KichCo";
        ArrayList<KichCoRResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KichCoRResponse kichCoRResponse = new KichCoRResponse(rs.getString(1));
                list.add(kichCoRResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
