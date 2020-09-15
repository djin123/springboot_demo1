package cn.com.djin.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *  控制器
 */
@RestController  //控制器路径默认为“/”，将控制器实例化  ==  @Controller+@RequestMapping
public class MyRestController {

    //测试访问方法
    @RequestMapping("/test1")
    public @ResponseBody String test1(){

        System.out.println("测试1");

        System.out.println("测试2");

        return "springboot项目访问ok..";
    }
}
