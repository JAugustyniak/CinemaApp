package pl.coderslab.service;

import pl.coderslab.entity.Seat;

import java.util.List;

public interface SeatService {
    Seat save(Seat seat);

    List<Seat> save(List<Seat> seats);

    List<Seat> findAll();
}
