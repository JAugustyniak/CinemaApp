package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.entity.Seat;
import pl.coderslab.repository.SeatRepository;

public class SeatConverter implements Converter<String, Seat> {

    @Autowired
    private SeatRepository seatRepository;

    public Seat convert(String id) {
        return seatRepository.findOne(Integer.parseInt(id));
    }
}
