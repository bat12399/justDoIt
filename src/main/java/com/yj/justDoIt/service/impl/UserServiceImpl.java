package com.yj.justDoIt.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yj.justDoIt.dao.UserDao;
import com.yj.justDoIt.mapper.UserMapper;
import com.yj.justDoIt.pojo.User;
import com.yj.justDoIt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

//    @Autowired
//    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;

}
