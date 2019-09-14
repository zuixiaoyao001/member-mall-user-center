package com.drawnblue.user.service;

import com.drawnblue.dao.UserMapper;
import com.drawnblue.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User selectById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    public User findByMobileOrEmail(User user){
        return this.userMapper.findByMobileOrEmail(user);
    }
}
