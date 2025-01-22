package com.gabriel.games_backend.dto;

import com.gabriel.games_backend.entities.GameList;

public record GameListDTO(
    Long id,
    String name) {
  public GameListDTO(GameList entity) {
    this(entity.getId(), entity.getName());
  }
}
