package com.lsn.board.mapper;
import com.lsn.board.dto.BoardDto;
import com.lsn.board.dto.CardDto;
import com.lsn.board.model.Board;
import com.lsn.board.model.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface BoardMapper {

    Board toBoard(BoardDto boardDto);
    Card toCard(CardDto cardDto);
}

