package com.lance.demo.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.lance.demo.mybatis.dao"})
public class MybatisBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(MybatisBootstrap.class, args);
    }
}
