package com.lsn.board.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CollumBoard> collumBoardList;

}


