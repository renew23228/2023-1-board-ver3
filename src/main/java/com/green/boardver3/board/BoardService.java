package com.green.boardver3.board;

import com.green.boardver3.board.model.BoardInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final BoardMapper MAPPER;

    @Autowired
    public BoardService(BoardMapper mapper){
        this.MAPPER = mapper;
    }

    public int postBoard(BoardInsDto dto){
        return MAPPER.insBoard(dto);
    }
}
