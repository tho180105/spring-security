package com.example.security.restController;

import com.example.security.dto.LoginDto;
import com.example.security.entity.User;
import com.example.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(originPatterns = "*http://localhost:5173*", allowCredentials = "true")
@RestController
@RequestMapping("api/v1/admin/login")
public class LoginController {

    @Autowired
    private final AuthenticationManager authenticationManager;
    @Autowired
    private UserService userService;

    public LoginController(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }


    @PostMapping("/authenticate")
    public String authenticate(@RequestBody LoginDto loginDto) {
        return userService.authenticate(loginDto);
    }

    @GetMapping("/user-info")
    public String getUserLoginInfo() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return "Ok";
    }
    @PostMapping("/user-info-post")
    public String getUserLoginInfoPost() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return "OK";
    }
}
