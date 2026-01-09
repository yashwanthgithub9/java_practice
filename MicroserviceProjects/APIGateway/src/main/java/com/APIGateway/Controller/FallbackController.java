package com.APIGateway.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @GetMapping("/fallback/employee")
    public Mono<String> employeeFallback(){
        return Mono.just("⚠ Oops Employee Service is taking too long to respond, try again in sometime...!");
        //We use Mono<String> because Spring Cloud Gateway is built on "WebFlux" (Reactive programming).
        // It’s just a fancy way of saying "Return this String."
    }
}
