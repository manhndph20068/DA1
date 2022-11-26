/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import Repository.Iplm.ThuongHieuRRepository;
import Services.IThuongHieuRService;
import ViewModels.ThuongHieuRResponse;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ThuongHieuRService implements IThuongHieuRService {

    private ThuongHieuRRepository thuongHieuRRepository = new ThuongHieuRRepository();

    @Override
    public ArrayList<ThuongHieuRResponse> getAll() {
        return thuongHieuRRepository.getAll();
    }

}
