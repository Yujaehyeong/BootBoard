package com.example.practice.controller;

import com.example.practice.service.BoardService;
import com.example.practice.vo.BoardVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    private BoardService boardService;

    // Spring Reference에서 추천하는 방식 @Autowired 말고 생성자로 주입 받기
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // Mapiing으로 메소드의 기능 정의 AS-IS @RequestMapping TO-BE GetMapping
    @GetMapping("/main")
    public String getBoardList(Model model) {
        List<BoardVo> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "views/board/board";
    }

    @GetMapping("")
    public String getBoard(Model model, Long boardNo) {
        BoardVo board = boardService.getBoardByBoardNo(boardNo);
        model.addAttribute("board", board);
        return "views/board/view";
    }

    @PostMapping("")
    public String createBoard(BoardVo boardVo) {
        Boolean createBoardResult = boardService.createBoard(boardVo);
        return "redirect:/board/main";
    }

    @DeleteMapping("")
    public String removeBoard(Long boardNo) {
        Boolean removeBoardResult = boardService.removeBoardByBoardNo(boardNo);
        return "redirect:/board/main";
    }

    @PutMapping("")
    public String modifyBoard(BoardVo boardVo) {
        Boolean removeBoardResult = boardService.modifyBoardByBoardNo(boardVo);
        return "redirect:/board/main";
    }


}
