package com.lsn.board.repository;

import com.lsn.board.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CardRepository extends JpaRepository<Card, Long> {
}
