/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author Admin
 */
public class DanhSachSanPhamResponse {

    private String id;
    private String maSp;
    private String tenSp;
    private int namBH;
    private String kichCo;
    private String moTa;
    private int soLuong;
    private float giaNhap;
    private float giaBan;
    private String hinhAnh;
    private String qrCode;

    public DanhSachSanPhamResponse() {
    }

    public DanhSachSanPhamResponse(String id, String maSp, String tenSp, int namBH, String moTa, int soLuong, float giaNhap, float giaBan) {
        this.id = id;
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.namBH = namBH;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public DanhSachSanPhamResponse(String id, String maSp, String tenSp, int namBH, String kichCo, int soLuong, float giaNhap, float giaBan, String hinhAnh, String qrCode) {
        this.id = id;
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.namBH = namBH;
        this.kichCo = kichCo;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.hinhAnh = hinhAnh;
        this.qrCode = qrCode;
    }

    public String getKichCo() {
        return kichCo;
    }

    public void setKichCo(String kichCo) {
        this.kichCo = kichCo;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
    
    

    public DanhSachSanPhamResponse(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

}
