package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.entity.CinemaHall;
import pl.coderslab.service.CinemaHallService;

import javax.validation.Valid;

@Controller
@RequestMapping("/hall")
public class CinemaHallController {
    private final CinemaHallService cinemaHallService;

    @Autowired
    public CinemaHallController(CinemaHallService cinemaHallService) {
        this.cinemaHallService = cinemaHallService;
    }

    @GetMapping("/add")
    public String addHall(Model model) {
        model.addAttribute("cinemaHall", new CinemaHall());

        return "cinemaHall/add";
    }

    @PostMapping("/add")
    public String addHall(@Valid CinemaHall cinemaHall, BindingResult result) {
        if (result.hasErrors()) {
            return "cinemaHall/add";
        }
        cinemaHallService.save(cinemaHall);

        return "redirect:/hall";
    }

    @GetMapping("")
    public String halls(Model model) {
        model.addAttribute("halls", cinemaHallService.findAll());

        return "cinemaHall/list";
    }

/*    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("hall", cinemaHallService.findOne(id));

        return "cinemaHall/confirm";
    }

    @GetMapping("/delete/confirmed/{id}")
    public String confirmDelete(@PathVariable int id) {
        cinemaHallService.delete(cinemaHallService.findOne(id));

        return "redirect:/hall";
    }*/


    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("cinemaHall", cinemaHallService.findOne(id));

        return "cinemaHall/edit";
    }

    @PostMapping("/edit")
    public String edit(@Valid CinemaHall cinemaHall, BindingResult result) {
        if(result.hasErrors()) {
            return "cinemaHall/edit";
        }
        cinemaHallService.save(cinemaHall);

        return "redirect:/hall";
    }
}
