package com.lsn.board.controller;

import com.lsn.board.dto.BoardDto;
import com.lsn.board.model.Board;
import com.lsn.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardManagerController {
    private final BoardService boardService;

    @GetMapping("")
    public ResponseEntity<List<Board>> listBoard() {
        return ResponseEntity.ok().body(boardService.listBoard());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Board> acessBoard(@PathVariable Long id) {
        return ResponseEntity.ok().body(boardService.acessBoard(id));
    }
    @PostMapping("")
    public ResponseEntity<Board> createBoard(@RequestBody BoardDto board) {
        return ResponseEntity.ok().body(boardService.createBoard(board));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateTitetleBoard(@PathVariable Long id, @RequestBody BoardDto title) {
        boardService.updateTitetleBoard(id, title);
        return ResponseEntity.noContent().build();
    }

}


