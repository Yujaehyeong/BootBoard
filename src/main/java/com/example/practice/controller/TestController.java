package com.example.practice.controller;

import com.example.practice.service.BoardService;
import com.example.practice.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

//    @RequestMapping("/test") // localhostL8088/test/test로 접근
//    public String getRequest(Model model){ // Model 객체 파라미터 추가
//        // Model 객체에 데이터 저장 - key:"greeting" | value:"Hello, world!"
//        model.addAttribute("greeting", "Hello, world!");
//        return "index/index"; // index.html 파일 경로매핑
//    }


}