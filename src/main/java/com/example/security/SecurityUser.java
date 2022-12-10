package com.example.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.stream.Collectors;

public class SecurityUser extends User {

    public SecurityUser(com.example.entity.User user) {
        super(user.getUsername(),
              user.getPassword(),
              user.getRoles().stream().map(r -> new SimpleGrantedAuthority(r.getName())).collect(Collectors.toList()));
    }

}
