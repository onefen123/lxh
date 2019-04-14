package net.fen.lxh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String t1(HttpServletRequest request, HttpServletResponse response){
        System.out.println("客户端ip: "+request.getRemoteAddr());
        System.out.println("sessionID: "+request.getSession().getId());
           return "主页";
    }
    @GetMapping(path="/access_token")
    public String get1(@RequestHeader("access_token") String accesssToken){
        return accesssToken;
    }

    @GetMapping("/get2")
    public String get2(String msg){
        return msg;
    }
    @RequestMapping(value = "/book/{name}",method = RequestMethod.GET)
    public String t1(@PathVariable("name") String name,@RequestParam(defaultValue ="123",required = true) int pages){
        return "书名:"+name+"页数:"+pages;
    }



}
