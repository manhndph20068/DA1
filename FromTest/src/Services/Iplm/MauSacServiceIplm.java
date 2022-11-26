/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.MauSac;
import Repository.Iplm.mauSacRespository;
import Services.IMauSacService;
import ViewModels.QuanLyMauSac;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class MauSacServiceIplm implements IMauSacService {

    mauSacRespository msr = new mauSacRespository();

    @Override
    public List<QuanLyMauSac> getAll() {

        List<MauSac> lst = msr.getAll();
        List<QuanLyMauSac> lstQl = new ArrayList<>();

        for (MauSac ql : lst) {
            QuanLyMauSac qlms = new QuanLyMauSac(ql.getId(), ql.getMa(), ql.getTen(), ql.getTrangThai());
            lstQl.add(qlms);
        }

        return lstQl;
    }

    @Override
    public String add(QuanLyMauSac qlms) {
        MauSac ms = new MauSac(null, qlms.getMa(), qlms.getTen(), qlms.getTrangThai());
        boolean add = msr.add(ms);
        if (add == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(QuanLyMauSac qlms, String id) {
        MauSac ms = new MauSac(null, qlms.getMa(), qlms.getTen(), qlms.getTrangThai());
        boolean update = msr.update(ms, id);
        if (update == true) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = msr.delete(id);
        if (delete == true) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

}
