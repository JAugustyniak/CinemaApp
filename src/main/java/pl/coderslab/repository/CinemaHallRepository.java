package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.CinemaHall;

public interface CinemaHallRepository extends JpaRepository<CinemaHall, Integer> {
}
