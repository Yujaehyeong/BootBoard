package com.example.practice.service;

import com.example.practice.repository.UserDao;
import com.example.practice.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserDao userDao;

    public boolean checkOverlapId(String id) {
        return userDao.checkOverlapId(id) == null ? true : false;
    }

    public boolean login(UserVo user) {
        UserVo selectedUser = userDao.login(user);
        return selectedUser == null ? false : true;
    }

    public UserVo getUser(String userId) {
        UserVo selectedUser = userDao.selectUser(userId);
        return selectedUser;
    }

    public boolean modify(UserVo user) {
        return userDao.updateUser(user) == 1 ? true : false;
    }
}
