package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
