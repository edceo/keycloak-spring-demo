package com.edceo.ksd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/public")
    public String publicPage() {
        return "This is a public page";
    }

    @GetMapping("/user")
    public String userPage() {
        return "This is a admin-user page";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "This is an admin page";
    }

    @GetMapping("/manager")
    public String managerPage() {
        return "This is a admin-manager page";
    }
}
