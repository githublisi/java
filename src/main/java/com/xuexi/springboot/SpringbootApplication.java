package com.xuexi.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

//引导类
@SpringBootApplication
@EnableCaching
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class,args);
    }

    @Bean
    public MapperScannerConfigurer createMapperScanner(){
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setBasePackage("com.xuexi.springboot.mapper");
        Properties properties = new Properties();
        properties.setProperty("mappers","tk.mybatis.mapper.common.Mapper");
        configurer.setProperties(properties);
        return configurer;
    }
}
