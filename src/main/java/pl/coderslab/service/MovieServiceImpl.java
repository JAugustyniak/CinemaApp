package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.entity.Movie;
import pl.coderslab.repository.MovieRepository;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie findById(int id) {
        return movieRepository.findOne(id);
    }
}
