package com.example.rockytest.service;

import com.example.rockytest.dto.UserRespDto;
import com.example.rockytest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<UserRespDto> searchUser() {
        return userRepository.findAll().stream()
                .map(UserRespDto::new)
                .collect(Collectors.toList());
    }
}
