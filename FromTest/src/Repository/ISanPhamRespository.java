/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.SanPham;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface ISanPhamRespository {

    List<SanPham> getAll();

    boolean add(SanPham sp);

    boolean update(SanPham sp, String id);

    boolean delete(String id);

    List<SanPham> getMaSp(String ma);

    List<SanPham> getTenSp(String ten);
}
