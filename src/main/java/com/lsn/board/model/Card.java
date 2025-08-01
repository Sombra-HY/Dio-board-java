package com.lsn.board.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
class Card {
    @Id
    private Long id;
    private String title;
    private String description;

    private Boolean isBlock;
    private List<LocalTime> listDate;
}
