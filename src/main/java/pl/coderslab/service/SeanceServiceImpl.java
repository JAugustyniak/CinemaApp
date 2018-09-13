package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.entity.Seance;
import pl.coderslab.repository.SeanceRepository;

import java.util.Date;
import java.util.List;

@Service
public class SeanceServiceImpl implements SeanceService {
    private final SeanceRepository seanceRepository;

    public SeanceServiceImpl(SeanceRepository seanceRepository) {
        this.seanceRepository = seanceRepository;
    }

    @Override
    public Seance findOne(int id) {
        return seanceRepository.findOne(id);
    }

    @Override
    public List<Seance> findAll() {
        return seanceRepository.findAll();
    }

    @Override
    public Seance save(Seance seance) {
        return seanceRepository.save(seance);
    }

    @Override
    public List<Seance> findAllByDateBetween(Date from, Date to) {
        return seanceRepository.findAllByDateBetween(from, to);
    }
}
