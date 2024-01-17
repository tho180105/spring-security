package com.example.security.security;

import com.example.security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CustomerUserDetailsService implements UserDetailsService {

    private final UserRepository iUserRepository ;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return iUserRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("User not found !"));

    }


}
