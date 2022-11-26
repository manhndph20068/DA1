/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import java.util.List;
import ViewModels.QuanLyChatLieu;

/**
 *
 * @author admin
 */
public interface IChatLieuService {

    List<QuanLyChatLieu> getAll();

    String add(QuanLyChatLieu t);

    String delete(String ma);

    String update(QuanLyChatLieu cv, String ma);
}
