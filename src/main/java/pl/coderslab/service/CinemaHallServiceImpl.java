package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.entity.CinemaHall;
import pl.coderslab.repository.CinemaHallRepository;

import java.util.List;

@Service
public class CinemaHallServiceImpl implements CinemaHallService {
    private final CinemaHallRepository cinemaHallRepository;

    public CinemaHallServiceImpl(CinemaHallRepository cinemaHallRepository) {
        this.cinemaHallRepository = cinemaHallRepository;
    }

    @Override
    public List<CinemaHall> findAll() {
        return cinemaHallRepository.findAll();
    }

    @Override
    public CinemaHall save(CinemaHall cinemaHall) {
        return cinemaHallRepository.save(cinemaHall);
    }

    @Override
    public CinemaHall findOne(int id) {
        return cinemaHallRepository.findOne(id);
    }

//    @Override
//    public void delete(CinemaHall cinemaHall) {
//        cinemaHallRepository.delete(cinemaHall);
//    }

}
