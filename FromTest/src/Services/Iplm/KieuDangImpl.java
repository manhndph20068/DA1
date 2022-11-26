/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.KieuDang;
import Repository.Iplm.KieuDangRepository;
import Services.KieuDangService;
import ViewModels.QuanLyKieuDang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class KieuDangImpl implements KieuDangService {

    private KieuDangRepository rp = new KieuDangRepository();

    @Override
    public List<QuanLyKieuDang> getAll() {

        List<QuanLyKieuDang> ds = new ArrayList<>();
        List<KieuDang> list = rp.getAll();

        for (KieuDang cv : list) {
            QuanLyKieuDang vModel = new QuanLyKieuDang(cv.getId(), cv.getMa(), cv.getTen(), cv.getTrangThai());
            ds.add(vModel);
        }

        return ds;

    }

    @Override
    public String add(QuanLyKieuDang t) {

        KieuDang thuongHieu = new KieuDang("", t.getMa(), t.getTen(), t.getTrangThai());
        boolean add = rp.add(thuongHieu);
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
    public String update(QuanLyKieuDang cv, String id) {
        KieuDang thuongHieu = new KieuDang("", cv.getMa(), cv.getTen(), cv.getTrangThai());
        boolean add = rp.update(thuongHieu, id);
        if (add == true) {
            return "sửa thành công";
        } else {
            return " sửa thất bại ";
        }
    }

}
