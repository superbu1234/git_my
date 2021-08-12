package cn.nepu.stu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/anno")
public class AnnoController {
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println("...");
        return "success";
    }

    @RequestMapping("/PathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id) {
        System.out.println("..." + id);
        return "success";
    }

    /**
     * moduleAttribute注解
     *
     * @param id
     * @return
     */
    @RequestMapping("/moduleAttribute")
    public String moduleAttribute() {
        System.out.println("...");
        return "success";
    }


    @ModelAttribute
    public void showUser() {
        System.out.println("执行了。。");
    }
}
