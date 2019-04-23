package com.jonlin.service.impl;

import com.jonlin.entity.User;
import com.jonlin.mapper.TestMapper;
import com.jonlin.mapper.UserMapper;
import com.jonlin.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * description Test实现
 * Author Jonlin
 * Date 2019/2/26 17:52
 **/
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    public ArrayList<User> test(User user) {
        return testMapper.test(user);
    }


}
