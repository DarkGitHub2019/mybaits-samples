package com.lyle.samples.mybaits.samples;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lyle.samples.mybaits.samples.mapper")
public class MybaitsSamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaitsSamplesApplication.class, args);
    }

}
