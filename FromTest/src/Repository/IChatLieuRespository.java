/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.ChatLieu;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IChatLieuRespository {

    List<ChatLieu> getAll();

    boolean add(ChatLieu t);

    boolean delete(String ma);

    boolean update(ChatLieu cv, String ma);
}
