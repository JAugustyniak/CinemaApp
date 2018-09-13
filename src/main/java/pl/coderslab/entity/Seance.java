package pl.coderslab.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @DateTimeFormat(pattern="dd-MM-yyyy HH:mm")
    private Date date;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private CinemaHall cinemaHall;
    @OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Seat> seats;

    public Seance() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
