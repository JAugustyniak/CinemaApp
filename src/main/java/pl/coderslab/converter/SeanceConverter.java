package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.entity.Seance;
import pl.coderslab.repository.SeanceRepository;

public class SeanceConverter implements Converter<String, Seance> {

    @Autowired
    private SeanceRepository seanceRepository;

    public Seance convert(String id) {
        return seanceRepository.findOne(Integer.parseInt(id));
    }
}
