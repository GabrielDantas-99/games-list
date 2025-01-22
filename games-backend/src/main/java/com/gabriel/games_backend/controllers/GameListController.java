package com.gabriel.games_backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.games_backend.dto.GameListDTO;
import com.gabriel.games_backend.services.GameListService;

@RestController
@RequestMapping(value = "/game-list")
public class GameListController {

  @Autowired
  private GameListService gameListService;

  @GetMapping
  public ResponseEntity<List<GameListDTO>> findAll() {
    List<GameListDTO> list = gameListService.findAll();
    return ResponseEntity.ok().body(list);
  }

}
