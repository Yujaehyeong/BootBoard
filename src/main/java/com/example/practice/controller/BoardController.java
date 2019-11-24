package com.example.practice.controller;

import com.example.practice.service.BoardService;
import com.example.practice.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/main") //
    public String getBoardList(Model model){
        List<BoardVo> boardList =  boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "views/board/board"; // board.html 파일 경로매핑
    }

}
