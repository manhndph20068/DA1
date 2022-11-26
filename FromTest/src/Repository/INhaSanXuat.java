/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.NhaSanXuat;

import java.util.List;

/**
 *
 * @author admin
 */
public interface INhaSanXuat {

    List<NhaSanXuat> getAll();

    boolean add(NhaSanXuat t);

    boolean delete(String id);

    boolean update(NhaSanXuat cv, String id);

}
