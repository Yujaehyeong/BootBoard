package com.example.practice.repository;

import com.example.practice.vo.BoardVo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardDao {


    public List<BoardVo> selectBoardList() {

        BoardVo board =  new BoardVo();
        board.setNo(1L);
        board.setTitle("게시판입니다.");
        board.setContents("안녕하세요. 첫 게시판 입니다.");
        board.setRegDate("2019-11-16");
        board.setHit(111);
        board.setUserName("홍길동");
        board.setUserNo(1L);

        List<BoardVo> boardList = new ArrayList<>();

        boardList.add(board);

        return boardList;
    }
}
