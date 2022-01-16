package com.mahezh.login.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mahezh.login.model.User;
import com.mahezh.login.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
