package com.example.demo.services;

import com.example.demo.mappers.UserMapper;
import com.example.demo.models.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService implements IUserService {

    private final UserMapper userMapper;

    @Override
    public User findUserById(Long id) {
        log.info("Tiến hành tìm kiếm user với id: " + id);
        User user = userMapper.findById(id);
        if (user == null) {
            throw new RuntimeException("Không tìm thấy user với id: " + id);
        }
        return user;
    }
}
