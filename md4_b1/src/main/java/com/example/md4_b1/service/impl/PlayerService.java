package com.example.md4_b1.service.impl;

import com.example.md4_b1.model.Player;
import com.example.md4_b1.repository.PlayerRepository;
import com.example.md4_b1.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService implements IPlayerService {

    @Autowired
    private PlayerRepository playerRepository;


    @Override
    public List<Player> getAll() {
        return playerRepository.findAll();
    }
}
