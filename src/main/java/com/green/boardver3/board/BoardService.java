package com.green.boardver3.board;

import com.green.boardver3.board.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

//    public List<BoardListVo> selBoardList (BoardDto dto){
//        dto.setStartIdx((dto.getPage()-1) * dto.getRowLen());
//        return MAPPER.selBoardList(dto);
//    }
    public List<BoardVo> selBoard(BoardSelDto dto) {
        int startIdx = (dto.getPage() - 1) * dto.getRow();
        dto.setStartIdx(startIdx);
        return MAPPER.selBoard(dto);
    }
    public int maxPage(int row) {
        int count = MAPPER.selBoardMaxPage(row);
        return (int)Math.ceil((double) count / row);
    }
    public BoardDetailVo selBoardDetail(BoardSelDto dto) {
        return MAPPER.selBoardDetail(dto);
    }
    public int delBoard(BoardDelDto dto) {
        return MAPPER.delBoard(dto);
    }


}
