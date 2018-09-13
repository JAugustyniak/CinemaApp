package pl.coderslab.service;

import pl.coderslab.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    Movie save(Movie movie);

    Movie findById(int id);
}
