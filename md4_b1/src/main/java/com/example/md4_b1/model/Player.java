package com.example.md4_b1.model;

import java.time.LocalDate;

public class Player {
    private Integer id;
    private String maCauthu;
    private String hoVaTen;
    private LocalDate ngaySinh;
    private String kinhNghiem;
    private String viTri;
    private String anhDaiDien;

    public Player() {
    }

    public Player(Integer id, String maCauthu, String hoVaTen, LocalDate ngaySinh, String kinhNghiem, String viTri, String anhDaiDien) {
        this.id = id;
        this.maCauthu = maCauthu;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.kinhNghiem = kinhNghiem;
        this.viTri = viTri;
        this.anhDaiDien = anhDaiDien;
    }

    public Player(String maCauthu, String hoVaTen, LocalDate ngaySinh, String kinhNghiem, String viTri, String anhDaiDien) {
        this.maCauthu = maCauthu;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.kinhNghiem = kinhNghiem;
        this.viTri = viTri;
        this.anhDaiDien = anhDaiDien;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaCauthu() {
        return maCauthu;
    }

    public void setMaCauthu(String maCauthu) {
        this.maCauthu = maCauthu;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getAnhDaiDien() {
        return anhDaiDien;
    }

    public void setAnhDaiDien(String anhDaiDien) {
        this.anhDaiDien = anhDaiDien;
    }
}
