/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import Repository.Iplm.DongSPRRepository;
import Services.IDongSPRService;
import ViewModels.DongSPRResponse;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DongSPRService implements IDongSPRService {

    private DongSPRRepository dongSPRRepository = new DongSPRRepository();

    @Override
    public ArrayList<DongSPRResponse> getAll() {
        return dongSPRRepository.getAll();
    }

}
