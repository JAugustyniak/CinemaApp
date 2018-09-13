package pl.coderslab.entity;

import javax.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean available = true;
    private int seatNumber;
    @ManyToOne
    private CinemaHall cinemaHall;

    public Seat() {
    }

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public CinemaHall getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(CinemaHall cinemaHall) {
        this.cinemaHall = cinemaHall;
    }
}
