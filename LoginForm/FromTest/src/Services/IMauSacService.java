/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QuanLyMauSac;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IMauSacService {

    List<QuanLyMauSac> getAll();

    String add(QuanLyMauSac qlms);

    String update(QuanLyMauSac qlms, String id);

    String delete(String id);
}
