package com.cug.antennado.service;

import com.cug.antennado.model.User;

/**
 * Created by Administrator on 2017/4/5.
 */
public interface UserService {

    User getUserByUserName(String userName);

    int insert(User user);
}