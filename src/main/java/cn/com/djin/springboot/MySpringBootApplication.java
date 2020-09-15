package cn.com.djin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  项目启动类
 */
//@SpringBootApplication(scanBasePackages = "cn.com.djin.springboot.*")  //启动注解，也可以进行整个项目的包的扫描，默认路径为启动类所在包的下子包或者子类
@SpringBootApplication
public class MySpringBootApplication {

    //项目的启动方法
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class);
    }

}
