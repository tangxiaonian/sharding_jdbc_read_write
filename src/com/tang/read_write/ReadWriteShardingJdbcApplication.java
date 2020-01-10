package com.tang.read_write;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Classname MultiDataSourceApplication
 * @Description [ TODO ]
 * @Author Tang
 * @Date 2019/12/31 20:51
 * @Created by ASUS
 */
@SpringBootApplication
@MapperScan("com.tang.read_write.mapper")
public class ReadWriteShardingJdbcApplication {

    public static void main(String[] args) {

        SpringApplication.run(ReadWriteShardingJdbcApplication.class, args);

    }
}