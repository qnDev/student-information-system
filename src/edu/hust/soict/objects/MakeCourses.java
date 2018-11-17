/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hust.soict.objects;

import java.sql.Date;
/**
 *
 * @author quangnd
 */
public class MakeCourses {

    private String ma_lop_DK;
    private String bat_dau;
    private String ket_thuc;
    private String thu;
    private String tuan_hoc;
    private String loai_lop;
    private String ma_mon_hoc;
    private String nhom;
    private String phong_hoc;
    private Integer max_DK;
    private String hoc_ki;
    private Date thoi_han_DK;

    public MakeCourses(String ma_lop_DK, String bat_dau, String ket_thuc, String thu, String tuan_hoc, String loai_lop, String ma_mon_hoc, String nhom, String phong_hoc, Integer max_DK, String hoc_ki, Date thoi_han_DK) {
        this.ma_lop_DK = ma_lop_DK;
        this.bat_dau = bat_dau;
        this.ket_thuc = ket_thuc;
        this.thu = thu;
        this.tuan_hoc = tuan_hoc;
        this.loai_lop = loai_lop;
        this.ma_mon_hoc = ma_mon_hoc;
        this.nhom = nhom;
        this.phong_hoc = phong_hoc;
        this.max_DK = max_DK;
        this.hoc_ki = hoc_ki;
        this.thoi_han_DK = thoi_han_DK;
    }

    public MakeCourses() {
    }

    public String getMa_lop_DK() {
        return ma_lop_DK;
    }

    public void setMa_lop_DK(String ma_lop_DK) {
        this.ma_lop_DK = ma_lop_DK;
    }

    public String getBat_dau() {
        return bat_dau;
    }

    public void setBat_dau(String bat_dau) {
        this.bat_dau = bat_dau;
    }

    public String getKet_thuc() {
        return ket_thuc;
    }

    public void setKet_thuc(String ket_thuc) {
        this.ket_thuc = ket_thuc;
    }

    public String getThu() {
        return thu;
    }

    public void setThu(String thu) {
        this.thu = thu;
    }

    public String getTuan_hoc() {
        return tuan_hoc;
    }

    public void setTuan_hoc(String tuan_hoc) {
        this.tuan_hoc = tuan_hoc;
    }

    public String getLoai_lop() {
        return loai_lop;
    }

    public void setLoai_lop(String loai_lop) {
        this.loai_lop = loai_lop;
    }

    public String getMa_mon_hoc() {
        return ma_mon_hoc;
    }

    public void setMa_mon_hoc(String ma_mon_hoc) {
        this.ma_mon_hoc = ma_mon_hoc;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getPhong_hoc() {
        return phong_hoc;
    }

    public void setPhong_hoc(String phong_hoc) {
        this.phong_hoc = phong_hoc;
    }

    public Integer getMax_DK() {
        return max_DK;
    }

    public void setMax_DK(Integer max_DK) {
        this.max_DK = max_DK;
    }

    public String getHoc_ki() {
        return hoc_ki;
    }

    public void setHoc_ki(String hoc_ki) {
        this.hoc_ki = hoc_ki;
    }

    public Date getThoi_han_DK() {
        return thoi_han_DK;
    }

    public void setThoi_han_DK(Date thoi_han_DK) {
        this.thoi_han_DK = thoi_han_DK;
    }



    
}
