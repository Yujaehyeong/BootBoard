package com.example.practice.repository;

import com.example.practice.vo.BoardVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardDao {

    @Autowired
    private SqlSession sqlSession;

    public List<BoardVo> selectBoardList() {

        List<BoardVo> boardList = sqlSession.selectList("board.getBoardList");

        return boardList;
    }
}
