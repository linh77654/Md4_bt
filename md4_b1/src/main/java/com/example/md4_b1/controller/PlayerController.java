package com.example.md4_b1.controller;

import com.example.md4_b1.model.Player;
import com.example.md4_b1.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
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
                               @RequestParam String maCauthu,
                               @RequestParam String hoVaTen,
                               @RequestParam String ngaySinh,
                               @RequestParam String kinhNghiem,
                               @RequestParam String viTri,
                               @RequestParam String anhDaiDien

                               ){
        Player player = new Player( maCauthu, hoVaTen, ngaySinh, kinhNghiem, viTri, anhDaiDien);
        playerService.save(player);

        return "redirect:/player";
    }
}
