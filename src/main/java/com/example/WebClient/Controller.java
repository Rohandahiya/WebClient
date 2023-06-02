package com.example.WebClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@RestController
public class Controller {

    @Autowired
    private webCient webClient;

    @GetMapping("/get/template")
    public ResponseEntity<?> getTemplate(){


        Mono<Template> response = webClient.getDetails();
        Template template = new Template();

        Optional<Template> template1 = response.blockOptional();

        if(template1.isPresent()){
            template = template1.get();
        }

        return ResponseEntity.status(HttpStatus.OK).body(template);

    }

}
