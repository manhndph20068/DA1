/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.DongSanPham;
import Repository.Iplm.DongSanPhamRepository;
import Services.DongSanPhamService;
import ViewModels.QuanLyDongSanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class DongSanPhamImpl implements DongSanPhamService {

    private DongSanPhamRepository rp = new DongSanPhamRepository();

    @Override
    public List<QuanLyDongSanPham> getAll() {

        List<QuanLyDongSanPham> ds = new ArrayList<>();
        List<DongSanPham> list = rp.getAll();

        for (DongSanPham cv : list) {
            QuanLyDongSanPham vModel = new QuanLyDongSanPham(cv.getId(), cv.getMa(), cv.getTen(), cv.getTrangThai());
            ds.add(vModel);
        }

        return ds;

    }

    @Override
    public String add(QuanLyDongSanPham t) {

        DongSanPham kichCo = new DongSanPham("", t.getMa(), t.getTen(), t.getTrangThai());
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
    public String update(QuanLyDongSanPham cv, String id) {
        DongSanPham kichCo = new DongSanPham("", cv.getMa(), cv.getTen(), cv.getTrangThai());
        boolean add = rp.update(kichCo, id);
        if (add == true) {
            return "sửa thành công";
        } else {
            return "sửa thất bại ";
        }
    }

}
