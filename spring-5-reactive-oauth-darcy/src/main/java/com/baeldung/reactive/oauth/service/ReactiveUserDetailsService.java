package com.baeldung.reactive.oauth.service;

import org.springframework.security.core.userdetails.UserDetails;
import reactor.core.publisher.Mono;

public interface ReactiveUserDetailsService {

    /**
     * Find the {@link UserDetails} by username.
     *
     * @param username the username to look up
     * @return the {@link UserDetails}. Cannot be null
     */
    Mono<UserDetails> findByUsername(String username);
}