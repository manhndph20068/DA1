/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.HoaDon;
import Repository.Iplm.HoaDonRepository;
import Services.IHoaDonService;
import ViewModels.HoaDonResponse;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class HoaDonServiceIplm implements IHoaDonService {

    private HoaDonRepository hoaDonRepository = new HoaDonRepository();

    @Override
    public ArrayList<HoaDonResponse> getAll() {
        return hoaDonRepository.getAll();
    }

    @Override
    public String saveHoaDon(HoaDon hoaDon) {
        if (hoaDonRepository.saveHoaDon(hoaDon)) {
            return "Thanh cong";
        } else {
            return "That bai";
        }
    }

    @Override
    public String updateThanhToan(HoaDon hoaDon, String ma) {
        if (hoaDonRepository.updateThanhToan(hoaDon, ma)) {
            return "Thanh cong";
        } else {
            return "That bai";
        }
    }

    @Override
    public ArrayList<HoaDonResponse> getAllByTrangThai(int trangThai) {
        return hoaDonRepository.getAllByTrangThai(trangThai);
    }

    @Override
    public ArrayList<HoaDonResponse> getTTKhByID(String id) {
        return hoaDonRepository.getTTKhByID(id);
    }

    @Override
    public String updateTTKH(HoaDon hoaDon, String id) {
        if (hoaDonRepository.updateTTKH(hoaDon, id)) {
            return "Đã thêm thông tin khách hàng";
        } else {
            return "Chưa thêm đc thông tin khách hàng";
        }
    }

    @Override
    public ArrayList<HoaDonResponse> getTTKhGiaoHangByID(String id) {
        return hoaDonRepository.getTTKhGiaoHangByID(id);
    }

    @Override
    public String updateTTKHGiaoHang(HoaDon hoaDon, String id) {
        if (hoaDonRepository.updateTTKHGiaoHang(hoaDon, id)) {
            return "Đã thêm thông tin khách hàng";
        } else {
            return "Chưa thêm đc thông tin khách hàng";
        }
    }

}
