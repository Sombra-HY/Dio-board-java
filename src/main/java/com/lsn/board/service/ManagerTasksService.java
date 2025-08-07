package com.lsn.board.service;

import com.lsn.board.model.Board;
import com.lsn.board.model.Card;
import com.lsn.board.model.CollumBoard;
import com.lsn.board.repository.CollumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ManagerTasksService {
    private final CollumRepository collumRepository;



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
