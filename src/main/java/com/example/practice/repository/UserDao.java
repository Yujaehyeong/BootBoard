package com.example.practice.repository;


import com.example.practice.vo.UserVo;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private SqlSession sqlSession;

    public String checkOverlapId(String id) {
        return sqlSession.selectOne("user.checkOverlapId", id);
    }

    public UserVo selectUser(String userId) {
        return sqlSession.selectOne("user.selectUser", userId);
    }

    public int updateUser(UserVo user) {
        return sqlSession.update("user.updateUser", user);
    }

    public UserVo login(UserVo user) {
        return sqlSession.selectOne("user.selectUserByIdAndPassword", user);
    }
}
