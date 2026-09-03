package com.example.demo.controllers;

import com.example.demo.dtos.BaseApiResponse;
import com.example.demo.dtos.user.UserDetailResponse;
import com.example.demo.models.User;
import com.example.demo.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api/v1/users")
@RestController
public class UserController {

    private final IUserService iUserService;

    @GetMapping("/{id}")
    public ResponseEntity<BaseApiResponse<UserDetailResponse>> findUserById(@PathVariable Long id) {
        User user = iUserService.findUserById(id);
        UserDetailResponse userDetailResponse = UserDetailResponse.FromModelToDetailResponse(user);

        BaseApiResponse<UserDetailResponse> response = BaseApiResponse.<UserDetailResponse>builder()
                .status("SUCCESS")
                .code("200")
                .message("Lấy thông tin người dùng thành công")
                .data(userDetailResponse)
                .build();

        return ResponseEntity.ok(response);
    }
}
