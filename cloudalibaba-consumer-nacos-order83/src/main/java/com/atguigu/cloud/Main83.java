package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther zzyy
 * @create 2023-11-23 17:15
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
/*
* 由于boot+cloud版本太高导致与阿里的Sentinel不兼容，因此83启动不成功
* 解决方案：将父工程中的boot+cloud版本降级
* <spring.boot.version>3.0.9</spring.boot.version>
<spring.cloud.version>2022.0.2</spring.cloud.version>
* */
public class Main83
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main83.class,args);
    }
}