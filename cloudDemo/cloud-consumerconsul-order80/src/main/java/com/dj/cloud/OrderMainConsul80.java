package com.dj.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * consul 注册中心 消费者
 */
@SpringBootApplication
@MapperScan("com.dj.cloud.mapper")
@EnableDiscoveryClient
public class OrderMainConsul80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainConsul80.class, args);
        System.out.println("OrderMain start  successfully.............");

    }
}
