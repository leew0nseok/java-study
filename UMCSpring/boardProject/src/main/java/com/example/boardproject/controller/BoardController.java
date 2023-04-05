package com.example.boardproject.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class BoardController {

    private List<Board> boardList = new ArrayList<>(); // 저장소

    //Path Variable 1개와 Query Parameter 2갸
    @PostMapping("/board/create/{boardId}")
    public String createBoard(
            @PathVariable int boardId,
            @RequestParam String title,
            @RequestParam String content)
        {
            Board board = new Board(boardId, title, content);
            boardList.add(board);

            return "정상적으로 포스팅 되었습니다.";
    }

    @GetMapping("/board/get")
    public List<Board> getBoard(){
        log.info("정상적으로 get");
        return this.boardList;
    }

    @PutMapping("/board/create/{boardId}")
    public String updateBoard(
            @PathVariable int boardId,
            @RequestParam String title,
            @RequestParam String content){
        for (int i = 0; i < this.boardList.size(); i++) {
            if (boardList.get(i).getId() == boardId) {
                boardList.get(i).setTitle(title);
                boardList.get(i).setContent(content);

                log.info("새로운 제목과 내용 : " + title + " " + content);
                return "정상적으로 수정완료되었습니다.";
            }
        }
        log.error("요청한 게시글 아이디가 존재하지 않습니다.");
        return "정상적으로 수정 완료 되었습니다.";

    }
}
