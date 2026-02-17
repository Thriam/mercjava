package com.example.controller;

import com.example.model.Cricket;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("cricket")
public class CricketerController {
    @RequestMapping("/show")
    public String show(){
        return "cricketers.html";
    }

    @RequestMapping("/showCric")
    public ModelAndView showCricketer(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("cricketers");
        ModelAndView mv = new ModelAndView("cricketers");
        String name = "Dhoni";
        Date dt = new Date();
        Cricket cr1 = new Cricket(101, 11, "India");
        mv.addObject("myname",name);
        mv.addObject("mydate",dt);
        mv.addObject("mycricket",cr1);
        return mv;
    }
}
