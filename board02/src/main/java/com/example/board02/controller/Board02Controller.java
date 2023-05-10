package com.example.board02.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Board02Controller {
    @GetMapping(value="/")
    public String main1(Model model){
        System.out.println("==ee=테스트=========!!!!!!!!!!!!!!!!");
        return "index";
    }
    @GetMapping(value="/board02/list")
    public String list(Model model){
        System.out.println("====테스트====리스트!!!!");
        return "/board02/list";
    }
    @GetMapping(value="/board02/view")
    public String view(Model model){
        System.out.println("====테스트====뷰!!!!!!!!!!!!");
        return "/board02/view";
    }
    @GetMapping(value="/board02/write")
    public String write(Model model){
        System.out.println("====테스트======라이트!!!!!!!!!!!!");
        return "/board02/write";
    }
    @GetMapping(value="/board02/edit")
    public String edit(Model model){
        System.out.println("====테스트======에딧!!!!!!!!!!!!");
        return "/board02/edit";
    }

}
