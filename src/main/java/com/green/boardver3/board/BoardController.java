package com.green.boardver3.board;

import com.green.boardver3.board.model.BoardDto;
import com.green.boardver3.board.model.BoardInsDto;
import com.green.boardver3.board.model.BoardListVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService SERVICE;

    @Autowired
    public BoardController(BoardService service){
        this.SERVICE = service;
    }

    @PostMapping
    public int postBoard(@RequestBody BoardInsDto dto){
        return SERVICE.postBoard(dto);
    }

    @GetMapping
    public List<BoardListVo> selBoardList(@RequestParam int page, @RequestParam int row){
        BoardDto dto = new BoardDto();
        dto.setPage(page);
        dto.setRowLen(row);
        return SERVICE.selBoardList(dto);
    }
}
