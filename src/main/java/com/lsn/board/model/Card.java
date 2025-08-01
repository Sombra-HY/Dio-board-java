package com.lsn.board.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Card {
    @Id
    private Long id;
    private String title;
    private String description;

    private Boolean isBlock;
    private List<LocalTime> listDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "collumBoard_id")
    private CollumBoard collumBoard;

}
