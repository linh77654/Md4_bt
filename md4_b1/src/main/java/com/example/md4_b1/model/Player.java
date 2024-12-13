package com.example.md4_b1.model;


import java.time.LocalDate;

public class Player {
    private Integer id;
    private String MaCauthu;
    private String HoVaTen;
    private LocalDate NgaySinh;
    private String KinhNghiem;
    private String ViTri;
    private String AnhDaiDien;

    public Player() {
    }

    public Player(Integer id, String maCauthu, String hoVaTen, LocalDate ngaySinh, String kinhNghiem, String viTri, String anhDaiDien) {
        this.id = id;
        MaCauthu = maCauthu;
        HoVaTen = hoVaTen;
        NgaySinh = ngaySinh;
        KinhNghiem = kinhNghiem;
        ViTri = viTri;
        AnhDaiDien = anhDaiDien;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaCauthu() {
        return MaCauthu;
    }

    public void setMaCauthu(String maCauthu) {
        MaCauthu = maCauthu;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        HoVaTen = hoVaTen;
    }

    public LocalDate getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getKinhNghiem() {
        return KinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        KinhNghiem = kinhNghiem;
    }

    public String getViTri() {
        return ViTri;
    }

    public void setViTri(String viTri) {
        ViTri = viTri;
    }

    public String getAnhDaiDien() {
        return AnhDaiDien;
    }

    public void setAnhDaiDien(String anhDaiDien) {
        AnhDaiDien = anhDaiDien;
    }
}
