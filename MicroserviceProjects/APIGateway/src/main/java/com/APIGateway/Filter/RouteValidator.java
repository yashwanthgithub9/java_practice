package com.APIGateway.Filter;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    public static final List<String> openApiEndPoints =List.of("/auth/register","auth/token","/eureka");

    // 1. Predicate: A fancy word for a function that takes an object and returns TRUE or FALSE.
    public Predicate<ServerHttpRequest> isSecured =

            // 2. The Input: We receive the incoming 'request'
            request -> openApiEndPoints

                    // 3. Stream: Turn the list ["/auth/register", "/auth/token", "/eureka"] into a stream of data
                    .stream()

                    // 4. noneMatch: This is the Key!
                    // It returns TRUE only if the condition fails for EVERY item in the list.
                    .noneMatch(uri ->

                            // 5. The Condition: Does the incoming Request URL contain this Open URL?
                            request.getURI().getPath().contains(uri)
                    );
}
