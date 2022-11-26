/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import Repository.IDongSPRRepository;
import Utilities.SQLServerConnection;
import ViewModels.DongSPRResponse;
import ViewModels.KichCoRResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DongSPRRepository implements IDongSPRRepository {

    @Override
    public ArrayList<DongSPRResponse> getAll() {
        String query = "SELECT Ten\n"
                + "FROM     dbo.DongSP";
        ArrayList<DongSPRResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongSPRResponse dongSPRResponse = new DongSPRResponse(rs.getString(1));
                list.add(dongSPRResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
