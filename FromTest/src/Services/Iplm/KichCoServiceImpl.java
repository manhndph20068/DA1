/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.KichCo;
import Repository.Iplm.KichCorepository;
import Services.IKichCoService;
import ViewModels.QuanLyKichco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class KichCoServiceImpl implements IKichCoService {

    private KichCorepository rp = new KichCorepository();

    @Override
    public List<QuanLyKichco> getAll() {

        List<QuanLyKichco> ds = new ArrayList<>();
        List<KichCo> list = rp.getAll();

        for (KichCo cv : list) {
            QuanLyKichco vModel = new QuanLyKichco(cv.getId(), cv.getMa(), cv.getTen(), cv.getTrangThai());
            ds.add(vModel);
        }

        return ds;

    }

    @Override
    public String add(QuanLyKichco t) {

        KichCo kichCo = new KichCo("", t.getMa(), t.getTen(), t.getTrangThai());
        boolean add = rp.add(kichCo);
        if (add == true) {
            return "thêm thành công";
        } else {
            return " thêm thất bại ";
        }
    }

    @Override
    public String delete(String id) {
        boolean add = rp.delete(id);
        if (add == true) {
            return "xóa thành công";
        } else {
            return "xóa thất bại ";
        }
    }

    @Override
    public String update(QuanLyKichco cv, String id) {
        KichCo kichCo = new KichCo("", cv.getMa(), cv.getTen(), cv.getTrangThai());
        boolean add = rp.update(kichCo, id);
        if (add == true) {
            return "Sửa thành công";
        } else {
            return " Sửa thất bại ";
        }
    }

}
