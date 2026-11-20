package com.example.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller
public class RestController {

    @Get("/{name}")
    public HttpResponse<String> getResponse(@PathVariable String name) {
        return HttpResponse.ok(name);
    }
}
