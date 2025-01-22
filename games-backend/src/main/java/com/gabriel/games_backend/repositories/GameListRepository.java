package com.gabriel.games_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.games_backend.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
