package com.xuexi.springboot.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuexi.springboot.Service.UserService;
import com.xuexi.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("selectAll")
    @ResponseBody
    public List<User> selectAll(Model model){
//      只会对紧跟着的第一个有效
//        PageHelper.startPage(1,2);
        List<User> list = userService.selectAll();
//        Page<User> page = (Page<User>) list;
//        System.out.println("总记录数 " + page.getTotal());
//        System.out.println("这页共有多少条 " + list.size());
        return list;
    }

}
