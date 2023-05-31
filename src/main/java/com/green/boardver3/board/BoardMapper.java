package com.green.boardver3.board;

import com.green.boardver3.board.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardInsDto dto);
//    List<BoardListVo> selBoardList(BoardDto dto);
    List<BoardVo> selBoard(BoardSelDto dto);
}
