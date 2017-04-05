package com.cug.antennado.service;

import com.alibaba.fastjson.JSON;
import com.cug.antennado.model.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by Administrator on 2017/4/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
        "classpath:spring-mybatis.xml" })
public class TestUserService {

    private static final Logger LOGGER = Logger
            .getLogger(TestUserService.class);

    @Autowired
    private UserService userService;

    @Test
    public void testInsert() {
        User user = new User();
        user.setUserId(null);
        user.setUserName("test");
        user.setUserPwd("test");
        user.setUserCreate(new Date());
        user.setUserLastModified(new Date());
        int result = userService.insert(user);
        System.out.println(result);
    }

    @Test
    public void testQueryByName() {
        User user = userService.getUserByUserName("test");
        LOGGER.info(JSON.toJSON(user));
    }
}
