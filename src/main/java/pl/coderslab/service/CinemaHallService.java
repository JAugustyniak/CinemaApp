package pl.coderslab.service;

import pl.coderslab.entity.CinemaHall;

import java.util.List;

public interface CinemaHallService {
    List<CinemaHall> findAll();

    CinemaHall save(CinemaHall cinemaHall);

    CinemaHall findOne(int id);

//    void delete(CinemaHall cinemaHall);

}
