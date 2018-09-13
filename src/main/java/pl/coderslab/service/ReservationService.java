package pl.coderslab.service;

import pl.coderslab.entity.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation save(Reservation reservation);

    List<Reservation> findAll();

    Reservation findById(int id);

    void delete(Reservation reservation);
}