package com.gabriel.games_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.games_backend.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
