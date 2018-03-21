package com.xuexi.springboot.Service;

import com.xuexi.springboot.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();
}
