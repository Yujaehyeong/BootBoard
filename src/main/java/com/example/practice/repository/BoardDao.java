package com.example.practice.repository;

import com.example.practice.vo.BoardVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BoardDao {

    private SqlSession sqlSession;

    public BoardDao(SqlSession sqlSession){
        this.sqlSession = sqlSession;
    }

    public List<BoardVo> selectBoardList() {

        List<BoardVo> boardList = sqlSession.selectList("board.selectBoardList");

        return boardList;
    }

    public BoardVo selectBoardByBoardNo(Long boardNo) {

        BoardVo boardVo = sqlSession.selectOne("board.selectBoardByBoardNo", boardNo);

        return boardVo;
    }

    public int deleteBoardByBoardNo(Long boardNo) {

        int deleteBoardResult = sqlSession.delete("board.deleteBoardByBoardNo", boardNo);

        return deleteBoardResult;
    }

    public int insertBoard(BoardVo boardVo) {

        int insertBoardResult = sqlSession.insert("board.insertBoard", boardVo);

        return insertBoardResult;
    }

    public int updateBoard(BoardVo boardVo) {

        int updateBoard = sqlSession.update("board.insertBoard", boardVo);
        return updateBoard;
    }
}
