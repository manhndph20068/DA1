/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.DongSanPham;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IDongSanPham {

    List<DongSanPham> getAll();

    boolean add(DongSanPham t);

    boolean delete(String id);

    boolean update(DongSanPham cv, String id);
}
