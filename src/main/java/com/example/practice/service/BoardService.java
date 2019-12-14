package com.example.practice.service;

import com.example.practice.repository.BoardDao;
import com.example.practice.vo.BoardVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {


    private BoardDao boardDao;

    public BoardService(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    public List<BoardVo> getBoardList() {
        return boardDao.selectBoardList();
    }

    public BoardVo getBoardByBoardNo(Long boardNo) {

        BoardVo boardVo = boardDao.selectBoardByBoardNo(boardNo);

        return boardVo;
    }

    public Boolean removeBoardByBoardNo(Long boardNo) {

        int deleteBoardResult = boardDao.deleteBoardByBoardNo(boardNo);

        return deleteBoardResult == 1 ? true : false;
    }

    public Boolean createBoard(BoardVo boardVo) {

        int insertBoardResult = boardDao.insertBoard(boardVo);

        return insertBoardResult == 1 ? true : false;
    }

    public Boolean modifyBoardByBoardNo(BoardVo boardVo) {
        int updateBoardResult = boardDao.updateBoard(boardVo);
        return updateBoardResult == 1 ? true : false;

    }
}
