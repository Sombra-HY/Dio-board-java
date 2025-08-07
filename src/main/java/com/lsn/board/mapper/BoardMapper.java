package com.lsn.board.mapper;
import com.lsn.board.dto.BoardDto;
import com.lsn.board.model.Board;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoardMapper {
    Board toBoard(BoardDto boardDto);

}

