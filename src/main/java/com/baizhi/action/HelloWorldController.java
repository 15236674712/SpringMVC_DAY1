package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //创建Action对象  SpringMVC框架是单例的
@RequestMapping("/hello")  //struts2中的namespace
public class HelloWorldController {
    /*
    *
    * Action方法定义语法
    *   public    String  方法名  （参数列表） throws Exception
    *   localhost:8989/SpringMVC_Day1/hello.do
    * */
    @RequestMapping(value = "/world")
    public  String   world() throws  Exception{
        System.out.println("Hello  SpringMVC");
        //跳转index.jsp
        return "index";
    }


}
