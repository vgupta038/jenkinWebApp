package com.example.manualDeploy.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping("/test")
    public String testCall(){
        return "welcome to test spring boot project2!";
    }
}
