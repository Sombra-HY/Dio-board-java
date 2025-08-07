package com.lsn.board.service;


import com.lsn.board.dto.BoardDto;
import com.lsn.board.mapper.BoardMapper;
import com.lsn.board.model.Board;

import com.lsn.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;
    private final BoardMapper mapperBoard;

    // delete

    public List<Board> listBoard() {
        return boardRepository.findAll();
    }
    public Board acessBoard(@PathVariable Long id) {
        return boardRepository.findById(id).orElseThrow();
    }
    public Board createBoard(@RequestBody BoardDto boardDto) {
        Board  board = mapperBoard.toBoard(boardDto);
        return boardRepository.save(board);
    }
    public void deleteBoard(@PathVariable Long id) {
        boardRepository.findById(id).ifPresent(board -> boardRepository.deleteById(id));
    }
    public void updateTitetleBoard(@PathVariable Long id, @RequestBody BoardDto boardDto) {
        boardRepository.findById(id).ifPresent(board -> {
            board.setTitle(boardDto.getTitle());
            boardRepository.save(board);
        });
    }
}
