package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.entity.CinemaHall;
import pl.coderslab.repository.CinemaHallRepository;

public class CinemaHallConverter implements Converter<String, CinemaHall> {

    @Autowired
    private CinemaHallRepository cinemaHallRepository;

    public CinemaHall convert(String id) {
        return cinemaHallRepository.findOne(Integer.parseInt(id));
    }
}
