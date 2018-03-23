package com.lance.demo.mybatis.service;

import com.lance.demo.mybatis.po.UserPO;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @org.junit.Test
    public void addUser() {
        UserPO userPO = new UserPO("lance", 20);
        int result = userService.addUser(userPO);
        assertEquals(1,result);
    }
}