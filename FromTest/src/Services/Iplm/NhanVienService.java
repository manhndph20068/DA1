/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.NhanVien;
import Repository.Iplm.NhanVienRespository;
import Services.INhanVienService;
import ViewModels.QuanLyNhanVien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class NhanVienService implements INhanVienService {

    NhanVienRespository nvr = new NhanVienRespository();

    @Override
    public List<QuanLyNhanVien> getAll() {
        List<NhanVien> nv = nvr.getAll();
        List<QuanLyNhanVien> lstQlNv = new ArrayList<>();
        for (NhanVien ql : nv) {
            QuanLyNhanVien qlnv = new QuanLyNhanVien(ql.getId(), ql.getMa(), ql.getTen(), ql.getGioiTinh(), ql.getNgaySinh(), ql.getDiaChi(), ql.getSoDienThoai(), ql.getChucVu(), ql.getTrangThai(), ql.getTenTaiKhoan(), ql.getMatKhau(), ql.getHinhAnh());
            lstQlNv.add(qlnv);
        }
        return lstQlNv;
    }

    @Override
    public String add(QuanLyNhanVien qlnv) {
        NhanVien nv = new NhanVien(null, qlnv.getMa(), qlnv.getTen(), qlnv.getGioiTinh(), qlnv.getNgaySinh(), qlnv.getDiaChi(), qlnv.getSoDienThoai(), qlnv.getChucVu(), qlnv.getTrangThai(), qlnv.getTenTaiKhoan(), qlnv.getMatKhau(), qlnv.getHinhAnh());
        boolean add = nvr.add(nv);
        if (add == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(QuanLyNhanVien qlnv, String id) {
        NhanVien nv = new NhanVien(null, qlnv.getMa(), qlnv.getTen(), qlnv.getGioiTinh(), qlnv.getNgaySinh(), qlnv.getDiaChi(), qlnv.getSoDienThoai(), qlnv.getChucVu(), qlnv.getTrangThai(), qlnv.getTenTaiKhoan(), qlnv.getMatKhau(), qlnv.getHinhAnh());
        boolean update = nvr.update(nv, id);
        if (update == true) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String delete(String id) {
        boolean delete = nvr.delete(id);
        if (delete == true) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

}
