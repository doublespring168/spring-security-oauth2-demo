package com.baeldung.reactive.oauth.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {
    //
    //@Autowired
    //private WebClient webClient;

    @GetMapping("/")
    public Mono<String> index(@AuthenticationPrincipal Mono<OAuth2User> oauth2User) {
        return oauth2User
                .map(OAuth2User::getName)
                .map(name -> String.format("Hi, %s", name));
    }

    @GetMapping("/logined")
    public String logined() {
        return "logined URL";
    }

    @GetMapping("/permitAll")
    public String permitAll() {
        return "permitAll URL";
    }
}
