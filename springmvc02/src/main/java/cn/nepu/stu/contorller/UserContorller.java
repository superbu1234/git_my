package cn.nepu.stu.contorller;

import cn.nepu.stu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserContorller {
    /**
     * 返回值为string
     *
     * @param model
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("uuu");
        User user = new User();
        user.setUsername("meimie");
        user.setPassword("***");
        user.setAge(10);
        model.addAttribute("user", user);
        return "success";
    }

    /**
     * 返回值为void的三种处理方式
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("方法执行了");

        //转发 转发可以进入/WEB-INF/ 用不了视图解析器   重定向不能进入/WEB-INF/
        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
        //重定向
        response.sendRedirect(request.getContextPath() + "/index.jsp");
        //设置中文乱码
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("Hello");
        return;
    }

    /**
     * 返回值是ModelAndView
     *
     * @return
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        //创建ModelAndView对象 model相当于bean
        ModelAndView mv = new ModelAndView();

        User user = new User();
        user.setUsername("meimie");
        user.setPassword("***");
        user.setAge(10);
        //存储的对象
        mv.addObject("user", user);
        //跳转到的页面
        mv.setViewName("success");
        return mv;
    }

    /**
     * 使用关键字的方式进行转发或重定向
     *
     * @return
     */
    @RequestMapping("/testForwordOrRedirect")
    public String testForwordOrRedirect() {
        //请求转发
        //return "forword:/WEB-INF/pages/success.jsp";
        return "redirect:/index.jsp";
    }

    @RequestMapping("/testAjax")
    public @ResponseBody
    User testAjax(@RequestBody User user) {
        System.out.println("执行了。。。");
        //客户端发送ajax请求，传的是json字符串，后端将json字符串封装到user对象中
        System.out.println(user);
        //响应 模拟数据库查询
        user.setAge(1);
        user.setUsername("jj");

        //响应
        return user;

    }
}
