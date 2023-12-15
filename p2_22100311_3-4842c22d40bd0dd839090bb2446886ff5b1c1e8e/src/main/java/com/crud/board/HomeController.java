package com.crud.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    BoardService boardService;

    @RequestMapping("/")
    public String Home(){
        return "login/login";
    }

}
