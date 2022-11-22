/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModel.ChiTietHoaDon;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface IChiTietHoaDonService {

    ArrayList<ChiTietHoaDon> getDataByID(String id);

    String saveHoaDonCT(ChiTietHoaDon chiTietHoaDon);

    String delete(String idHD, String idCTSP);
}
