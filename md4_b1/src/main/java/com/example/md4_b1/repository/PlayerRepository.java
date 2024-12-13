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
        playerList.add(new Player(1, "P001", "Trần Văn A", LocalDate.of(1995, 5, 20), "5 năm", "Tiền đạo", "https://cdn.tuoitre.vn/thumb_w/1200/2022/11/17/gavi-anh-fc-barcelona-16686814108431318625862.jpg"));
        playerList.add(new Player(2, "P002", "Nguyễn Văn B", LocalDate.of(1998, 8, 15), "3 năm", "Hậu vệ", "https://cdn.tuoitre.vn/2022/11/17/moukoko-anh-getty-images-1668681635430837657256.jpg"));
        playerList.add(new Player(3, "P003", "Lê Thị C", LocalDate.of(2000, 12, 30), "2 năm", "Thủ môn", "https://cdn.tuoitre.vn/2022/11/17/musiala-anh-getty-images-16686817985761803792191.jpg"));
    }

    public List<Player> findAll() {
        return playerList;
    }
}
