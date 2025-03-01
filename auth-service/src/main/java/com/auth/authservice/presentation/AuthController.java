package com.auth.authservice.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

    public String ApiHelloAuthController() {
        return "Hello auth-controller";
    }
}
