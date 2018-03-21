package com.xuexi.springboot.Service.impl;

import com.xuexi.springboot.Service.UserService;
import com.xuexi.springboot.mapper.UserMapper;
import com.xuexi.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

//    @Cacheable(value = "userValue",key = "'userKey'")
    @Override
    public List<User> selectAll() {
        redisTemplate.boundValueOps("java").set("12345");
        System.out.println("缓存了");
        System.out.println(redisTemplate.boundValueOps("java").get());
        return userMapper.selectAll();
    }

}
