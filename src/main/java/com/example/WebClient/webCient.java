package com.example.WebClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class webCient {

    @Autowired
    public WebClient webClient;

    public Mono<Template> getDetails(){

        return webClient.get()
                .uri("/entries")
                .exchangeToMono(clientResponse -> {
                    return clientResponse.bodyToMono(Template.class);
                });

    }
}
