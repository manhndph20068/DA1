/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;


import Repository.Iplm.DanhSachSanPhamRepository;
import Services.IDanhSAchSanPhamService;
import ViewModels.DanhSachSanPhamResponse;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DanhSachSanPhamService implements IDanhSAchSanPhamService {

    private DanhSachSanPhamRepository danhSachSanPhamRepository = new DanhSachSanPhamRepository();

    @Override
    public ArrayList<DanhSachSanPhamResponse> getAll() {
        return danhSachSanPhamRepository.getAll();
    }

    @Override
    public String updateSoLuongSP(DanhSachSanPhamResponse dsspr, String id) {
        if (danhSachSanPhamRepository.updateSoLuongSP(dsspr, id)) {
            return "Đã cập nhật lại số lượng tồn kho";
        } else {
            return "Cập nhật kho hàng thất bại";
        }
    }

    @Override
    public ArrayList<DanhSachSanPhamResponse> getSoLuongById(String id) {
        return danhSachSanPhamRepository.getSoLuongById(id);
    }

    @Override
    public ArrayList<DanhSachSanPhamResponse> getAllByTheLoai(String tenTH,String tenKC,String tenDongSp) {
        return danhSachSanPhamRepository.getAllByTheLoai(tenTH, tenKC, tenDongSp);
    }
}
