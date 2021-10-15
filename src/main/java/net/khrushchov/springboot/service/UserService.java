package net.khrushchov.springboot.service;

import net.khrushchov.springboot.model.Client;
import net.khrushchov.springboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	Client save(UserRegistrationDto registrationDto);
}
