/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.DanhSachSanPhamResponse;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface IDanhSAchSanPhamService {

    ArrayList<DanhSachSanPhamResponse> getAll();

    String updateSoLuongSP(DanhSachSanPhamResponse dsspr, String id);

    ArrayList<DanhSachSanPhamResponse> getSoLuongById(String id);

    ArrayList<DanhSachSanPhamResponse> getAllByTheLoai(String tenTH,String tenKC,String tenDongSp);
}
