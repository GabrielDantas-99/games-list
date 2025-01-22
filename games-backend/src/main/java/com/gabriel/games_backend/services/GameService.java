package com.gabriel.games_backend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.games_backend.dto.GameMinDTO;
import com.gabriel.games_backend.entities.Game;
import com.gabriel.games_backend.repositories.GameRepository;

@Service
public class GameService {

  @Autowired
  public GameRepository gameRepository;

  public List<GameMinDTO> findAll() {
    List<Game> gameList = gameRepository.findAll();
    return gameList.stream().map(entity -> new GameMinDTO(entity)).collect(Collectors.toList());
  }
}
