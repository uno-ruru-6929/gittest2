package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LoginController {
    // ログイン画面を表示
        @GetMapping("/")
        public String index() {
            return "login";
        }
}