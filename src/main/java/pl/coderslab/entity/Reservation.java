package pl.coderslab.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private Seance seance;
    @ManyToOne
    private User user;
    @OneToMany
    private List<Seat> seats;

    public Reservation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
