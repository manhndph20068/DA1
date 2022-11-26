/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import Repository.IThuongHieuRReository;
import Utilities.SQLServerConnection;
import ViewModels.DanhSachSanPhamResponse;
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
public class ThuongHieuRRepository implements IThuongHieuRReository {

    @Override
    public ArrayList<ThuongHieuRResponse> getAll() {
        String query = "SELECT Ten\n"
                + "FROM     dbo.ThuongHieu";
        ArrayList<ThuongHieuRResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThuongHieuRResponse thuongHieuResponse = new ThuongHieuRResponse(rs.getString(1));
                list.add(thuongHieuResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
