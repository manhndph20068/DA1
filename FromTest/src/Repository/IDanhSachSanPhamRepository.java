/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import ViewModels.DanhSachSanPhamResponse;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface IDanhSachSanPhamRepository {

    ArrayList<DanhSachSanPhamResponse> getAll();

    boolean updateSoLuongSP(DanhSachSanPhamResponse dsspr, String id);

    ArrayList<DanhSachSanPhamResponse> getSoLuongById(String id);

    ArrayList<DanhSachSanPhamResponse> getAllByTheLoai(String tenTH,String tenKC,String tenDongSp);
}
