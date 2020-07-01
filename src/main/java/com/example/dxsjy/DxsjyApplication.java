package com.example.dxsjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dxsjy.Mapper")
public class DxsjyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DxsjyApplication.class, args);
    }

}
