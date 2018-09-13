package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Reservation;
import pl.coderslab.entity.Seance;
import pl.coderslab.entity.Seat;
import pl.coderslab.service.ReservationService;
import pl.coderslab.service.SeanceService;
import pl.coderslab.service.SeatService;
import pl.coderslab.service.UserService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
    private final ReservationService reservationService;
    private final SeanceService seanceService;
    private final SeatService seatService;
    private final UserService userService;

    @Autowired
    public ReservationController(ReservationService reservationService, SeanceService seanceService, SeatService seatService, UserService userService) {
        this.reservationService = reservationService;
        this.seanceService = seanceService;
        this.seatService = seatService;
        this.userService = userService;
    }

    @GetMapping("/new")
    public String addReservation(@RequestParam int seanceId, Model model) {
        Seance seance = seanceService.findOne(seanceId);

        model.addAttribute("seance", seance.getId());
        model.addAttribute("reservation", new Reservation());
        model.addAttribute("rows", seance.getCinemaHall().getNumberOfRows());
        model.addAttribute("seatsInRow", seance.getCinemaHall().getSeatsInRow());
        model.addAttribute("seats", seance.getSeats());

        return "reservation/add";
    }

    @PostMapping("/new")
    public String addReservation(@Valid Reservation reservation, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "reservation/add";
        }
        reservation.setUser(userService.findOne(1));
        List<Seat> reservedSeats = reservation.getSeats();
        reservedSeats.forEach(seat -> seat.setAvailable(false));

        model.addAttribute("seats", reservedSeats.stream().map(seat -> String.valueOf(seat.getSeatNumber())).collect(Collectors.joining(", ")));
        model.addAttribute("reservation", reservation);
        seatService.save(reservedSeats);
        reservationService.save(reservation);

        return "reservation/confirm";
    }

    @GetMapping("/list")
    public String reservations(Model model) {
        model.addAttribute("reservations", reservationService.findAll());

        return "reservation/list";
    }

    @GetMapping("/cancel/{id}")
    public String cancel(@PathVariable int id) {
        Reservation reservation = reservationService.findById(id);
        List<Seat> reservedSeats = reservation.getSeats();
        reservedSeats.forEach(seat -> seat.setAvailable(true));
        reservationService.delete(reservation);

        return "redirect:/reservation/list";
    }
}