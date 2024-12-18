package com.example.md4_b1.controller;

import com.example.md4_b1.model.Player;
import com.example.md4_b1.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private IPlayerService playerService;

    @GetMapping("")
    public String viewAllPlayer(Model model) {
        model.addAttribute("playerList", playerService.getAll());
        return "player/list";
    }

    @GetMapping("/create")
    public String createPlayerForm(Model model) {
        model.addAttribute("player", new Player());
        model.addAttribute("positions", new String[] {"Forward", "Midfielder", "Defender", "Goalkeeper"});
        return "player/create";
    }

    @PostMapping("/create")
    public String createPlayer(
            @ModelAttribute("player") Player player,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes,
            Model model
    ) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("positions", new String[] {"Forward", "Midfielder", "Defender", "Goalkeeper"});
            return "player/create";
        }
        playerService.save(player);
        redirectAttributes.addFlashAttribute("message", "Create player successfully!");
        return "redirect:/player";
    }

    @GetMapping("/{playerCode}/delete")
    public String deletePlayer(@PathVariable String playerCode, RedirectAttributes redirectAttributes) {
        playerService.remove(playerCode);
        redirectAttributes.addFlashAttribute("message", "Delete player successfully!");
        return "redirect:/player";
    }
}
