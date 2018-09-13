package pl.coderslab.entity;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
public class CinemaHall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Min(1)
    private int numberOfRows;
    @Min(1)
    private int seatsInRow;
    @NotBlank
    private String name;
    @OneToMany(mappedBy = "cinemaHall", cascade = CascadeType.ALL)
    private List<Seance> seance;

    public CinemaHall() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public int getSeatsInRow() {
        return seatsInRow;
    }

    public void setSeatsInRow(int seatsInRow) {
        this.seatsInRow = seatsInRow;
    }

    public List<Seance> getSeance() {
        return seance;
    }

    public void setSeance(List<Seance> seance) {
        this.seance = seance;
    }
}
