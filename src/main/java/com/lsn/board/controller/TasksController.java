package com.lsn.board.controller;

import com.lsn.board.model.Board;
import com.lsn.board.model.Card;
import com.lsn.board.service.ManagerTasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/boards")
public class TasksController {
    private final ManagerTasksService managerTasksService;

    @PostMapping("/{id}/save")
    public ResponseEntity<Board> addCard(@RequestBody Card card, Long idCollum) {
        managerTasksService.addCard(card,idCollum);
        return ResponseEntity.ok().body(null);
    }

    @DeleteMapping("/{id}/save")
    public ResponseEntity<Board> removeCard(Card card, Long idCollum) {
        return ResponseEntity.ok().body(null);
    }

    @PutMapping("/{id}/save")
    public ResponseEntity<Board> updateCard(Card card, Long idCollum) {
        return ResponseEntity.ok().body(null);
    }

    @PostMapping(value = "/{id}/save")
    public ResponseEntity<Board> moveToNextColumm(@PathVariable String id, @RequestBody Long idCollum, @RequestBody Long card) {
        return ResponseEntity.ok().body(null);
    }
}
