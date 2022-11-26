/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.SanPham;
import Repository.Iplm.SanPhamRespository;
import Services.ISanPhamService;
import ViewModels.QuanLySanPham;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class SanPhamServiceIplm implements ISanPhamService {
    
    SanPhamRespository spr = new SanPhamRespository();
    
    @Override
    public List<QuanLySanPham> getAll() {
        List<SanPham> sp = spr.getAll();
        List<QuanLySanPham> lstSp = new ArrayList<>();
        for (SanPham spql : sp) {
            QuanLySanPham ql = new QuanLySanPham(spql.getId(), spql.getMa(), spql.getTen(), spql.getTrangThai());
            lstSp.add(ql);
        }
        return lstSp;
    }
    
    @Override
    public String add(QuanLySanPham qlsp) {
        SanPham sp = new SanPham(null, qlsp.getMa(), qlsp.getTen(), qlsp.getTrangThai());
        boolean add = spr.add(sp);
        if (add == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }
    
    @Override
    public String update(QuanLySanPham qlsp, String id) {
        SanPham sp = new SanPham(null, qlsp.getMa(), qlsp.getTen(), qlsp.getTrangThai());
        boolean update = spr.update(sp, id);
        if (update == true) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }
    
    @Override
    public String delete(String id) {
        boolean delete = spr.delete(id);
        if (delete == true) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }
    
    @Override
    public List<QuanLySanPham> getMaSp(String ma) {
        List<SanPham> sp = spr.getMaSp(ma);
        List<QuanLySanPham> lstSp = new ArrayList<>();
        for (SanPham spql : sp) {
            QuanLySanPham ql = new QuanLySanPham(spql.getId(), spql.getMa(), spql.getTen(), spql.getTrangThai());
            lstSp.add(ql);
        }
        return lstSp;
    }
    
    @Override
    public List<QuanLySanPham> getTenSp(String ten) {
        List<SanPham> sp = spr.getTenSp(ten);
        List<QuanLySanPham> lstSp = new ArrayList<>();
        for (SanPham spql : sp) {
            QuanLySanPham ql = new QuanLySanPham(spql.getId(), spql.getMa(), spql.getTen(), spql.getTrangThai());
            lstSp.add(ql);
        }
        return lstSp;
    }
    
}
