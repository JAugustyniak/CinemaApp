package pl.coderslab.controller;

import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.service.SeanceService;

import java.util.Date;

@Controller
public class MainController {
    private final SeanceService seanceService;

    public MainController(SeanceService seanceService) {
        this.seanceService = seanceService;
    }

    @RequestMapping("/")
    public String getHomepage(Model model) {
        DateTime now = DateTime.now();
        DateTime tomorrowStart = now.plusDays( 1 ).withTimeAtStartOfDay();
        model.addAttribute("seances", seanceService.findAllByDateBetween(new Date(), tomorrowStart.toDate()));

        return "index";
    }
}
