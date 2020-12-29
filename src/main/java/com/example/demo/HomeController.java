package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
//    @RequestMapping("home")
//    @ResponseBody
//    public String home(HttpServletRequest request, HttpServletResponse response){
//        HttpSession session=request.getSession();
//        String namee=request.getParameter("name");
//        System.out.println("Hiiiiiiiii"+namee);
//        session.setAttribute("name",namee);
//        return "home";
//    }
//    @RequestMapping("home")
//    public String home(String name, HttpSession session){
//        session.setAttribute("name",name);
//        return "home";
//    }
//    @RequestMapping("home")
//    public ModelAndView home(String name){
//        ModelAndView mv=new ModelAndView();
//        mv.addObject("name",name);
//        mv.setViewName("home");
//        return mv;
//    }
    @RequestMapping("home")
    public ModelAndView home(Alien alien){
        ModelAndView mv=new ModelAndView();
        mv.addObject("obj",alien);
        mv.setViewName("home");
        return mv;

    }
}
