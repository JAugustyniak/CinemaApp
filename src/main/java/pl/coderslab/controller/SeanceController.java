package pl.coderslab.controller;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Seance;
import pl.coderslab.entity.Seat;
import pl.coderslab.service.CinemaHallService;
import pl.coderslab.service.MovieService;
import pl.coderslab.service.SeanceService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/seance")
public class SeanceController {
    private final SeanceService seanceService;
    private final MovieService movieService;
    private final CinemaHallService cinemaHallService;

    @Autowired
    public SeanceController(
            SeanceService seanceService,
            MovieService movieService,
            CinemaHallService cinemaHallService
    ) {
        this.seanceService = seanceService;
        this.movieService = movieService;
        this.cinemaHallService = cinemaHallService;
    }

    @GetMapping("/add")
    public String addSeance(Model model) {
        model.addAttribute("seance", new Seance());

        return "seance/add";
    }

    @PostMapping("/add")
    public String addSeance(@Valid Seance seance, BindingResult result) {
        if (result.hasErrors()) {
            return "seance/add";
        }

        List<Seat> seats = new ArrayList<>();
        int numberOfSeats = seance.getCinemaHall().getNumberOfRows() * seance.getCinemaHall().getSeatsInRow();

        for (int i = 1; i <= numberOfSeats; i++) {
            seats.add(new Seat(i));
        }
        seance.setSeats(seats);
        seanceService.save(seance);

        return "redirect:/seance";
    }

    @GetMapping("")
    public String seances(Model model) {
        DateTime dateTime = new DateTime();

        DateTime addWeek = dateTime.plusDays( 7 ).withTimeAtStartOfDay();
        model.addAttribute("seances", seanceService.findAllByDateBetween(dateTime.toDate(), addWeek.toDate()));

        return "seance/list";
    }

    @PostMapping("")
    public String seancesByDate(@RequestParam String date, Model model) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
        DateTime dateTime = formatter.parseDateTime(date);

        DateTime nextDay = dateTime.plusDays( 1 ).withTimeAtStartOfDay();
        model.addAttribute("seances", seanceService.findAllByDateBetween(dateTime.toDate(), nextDay.toDate()));

        return "seance/list";
    }

    @ModelAttribute
    private void addAttributes(Model model) {
        model.addAttribute("cinemaHalls", cinemaHallService.findAll());
        model.addAttribute("movies", movieService.findAll());
    }
}
