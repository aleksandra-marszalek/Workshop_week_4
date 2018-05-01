package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.services.FakerService;

@Controller
public class GamesController {

    @Autowired
    FakerService fakerService;

    @GetMapping("/fake-today-games")
    @ResponseBody
    public String sample() {
        return fakerService.getTodayGames().toString();
    }
}
