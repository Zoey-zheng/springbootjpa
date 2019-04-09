package org.zhengyj.springbootjpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description 测试类
 * @Author zhengyingjun
 * @Date 2019/3/25 15:29
 * @Version 1.0
 **/
@RestController
public class HelloController {

    @RequestMapping("/say")
    public String say(){
        return "测试1234444";
    }
}
