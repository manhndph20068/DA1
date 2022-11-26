/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import java.util.List;
import ViewModels.QuanLyDongSanPham;

/**
 *
 * @author admin
 */
public interface DongSanPhamService {

    List<QuanLyDongSanPham> getAll();

    String add(QuanLyDongSanPham t);

    String delete(String id);

    String update(QuanLyDongSanPham cv, String id);
}
