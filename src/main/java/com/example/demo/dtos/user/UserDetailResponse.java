package com.example.demo.dtos.user;

import com.example.demo.models.User;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDetailResponse {
    private Long id ;
    private String username ;
    private String email ;
    private String password ;
    private Integer age ;
    private LocalDateTime createdAt ;

    public static UserDetailResponse FromModelToDetailResponse (User user){
        UserDetailResponse userDetailResponse = new UserDetailResponse();
        userDetailResponse.setId(user.getId());
        userDetailResponse.setUsername(user.getUsername());
        userDetailResponse.setPassword(user.getPassword());
        userDetailResponse.setEmail(user.getEmail());
        userDetailResponse.setAge(user.getAge());
        userDetailResponse.setCreatedAt(user.getCreatedAt());
        return userDetailResponse ;
    }
}
