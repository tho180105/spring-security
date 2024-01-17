package com.example.security.service;

import com.example.security.dto.LoginDto;
import com.example.security.dto.UserDTO;
import com.example.security.dto.UserRequestDTO;
import com.example.security.entity.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface UserService {

    String authenticate(LoginDto loginDto);

}
