package pl.coderslab.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.services.FakerService;


@RestController
@RequestMapping("/api")
public class FakerResource {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @Autowired
    FakerService fakerService;

    @GetMapping("/fake-today-games")
    @ResponseBody
    public String sample() {
        return fakerService.getTodayGames().toString();
    }
}
