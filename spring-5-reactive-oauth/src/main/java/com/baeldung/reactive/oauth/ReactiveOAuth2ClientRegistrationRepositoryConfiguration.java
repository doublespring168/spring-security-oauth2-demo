//package com.baeldung.reactive.oauth;
//
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties;
//import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientPropertiesRegistrationAdapter;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrations;
//import org.springframework.security.oauth2.client.registration.InMemoryReactiveClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration("classpath:default-application.yml")
//@EnableConfigurationProperties(OAuth2ClientProperties.class)
//class ReactiveOAuth2ClientRegistrationRepositoryConfiguration {
//
//    private final OAuth2ClientProperties properties;
//
//    ReactiveOAuth2ClientRegistrationRepositoryConfiguration(OAuth2ClientProperties properties) {
//        this.properties = properties;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean(ReactiveClientRegistrationRepository.class)
//    public InMemoryReactiveClientRegistrationRepository clientRegistrationRepository() {
//        //List<ClientRegistration> registrations = new ArrayList<>(
//        //        OAuth2ClientPropertiesRegistrationAdapter.getClientRegistrations(this.properties).values()
//        //);
//        //return new InMemoryReactiveClientRegistrationRepository(registrations);
//        ClientRegistration clientRegistration = ClientRegistration
//                .withRegistrationId("clientId")
//                .clientId("clientId")
//                .clientSecret("clientId")
//                .build();
//
//        List<ClientRegistration> registrations = new ArrayList<>(
//                OAuth2ClientPropertiesRegistrationAdapter.getClientRegistrations(this.properties).values()
//        );
//
//        ClientRegistration.withRegistrationId("clientId").
//
//        return new InMemoryReactiveClientRegistrationRepository(clientRegistration);
//    }
//}