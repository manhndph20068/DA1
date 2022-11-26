/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QuanLySanPham;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface ISanPhamService {

    List<QuanLySanPham> getAll();

    String add(QuanLySanPham qlsp);

    String update(QuanLySanPham qlsp, String id);

    String delete(String id);

    List<QuanLySanPham> getMaSp(String ma);

    List<QuanLySanPham> getTenSp(String ten);
}
