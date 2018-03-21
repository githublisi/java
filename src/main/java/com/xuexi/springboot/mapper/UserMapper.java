package com.xuexi.springboot.mapper;

import com.xuexi.springboot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{

    @Select(value = "select * from user")
    List<User> selectAll();
}
