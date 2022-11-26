/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.NhaSanXuat;
import Repository.Iplm.NhaSanXuatRepository;
import ViewModels.QuanLyNhaSanXuat;
import java.util.ArrayList;
import java.util.List;
import Services.INhaSanXuatService;

/**
 *
 * @author admin
 */
public class NhaSanXuatImpl implements INhaSanXuatService {

    private NhaSanXuatRepository rp = new NhaSanXuatRepository();

    @Override
    public List<QuanLyNhaSanXuat> getAll() {
        List<QuanLyNhaSanXuat> ds = new ArrayList<>();
        List<NhaSanXuat> list = rp.getAll();

        for (NhaSanXuat cv : list) {
            QuanLyNhaSanXuat vModel = new QuanLyNhaSanXuat(cv.getId(), cv.getMa(), cv.getTen(), cv.getTrangThai());
            ds.add(vModel);
        }

        return ds;
    }

    @Override
    public String add(QuanLyNhaSanXuat t) {
        NhaSanXuat mauSac = new NhaSanXuat("", t.getMa(), t.getTen(), t.getTrangThai());
        boolean add = rp.add(mauSac);
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
    public String update(QuanLyNhaSanXuat cv, String id) {
        NhaSanXuat sanPham = new NhaSanXuat("", cv.getMa(), cv.getTen(), cv.getTrangThai());
        boolean add = rp.update(sanPham, id);
        if (add == true) {
            return "sửa thành công";
        } else {
            return " sửa thất bại ";
        }
    }

}
