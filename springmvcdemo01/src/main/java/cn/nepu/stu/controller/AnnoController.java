package cn.nepu.stu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.SessionScope;

@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"})//将msg=美美存入到session域对象
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
     * @param
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

    /**
     * testSessionAttributes
     * @return
     */
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        System.out.println("testSessionAttributes...");
        //底层存到request域对象中
        model.addAttribute("msg","美美");
        return "success";
    }

    @RequestMapping("/getSessionAttributes")
    public String getSessionAttributes(ModelMap modelMap){
        System.out.println("testSessionAttributes...");
        //底层存到request域对象中
        String msg = (String) modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }
    @RequestMapping("/delSessionAttributes")
    public String delSessionAttributes(SessionStatus status){
        System.out.println("testSessionAttributes...");
        //底层存到request域对象中
        status.setComplete();
        return "success";
    }
}
