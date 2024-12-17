package com.example.md4_b1.model;

import java.time.LocalDate;

public class Player {
    private Integer id;
    private String playerCode;
    private String fullName;
    private LocalDate birthDate;
    private String experience;
    private String position;
    private String avatarUrl;

    public Player() {
    }

    public Player(Integer id, String playerCode, String fullName, LocalDate birthDate, String experience, String position, String avatarUrl) {
        this.id = id;
        this.playerCode = playerCode;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.experience = experience;
        this.position = position;
        this.avatarUrl = avatarUrl;
    }

    public Player(String playerCode, String fullName, String birthDate, String experience, String position, String avatarUrl) {
        this.playerCode = playerCode;
        this.fullName = fullName;
        this.birthDate = LocalDate.parse(birthDate);
        this.experience = experience;
        this.position = position;
        this.avatarUrl = avatarUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerCode() {
        return playerCode;
    }

    public void setPlayerCode(String playerCode) {
        this.playerCode = playerCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
