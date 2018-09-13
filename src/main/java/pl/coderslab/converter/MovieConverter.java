package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.entity.Movie;
import pl.coderslab.repository.MovieRepository;

public class MovieConverter implements Converter<String, Movie> {

    @Autowired
    private MovieRepository movieRepository;

    public Movie convert(String id) {
        return movieRepository.findOne(Integer.parseInt(id));
    }
}
