package com.example.md4_b1.service;

import com.example.md4_b1.model.Player;

import java.util.List;

public interface IPlayerService {
    List<Player> getAll();

    void save(Player player);
}
