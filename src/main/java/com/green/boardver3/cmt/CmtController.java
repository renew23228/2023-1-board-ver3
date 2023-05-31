package com.green.boardver3.cmt;

import com.green.boardver3.cmt.model.CmtInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board/cmt")
public class CmtController {
    private final CmtService SERVICE;

    @Autowired
    public CmtController(CmtService service) {
        this.SERVICE = service;
    }

    @PostMapping
    public int postBoardCmt(@RequestBody CmtInsDto dto) {
        return SERVICE.insBoardCmt(dto);
    }
}
