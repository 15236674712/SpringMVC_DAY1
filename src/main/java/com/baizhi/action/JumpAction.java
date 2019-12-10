package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jump")
public class JumpAction {


    @RequestMapping("/A")
    public  String   A () throws  Exception{
        System.out.println("A方法");
        return "index";
    }

    @RequestMapping("/B")
    public  String   B () throws  Exception{
        System.out.println("B方法");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/C")
    public  String   C () throws  Exception{
        System.out.println("C方法");
        return "redirect:/jump/D.do";
    }

    @RequestMapping("/D")
    public  String   D () throws  Exception{
        System.out.println("D方法");
        return "index";
    }

    @RequestMapping("/E")
    public  String   E () throws  Exception{
        System.out.println("E方法");
        return "redirect:/hello/world.do";
    }
}
