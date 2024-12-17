package com.example.md4_b1.controller;

import com.example.md4_b1.model.Player;
import com.example.md4_b1.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @GetMapping("/create")
    public String createPlayerForm(Model model) {
        model.addAttribute("player", new Player());
        return "create";
    }

    @PostMapping("/create")
    public String createPlayer(
            @RequestParam String playerCode,
            @RequestParam String fullName,
            @RequestParam String birthDate,
            @RequestParam String experience,
            @RequestParam String position,
            @RequestParam String avatarUrl
    ) {
        Player player = new Player(playerCode, fullName, birthDate, experience, position, avatarUrl);
        playerService.save(player);
        return "redirect:/player";
    }

    @GetMapping("/{playerCode}/delete")
    public String deletePlayer(@PathVariable String playerCode) {
        playerService.remove(playerCode);
        return "redirect:/player";
    }
}
