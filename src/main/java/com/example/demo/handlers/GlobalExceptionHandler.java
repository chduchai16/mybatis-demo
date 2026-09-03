package com.example.demo.handlers;

import com.example.demo.dtos.BaseApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<BaseApiResponse<?>> handleAllExceptions(Exception ex) {
        BaseApiResponse<?> response = BaseApiResponse.builder()
                .status("FAILED")
                .code(String.valueOf(HttpStatus.BAD_REQUEST.value()))
                .message(ex.getMessage() != null ? ex.getMessage() : "Đã xảy ra lỗi!")
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
