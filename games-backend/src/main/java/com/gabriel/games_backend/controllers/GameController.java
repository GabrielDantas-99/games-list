package com.gabriel.games_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.games_backend.dto.GameDTO;
import com.gabriel.games_backend.dto.GameMinDTO;
import com.gabriel.games_backend.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

  @Autowired
  private GameService gameService;

  @GetMapping
  public ResponseEntity<List<GameMinDTO>> findAll() {
    List<GameMinDTO> list = gameService.findAll();
    return ResponseEntity.ok().body(list);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<GameDTO> findById(@PathVariable Long id) {
    GameDTO obj = gameService.findById(id);
    return ResponseEntity.ok().body(obj);
  }

}
