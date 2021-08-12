package cn.nepu.stu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 控制器
 */
@Controller
public class HelloController {
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello SpringMVC");
        return "success";
    }
    @RequestMapping(path = "/testMapping",method = {RequestMethod.GET})
    public String testRequestMapping(){
        System.out.println("requestMapping");
        return "success";
    }
}
