package com.springbootproject.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeControler {

        @RequestMapping("/")
        public String index()
        {
            return "index.html";
        }
}
