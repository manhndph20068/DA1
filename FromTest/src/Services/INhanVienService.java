/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QuanLyNhanVien;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface INhanVienService {

    List<QuanLyNhanVien> getAll();

    String add(QuanLyNhanVien qlnv);

    String update(QuanLyNhanVien qlnv, String id);

    String delete(String id);
}
