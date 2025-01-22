package com.gabriel.games_backend.dto;

import com.gabriel.games_backend.entities.Game;

public record GameMinDTO(
    Long id,
    String title,
    Integer year,
    String imgUrl,
    String shortDescription) {

  public GameMinDTO(Game entity) {
    this(
        entity.getId(),
        entity.getTitle(),
        entity.getYear(),
        entity.getImgUrl(),
        entity.getShortDescription());
  }
}
