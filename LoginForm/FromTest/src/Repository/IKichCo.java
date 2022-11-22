/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.KichCo;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IKichCo {

    List<KichCo> getAll();

    boolean add(KichCo t);

    boolean delete(String id);

    boolean update(KichCo cv, String id);
}
