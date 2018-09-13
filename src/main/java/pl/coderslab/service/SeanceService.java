package pl.coderslab.service;

import pl.coderslab.entity.Seance;

import java.util.Date;
import java.util.List;

public interface SeanceService {
    Seance findOne(int id);

    List<Seance> findAll();

    Seance save(Seance seance);

    List<Seance> findAllByDateBetween(Date from, Date to);
}
