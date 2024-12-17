package com.example.md4_b1.repository;

import com.example.md4_b1.model.Player;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepository {
    private static List<Player> playerList = new ArrayList<>();

    static {
        playerList.add(new Player(1, "P001", "Trần Văn A", LocalDate.of(1995, 5, 20), "5 năm", "Tiền đạo", "https://example.com/anh1.jpg"));
        playerList.add(new Player(2, "P002", "Nguyễn Văn B", LocalDate.of(1998, 8, 15), "3 năm", "Hậu vệ", "https://example.com/anh2.jpg"));
        playerList.add(new Player(3, "P003", "Lê Thị C", LocalDate.of(2000, 12, 30), "2 năm", "Thủ môn", "https://example.com/anh3.jpg"));
    }

    public List<Player> findAll() {
        return playerList;
    }

    public void save(Player player) {
        player.setId(playerList.get(playerList.size() - 1).getId() + 1);
        playerList.add(player);
    }

    public void remove(String playerCode) {
        playerList.removeIf(player -> player.getPlayerCode().equals(playerCode));
    }
}
