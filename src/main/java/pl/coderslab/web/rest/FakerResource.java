package pl.coderslab.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.services.FakerCountryService;
import pl.coderslab.services.FakerService;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@RestController
@RequestMapping("/api")
public class FakerResource {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @Autowired
    FakerService fakerService;

    @Autowired
    FakerCountryService fakerCountryService;

    @GetMapping("/fake-today-games")
    @ResponseBody
    public String sample() {
        return fakerService.getTodayGames().toString();
    }

    @GetMapping("/fake-countries")
    @ResponseBody
    public String countries() {
        return fakerCountryService.getCountries().toString();
    }
}
