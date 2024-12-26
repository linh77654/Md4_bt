package com.example.md4_b1.repository;

import com.example.md4_b1.model.Player;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepository {

    private static List<Player> players = new ArrayList<>();

//    static {
//        players.add(new Player(1, "P001", "Trần Văn A", LocalDate.of(1995, 5, 20), "5 năm", "Tiền đạo", "https://example.com/anh1.jpg"));
//        players.add(new Player(2, "P002", "Nguyễn Văn B", LocalDate.of(1998, 8, 15), "3 năm", "Hậu vệ", "https://example.com/anh2.jpg"));
//        players.add(new Player(3, "P003", "Lê Thị C", LocalDate.of(2000, 12, 30), "2 năm", "Thủ môn", "https://example.com/anh3.jpg"));
//    }

    public List<Player> findAll() {
        List<Player> players = BaseRepository.entityManager.createQuery("from player", Player.class).getResultList();
        return players;
    }

    public void save(Player player) {
        EntityTransaction transaction = BaseRepository.entityManager.getTransaction();
        transaction.begin();
        BaseRepository.entityManager.persist(player);
        transaction.commit();
    }

    public void remove(int id) {
        EntityTransaction transaction = BaseRepository.entityManager.getTransaction();
        transaction.begin();
        Player player = BaseRepository.entityManager.find(Player.class, id);
        if (player != null) {
            BaseRepository.entityManager.remove(player);
        }
        transaction.commit();
    }
}
//    public void save(Player player) {
//        player.setId(players.get(players.size() - 1).getId() + 1);
//        players.add(player);
//    }

//    public void remove(int id) {
//        for (int i = 0; i < players.size(); i++) {
//            if (players.get(i).getPlayerCode().equals(id)) {
//                players.remove(i);
//                break;
//            }
//        }
//    }

