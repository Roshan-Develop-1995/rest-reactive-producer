package com.rest.comms.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public Mono<String> getHello() {
        return Mono.just("Hello from REST API");
    }

    @PostMapping("/echo")
    public  Mono<String> postEcho(@RequestBody String message){
        return Mono.just("Echo: "+message);
    }
}
