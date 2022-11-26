/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.ChatLieu;
import Repository.Iplm.ChatLieurepository;
import ViewModels.QuanLyChatLieu;
import java.util.ArrayList;
import java.util.List;
import Services.IChatLieuService;

/**
 *
 * @author admin
 */
public class ChatLieuService implements IChatLieuService {

    private ChatLieurepository rp = new ChatLieurepository();

    @Override
    public List<QuanLyChatLieu> getAll() {

        List<QuanLyChatLieu> ds = new ArrayList<>();
        List<ChatLieu> list = rp.getAll();

        for (ChatLieu cv : list) {
            QuanLyChatLieu vModel = new QuanLyChatLieu(cv.getId(), cv.getMa(), cv.getDaChinh(), cv.getDaPhu(), cv.getDeNgoai(), cv.getLopLotTrong(), cv.getTrangThai());
            ds.add(vModel);
        }

        return ds;

    }

    @Override
    public String add(QuanLyChatLieu t) {

        ChatLieu ChatLieu = new ChatLieu("", t.getMa(), t.getDaChinh(), t.getDaPhu(), t.getDeNgoai(), t.getLopLotTrong(), t.getTrangThai());
        boolean add = rp.add(ChatLieu);
        if (add == true) {
            return "thêm thành công";
        } else {
            return " thêm thất bại ";
        }
    }

    @Override
    public String delete(String ma) {
        boolean add = rp.delete(ma);
        if (add == true) {
            return "xóa thành công";
        } else {
            return "xóa thất bại ";
        }
    }

    @Override
    public String update(QuanLyChatLieu cv, String ma) {
        ChatLieu ChatLieu = new ChatLieu("", cv.getMa(), cv.getDaChinh(), cv.getDaPhu(), cv.getDeNgoai(), cv.getLopLotTrong(), cv.getTrangThai());
        boolean add = rp.update(ChatLieu, ma);
        if (add == true) {
            return "Sửa thành công";
        } else {
            return " Sửa thất bại ";
        }
    }

}
