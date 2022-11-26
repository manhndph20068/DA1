/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.MauSac;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IMauSac {

    List<MauSac> getAll();

    boolean add(MauSac ms);

    boolean update(MauSac ms, String id);

    boolean delete(String id);
}
