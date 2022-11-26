/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import Repository.Iplm.KichCoRRepository;
import Services.IKichCoRService;
import ViewModels.KichCoRResponse;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class KichCoRService implements IKichCoRService {

    private KichCoRRepository kichCoRRepository = new KichCoRRepository();

    @Override
    public ArrayList<KichCoRResponse> getAll() {
        return kichCoRRepository.getAll();
    }

}
