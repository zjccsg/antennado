package com.cug.antennado.service.Impl;

import com.cug.antennado.dao.UserMapper;
import com.cug.antennado.model.User;
import com.cug.antennado.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/5.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }

    public int insert(User user) {
        int result = userMapper.insert(user);

        System.out.println(result);
        return result;
    }
}
