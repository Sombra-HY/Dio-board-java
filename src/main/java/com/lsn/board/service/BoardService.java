package com.lsn.board.service;


import com.lsn.board.model.Board;
import com.lsn.board.model.Card;

import com.lsn.board.model.CollumBoard;
import com.lsn.board.repository.BoardRepository;
import com.lsn.board.repository.CollumRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;
    private final CollumRepository collumRepository;

    // delete

    public List<Board> listBoard() {
        return boardRepository.findAll();
    }
    public Board acessBoard(@PathVariable Long id) {
        if(boardRepository.existsById(id)) {
            return boardRepository.findById(id).get();
        }

        return null;
    }
    public Board createBoard(@RequestBody Board board) {
        return boardRepository.save(board);
    }
    public void deleteBoard(@PathVariable Long id) {
        if (boardRepository.existsById(id)) {
            boardRepository.deleteById(id);
            return;
        }
        return;
    }
    public void updateTitetleBoard(@PathVariable Long id, @RequestBody String title) {
        if(boardRepository.existsById(id)){
            var board = boardRepository.findById(id).get();
            board.setTitle(title);
            boardRepository.save(board);
            return;
        }

        return;
    }
    public CollumBoard addCard(Card card, Long idCollum) {
        Optional<CollumBoard> collumOptional = collumRepository.findById(idCollum);
        if (collumOptional.isPresent()) {
            var col =  collumOptional.get();
            col.getCardList().add(card);
            collumRepository.save(col);
        }
        return null;
    }
    public ResponseEntity<Board> moveToNextColumm(@PathVariable String id, @RequestBody Long idCollum, @RequestBody Long card) {
        return ResponseEntity.ok().body(null);
    }









}
