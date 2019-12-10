package com.baizhi.action;

import com.baizhi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/receive")
public class ReceiveAction {  //收集参数


    //传统方式收集
    @RequestMapping("/r1")
    public  String   r1(HttpServletRequest request) throws  Exception{
        /*
        * 传统方式收参的缺点
        *  1.接收数据的代码冗余
        *  2.需要手工进行类型转换
        * */
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        System.out.println(username);
        System.out.println(age);
        return "index";
    }

    //零散变量的方式收参
    @RequestMapping("/r2")
    public  String  r2( String  username, Integer age) throws  Exception{
        System.out.println(username);
        System.out.println(age);
        return "index";
    }

    //以对象形式接收
    @RequestMapping("/r3")
    public  String  r3(User user) throws  Exception{
        System.out.println(user);
        return "index";
    }
    //以对象或者数组形式接收
    @RequestMapping("/r4")
    public  String  r4(String[] hobby) throws Exception{
        for (String s : hobby) {
            System.out.println(s);
        }
        return "index";
    }

}
