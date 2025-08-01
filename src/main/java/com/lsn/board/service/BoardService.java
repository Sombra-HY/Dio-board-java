package com.lsn.board.service;


import com.lsn.board.repository.BoardRepository;
import com.lsn.board.repository.CardRepository;
import com.lsn.board.repository.CollumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;
    private final CardRepository cardRepository;
    private final CollumRepository collumRepository;



    public void teste(){
        boardRepository.deleteAll();
    }
}
