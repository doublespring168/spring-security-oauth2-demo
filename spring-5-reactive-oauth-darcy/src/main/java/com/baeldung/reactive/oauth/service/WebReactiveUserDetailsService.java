package com.baeldung.reactive.oauth.service;

import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class WebReactiveUserDetailsService implements ReactiveUserDetailsService {

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        UserDetails user = User.withUsername("username")
                .password(encoder.encode("password"))
                .roles("role")
                .build();
        return Mono.just(user);
    }

}