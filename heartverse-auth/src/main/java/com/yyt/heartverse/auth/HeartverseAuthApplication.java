package com.yyt.heartverse.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yyt.heartverse.auth.domain.mapper")
public class HeartverseAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeartverseAuthApplication.class, args);
    }

}
