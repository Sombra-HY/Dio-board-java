package com.lsn.board.controller;

import com.lsn.board.dto.CardDto;
import com.lsn.board.model.Board;
import com.lsn.board.model.Card;
import com.lsn.board.model.CollumBoard;
import com.lsn.board.service.ManagerTasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/boards/{id}")
public class TasksController {
    private final ManagerTasksService managerTasksService;

    @PostMapping("/save")
    public ResponseEntity<CollumBoard> addCard(@RequestBody CardDto card, Long idCollum) {
        return ResponseEntity.ok().body(
                managerTasksService.addCard(card,idCollum)
        );
    }

    @DeleteMapping("/save")
    public ResponseEntity<Board> removeCard(Card card, Long idCollum) {
        return ResponseEntity.ok().body(null);
    }

    @PutMapping("/save")
    public ResponseEntity<Board> updateCard(Card card, Long idCollum) {
        return ResponseEntity.ok().body(null);
    }

    @PostMapping("/moveto")
    public ResponseEntity<Board> moveToNextColumm(@PathVariable String id, @RequestBody Long idCollum, @RequestBody Long card) {
        return ResponseEntity.ok().body(null);
    }
}
