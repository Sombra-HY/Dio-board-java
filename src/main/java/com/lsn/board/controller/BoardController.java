package com.lsn.board.controller;

import com.lsn.board.model.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    @GetMapping("/")
    public ResponseEntity<List<Board>> listBoard() {
        return ResponseEntity.ok().body(new ArrayList<Board>());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Board> acessBoard(@PathVariable Long id) {
        return ResponseEntity.ok().body(null);
    }
    @PostMapping("/create")
    public ResponseEntity<Board> createBoard(@RequestBody Board board) {
        return ResponseEntity.ok().body(null);
    }
    @DeleteMapping("/{id}/remove")
    public ResponseEntity<Board> deleteBoard(@PathVariable String id) {
        return ResponseEntity.ok().body(null);
    }
    @PutMapping("/{id}/update")
    public ResponseEntity<Board> updateTitetleBoard(@PathVariable String id, @RequestBody String title) {
        return ResponseEntity.ok().body(null);
    }

    @PostMapping("/{id}/addCard")
    public ResponseEntity<Board> addCard(@PathVariable String id, @RequestBody Card card, Long idCollum) {
        return ResponseEntity.ok().body(null);
    }

}
