/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import java.util.List;
import ViewModels.QuanLyKichco;

/**
 *
 * @author admin
 */
public interface IKichCoService {

    List<QuanLyKichco> getAll();

    String add(QuanLyKichco t);

    String delete(String id);

    String update(QuanLyKichco cv, String id);
}
