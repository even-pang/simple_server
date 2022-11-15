package com.ordadata.simple_server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/template/")
    public String index() {
        return "index";
    }
}
