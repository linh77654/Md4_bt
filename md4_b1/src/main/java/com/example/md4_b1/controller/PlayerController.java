package com.example.md4_b1.controller;

import com.example.md4_b1.model.Player;
import com.example.md4_b1.service.IPlayerService;
import com.example.md4_b1.service.impl.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private IPlayerService playerService;

    @GetMapping("")
    public String viewAllPlayer(Model model) {
        List<Player> playerList = playerService.getAll();
        model.addAttribute("playerList", playerList);
        return "list";
    }
}
