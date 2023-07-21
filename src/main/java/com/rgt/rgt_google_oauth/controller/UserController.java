package com.rgt.rgt_google_oauth.controller;

import com.rgt.rgt_google_oauth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/login/oauth2", produces = "application/json")
public class UserController {
    private final UserService userService;

    @GetMapping("/code/{registrationId}")
    public void googleLogin(@RequestParam String code, @PathVariable String registrationId) {
        userService.socialLogin(code, registrationId);
    }
}
