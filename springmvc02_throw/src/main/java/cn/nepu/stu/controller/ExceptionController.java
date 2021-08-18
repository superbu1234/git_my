package cn.nepu.stu.controller;

import cn.nepu.stu.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ExceptionController {
    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("执行了");

        try {
            int a=10/0;
        } catch (Exception e) {
            //打印异常信息
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SysException("查询所有用户出现错误");
        }
        return "success";
    }

}
