package com.lance.demo.mybatis.service;

import com.lance.demo.mybatis.dao.UserMapper;
import com.lance.demo.mybatis.po.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper<UserPO> userMapper;
    public int addUser(UserPO userPO) {
        return userMapper.insert(userPO);
    }
}
