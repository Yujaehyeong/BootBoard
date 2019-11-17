package com.example.practice.service;

import com.example.practice.repository.BoardDao;
import com.example.practice.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {


    @Autowired
    private BoardDao boardDao;

    public List<BoardVo> getBoardList(){
        return boardDao.selectBoardList();
    }

}
