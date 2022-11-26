/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import java.util.List;
import ViewModels.QuanLyNhaSanXuat;

/**
 *
 * @author admin
 */
public interface INhaSanXuatService {

    List<QuanLyNhaSanXuat> getAll();

    String add(QuanLyNhaSanXuat t);

    String delete(String id);

    String update(QuanLyNhaSanXuat cv, String id);

}
