package com.yj.justDoIt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@MapperScan(basePackages = "com.yj.justDoIt")
public class JustDoItApplication {

    public static void main(String[] args) {
        SpringApplication.run(JustDoItApplication.class, args);
    }

}
