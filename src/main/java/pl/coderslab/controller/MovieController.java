package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.entity.Movie;
import pl.coderslab.service.MovieService;

import javax.validation.Valid;

@Controller
@RequestMapping("/movie")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/add")
    public String addMovie(Model model) {
        model.addAttribute("movie", new Movie());

        return "movie/add";
    }

    @PostMapping("/add")
    public String addMovie(@Valid Movie movie, BindingResult result) {
        if (result.hasErrors()) {
            return "movie/add";
        }
        movieService.save(movie);

        return "redirect:/movie";
    }

    @GetMapping("")
    public String movies(Model model) {
        model.addAttribute("movies", movieService.findAll());

        return "movie/list";
    }

    @GetMapping("{id}")
    public String movie(@PathVariable int id, Model model) {
        model.addAttribute("movie", movieService.findById(id));

        return "movie/details";
    }
}
