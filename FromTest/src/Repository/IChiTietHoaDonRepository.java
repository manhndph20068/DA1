/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.ChiTietHoaDon;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface IChiTietHoaDonRepository {
    ArrayList<ChiTietHoaDon> getDataByID(String id);
    
    boolean saveHoaDonCT(ChiTietHoaDon chiTietHoaDon);
    
    boolean delete(String idHD, String idCTSP);
}
