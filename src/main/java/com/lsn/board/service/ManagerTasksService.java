package com.lsn.board.service;

import com.lsn.board.dto.CardDto;
import com.lsn.board.mapper.BoardMapper;
import com.lsn.board.model.Board;
import com.lsn.board.model.CollumBoard;
import com.lsn.board.repository.CollumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


@RequiredArgsConstructor
@Service
public class ManagerTasksService {
    private final CollumRepository collumRepository;
    private final BoardMapper boardMapper;

    public CollumBoard addCard(CardDto card, Long idCollum) {
        CollumBoard collum = collumRepository.findById(idCollum)
                .orElseThrow();

        collum.getCardList().add(boardMapper.toCard(card));
        return collumRepository.save(collum);
    }

    public ResponseEntity<Board> moveToNextColumm(@PathVariable String id, @RequestBody Long idCollum, @RequestBody Long card) {
        return ResponseEntity.ok().body(null);
    }
}
