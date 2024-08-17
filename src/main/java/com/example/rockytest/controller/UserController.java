package com.example.rockytest.controller;

import com.example.rockytest.dto.UserRespDto;
import com.example.rockytest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?> searchUser() {
        List<UserRespDto> userRespDtos = userService.searchUser();
        return ResponseEntity.ok(userRespDtos);
    }
}
