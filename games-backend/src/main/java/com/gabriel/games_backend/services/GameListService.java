package com.gabriel.games_backend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabriel.games_backend.dto.GameListDTO;
import com.gabriel.games_backend.entities.GameList;
import com.gabriel.games_backend.repositories.GameListRepository;

@Service
public class GameListService {

  @Autowired
  public GameListRepository gamelistRepository;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> gameList = gamelistRepository.findAll();
    return gameList.stream().map(entity -> new GameListDTO(entity)).collect(Collectors.toList());
  }

}
