/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.ThuongHieu;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IThuongHieu {

    List<ThuongHieu> getAll();

    boolean add(ThuongHieu t);

    boolean delete(String id);

    boolean update(ThuongHieu cv, String id);

}
