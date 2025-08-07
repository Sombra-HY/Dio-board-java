package com.lsn.board.controller;

import com.lsn.board.model.Board;
import com.lsn.board.model.Card;
import com.lsn.board.service.BoardService;
import com.lsn.board.service.ManagerTasksService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {
    private final BoardService boardService;
    private final ManagerTasksService managerTasksService;

    @GetMapping("")
    public ResponseEntity<List<Board>> listBoard() {
        return ResponseEntity.ok().body(boardService.listBoard());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Board> acessBoard(@PathVariable Long id) {
        return ResponseEntity.ok().body(boardService.acessBoard(id));
    }
    @PostMapping("")
    public ResponseEntity<Board> createBoard(@RequestBody Board board) {
        return ResponseEntity.ok().body(boardService.createBoard(board));
    }
    @DeleteMapping("")
    public ResponseEntity<Void> deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
        return ResponseEntity.ok().body(null);
    }
    @PutMapping("")
    public ResponseEntity<Void> updateTitetleBoard(@PathVariable Long id, @RequestBody String title) {
        boardService.updateTitetleBoard(id, title);
        return ResponseEntity.ok().body(null);
    }
    @PostMapping("/{id}/addCard")
    public ResponseEntity<Board> addCard(@RequestBody Card card, Long idCollum) {
        managerTasksService.addCard(card,idCollum);
        return ResponseEntity.ok().body(null);
    }
    @PostMapping("/{id}/")
    public ResponseEntity<Board> moveToNextColumm(@PathVariable String id, @RequestBody Long idCollum, @RequestBody Long card) {
        return ResponseEntity.ok().body(null);
    }
}


