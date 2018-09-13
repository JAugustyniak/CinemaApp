package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.entity.Seat;
import pl.coderslab.repository.SeatRepository;

import java.util.List;

@Service
public class SeatServiceImpl implements SeatService {
    private final SeatRepository seatRepository;

    public SeatServiceImpl(SeatRepository seatRepository) {
        this.seatRepository = seatRepository;
    }

    @Override
    public Seat save(Seat seat) {
        return seatRepository.save(seat);
    }

    @Override
    public List<Seat> save(List<Seat> seats) {
        return seatRepository.save(seats);
    }

    @Override
    public List<Seat> findAll() {
        return seatRepository.findAll();
    }
}
