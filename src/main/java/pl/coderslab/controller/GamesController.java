package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.services.FakerService;

public class GamesController {

    @Autowired
    FakerService fakerService;

    @GetMapping(path= "/fake-today-games") public String sample() {
        return fakerService.getTodayGames().toString();
    }
}
