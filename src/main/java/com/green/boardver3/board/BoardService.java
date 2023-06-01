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

//    insert문 작성과 작성 후 내가 작성한 게시글 바로 볼 수 있게 하기
//     방금 작성한 pk값을 얻을 수 있다 = (result)
    public int postBoard(BoardInsDto dto){
        BoardEntity entity = new BoardEntity();
        entity.setTitle(dto.getTitle());
        entity.setCtnt(dto.getCtnt());
        entity.setIuser(dto.getIuser());

        int result = MAPPER.insBoard(entity);

        if (result == 1) {
            return entity.getIboard();
        }

        return result;
    }

//    원래 우리끼리 작성했던 코드
//    public List<BoardListVo> selBoardList (BoardDto dto){
//        dto.setStartIdx((dto.getPage()-1) * dto.getRowLen());
//        return MAPPER.selBoardList(dto);
//    }

//    선생님과 함께 작성한 코드 (각자 비교해보기)
//    전체 게시글 select하기 쿼리스트링으로 작성함
    public List<BoardVo> selBoard(BoardSelDto dto) {
        int startIdx = (dto.getPage() - 1) * dto.getRow();
        dto.setStartIdx(startIdx);
        return MAPPER.selBoard(dto);
    }
//    내가 갖고있는 DB의 최대 페이지값 리턴하기
    public int maxPage(int row) {
        int count = MAPPER.selBoardMaxPage();
        return (int)Math.ceil((double) count / row);
    }
//    게시글전체 중 하나만 디테일로 보기 ctnt 포함 됨
    public BoardDetailVo selBoardDetail(BoardSelDto dto) {
        return MAPPER.selBoardDetail(dto);
    }
//   update문 작성하기
    public int upbBoard(BoardUpdDto dto) {
        return MAPPER.updBoard(dto);
    }

//   delete문 작성하기
    public int delBoard(BoardDelDto dto) {
        return MAPPER.delBoard(dto);
    }


}
