/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import java.util.List;

import ViewModels.QuanLyThuongHieu;

/**
 *
 * @author admin
 */
public interface IThuongHieuService {

    List<QuanLyThuongHieu> getAll();

    String add(QuanLyThuongHieu t);

    String delete(String id);

    String update(QuanLyThuongHieu cv, String id);

}
