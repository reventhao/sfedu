package com.sf.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.sf.edu.mapper")
public class SfeduApplication {

    public static void main(String[] args) {
        SpringApplication.run(SfeduApplication.class, args);
    }
}
