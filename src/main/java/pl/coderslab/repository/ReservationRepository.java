package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
