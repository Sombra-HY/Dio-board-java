package com.lsn.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.smartcardio.Card;

public interface BoardRepository extends JpaRepository<Card, Long> {

}
