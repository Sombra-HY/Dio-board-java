package com.lsn.board.repository;

import com.lsn.board.model.CollumBoard;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CollumRepository extends JpaRepository<CollumBoard, Long> {
}
