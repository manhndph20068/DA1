/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;


import DomainModel.KieuDang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IKieuDang {

    List<KieuDang> getAll();

    boolean add(KieuDang t);

    boolean delete(String id);

    boolean update(KieuDang cv, String id);

}
