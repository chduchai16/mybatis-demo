package com.example.demo.mappers;

import com.example.demo.models.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    User findById (Long id ) ;
    List<User> findAlls() ;
    User findByUsername(String username) ;
    void insert(User user) ;
    void update (User user) ;
    void delte (Long id ) ;
}
