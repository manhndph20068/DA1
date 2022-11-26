/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Vector;

/**
 *
 * @author admin
 */
public class QuanLyChatLieu {

    private String id;
    private String ma;
    private String daChinh;
    private String daPhu;
    private String deNgoai;
    private String lopLotTrong;
    private int trangThai;

    public QuanLyChatLieu() {
    }

    public QuanLyChatLieu(String id, String ma, String daChinh, String daPhu, String deNgoai, String lopLotTrong, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.daChinh = daChinh;
        this.daPhu = daPhu;
        this.deNgoai = deNgoai;
        this.lopLotTrong = lopLotTrong;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getDaChinh() {
        return daChinh;
    }

    public void setDaChinh(String daChinh) {
        this.daChinh = daChinh;
    }

    public String getDaPhu() {
        return daPhu;
    }

    public void setDaPhu(String daPhu) {
        this.daPhu = daPhu;
    }

    public String getDeNgoai() {
        return deNgoai;
    }

    public void setDeNgoai(String deNgoai) {
        this.deNgoai = deNgoai;
    }

    public String getLopLotTrong() {
        return lopLotTrong;
    }

    public void setLopLotTrong(String lopLotTrong) {
        this.lopLotTrong = lopLotTrong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "QuanLyChatLieu{" + "id=" + id + ", ma=" + ma + ", daChinh=" + daChinh + ", daPhu=" + daPhu + ", deNgoai=" + deNgoai + ", lopLotTrong=" + lopLotTrong + ", trangThai=" + trangThai + '}';
    }

    public Object[] todata() {
        return new Object[]{id, ma, daChinh,daPhu,deNgoai,lopLotTrong, trangThai == 0 ? "còn hàng" : "hết hàng"};
    }

    
}
