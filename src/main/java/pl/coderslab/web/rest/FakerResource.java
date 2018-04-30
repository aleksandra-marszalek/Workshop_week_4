package pl.coderslab.web.rest;

import org.springframework.web.bind.annotation.GetMapping;

public class FakerResource {
    @GetMapping(path= "/hello-world") public String helloWorld() {
        return "Hello World"; }
}