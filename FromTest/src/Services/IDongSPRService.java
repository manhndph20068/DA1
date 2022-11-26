/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.DongSPRResponse;
import ViewModels.KichCoRResponse;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface IDongSPRService {
    ArrayList<DongSPRResponse> getAll();
}
