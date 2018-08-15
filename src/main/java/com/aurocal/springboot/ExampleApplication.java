package com.aurocal.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

    //SpringApplication是springboot框架中描述spirng应用的类
    //它的run方法会创建一个spring应用上下文（Applicatiocontext)
    //另一个比方面他会扫描当前路径上的依赖
    //发现spring-webmvc（由spring-boot-starter-web传递引入—） 在类路径中，
    // 那么springboot会判断这是一个wegb应用，并启动一个内嵌的servlet容器(默认tomcat）
    public static void main(String[] args){
        SpringApplication.run(ExampleApplication.class,args);
    }
}
