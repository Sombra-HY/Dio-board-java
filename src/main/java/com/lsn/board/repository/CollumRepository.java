package com.lsn.board.repository;

import org.springframework.data.repository.CrudRepository;

import javax.smartcardio.Card;

public interface CollumRepository extends CrudRepository<Card, Long> {
}
