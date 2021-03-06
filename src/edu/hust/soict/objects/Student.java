/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hust.soict.objects;

import java.sql.Date;

/**
 * Constructor, getter, setter Object Students(define properties, methods).
 *
 * @author quangnd
 */
public class Student {

    private String id_sinh_vien;
    private String ten_sinh_vien;
    private Date ngay_sinh;
    private String lop_hoc;
    private String chuong_trinh_DT;
    private String he_hoc;
    private String trang_thai;
    private String khoa;
     private String department;
    private String email;
    private Double don_vi_HP;

    public Student(String id_sinh_vien, String ten_sinh_vien, Date ngay_sinh, String lop_hoc, String chuong_trinh_DT, String he_hoc, String trang_thai, String khoa, String department, String email, Double don_vi_HP) {
        this.id_sinh_vien = id_sinh_vien;
        this.ten_sinh_vien = ten_sinh_vien;
        this.ngay_sinh = ngay_sinh;
        this.lop_hoc = lop_hoc;
        this.chuong_trinh_DT = chuong_trinh_DT;
        this.he_hoc = he_hoc;
        this.trang_thai = trang_thai;
        this.khoa = khoa;
        this.department = department;
        this.email = email;
        this.don_vi_HP = don_vi_HP;
    }



    public Student(String id_sinh_vien, String ten_sinh_vien, Date ngay_sinh, String email) {
        this.id_sinh_vien = id_sinh_vien;
        this.ten_sinh_vien = ten_sinh_vien;
        this.ngay_sinh = ngay_sinh;
        this.email = email;
    }



    public Student() {
    }

    public String getId_sinh_vien() {
        return id_sinh_vien;
    }

    public void setId_sinh_vien(String id_sinh_vien) {
        this.id_sinh_vien = id_sinh_vien;
    }

    public String getTen_sinh_vien() {
        return ten_sinh_vien;
    }

    public void setTen_sinh_vien(String ten_sinh_vien) {
        this.ten_sinh_vien = ten_sinh_vien;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getLop_hoc() {
        return lop_hoc;
    }

    public void setLop_hoc(String lop_hoc) {
        this.lop_hoc = lop_hoc;
    }

    public String getChuong_trinh_DT() {
        return chuong_trinh_DT;
    }

    public void setChuong_trinh_DT(String chuong_trinh_DT) {
        this.chuong_trinh_DT = chuong_trinh_DT;
    }

    public String getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(String trang_thai) {
        this.trang_thai = trang_thai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getHe_hoc() {
        return he_hoc;
    }

    public void setHe_hoc(String he_hoc) {
        this.he_hoc = he_hoc;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getDon_vi_HP() {
        return don_vi_HP;
    }

    public void setDon_vi_HP(Double don_vi_HP) {
        this.don_vi_HP = don_vi_HP;
    }

}
