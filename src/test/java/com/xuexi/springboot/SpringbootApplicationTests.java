package com.xuexi.springboot;

import com.xuexi.springboot.mapper.UserMapper;
import com.xuexi.springboot.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	private UserMapper userMapper;


	//通用mapper只能针对的是单表的操作
	@Test
	public void contextLoads() {
		User user = new User();
		user.setId(2);
		List<User> list = userMapper.select(user);
		System.out.println(list.toString());
	}

}
