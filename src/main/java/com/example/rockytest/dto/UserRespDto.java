package com.example.rockytest.dto;

import com.example.rockytest.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@NoArgsConstructor
public class UserRespDto {

    private Long id;
    private String email;
    private String password;

    public UserRespDto(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }

}
