package com.practice.lldbookmyshow.services;

import com.practice.lldbookmyshow.exceptions.InvalidArgumentsException;
import com.practice.lldbookmyshow.exceptions.SeatNotAvailableException;
import com.practice.lldbookmyshow.models.Seat;
import com.practice.lldbookmyshow.models.Show;
import com.practice.lldbookmyshow.models.ShowSeatMapping;
import com.practice.lldbookmyshow.models.ShowSeatStatus;
import com.practice.lldbookmyshow.repositories.SeatRepository;
import com.practice.lldbookmyshow.repositories.ShowRepository;
import com.practice.lldbookmyshow.repositories.ShowSeatRepository;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TicketService {
    SeatRepository seatRepository;
    ShowRepository showRepository;
    ShowSeatRepository showSeatRepository;

    public void BookTicket(List<Long> seatIds, long showId, Long userId) throws InvalidArgumentsException
    {
        //1. find objects corresponding to these ids
        List<Seat> seats = seatRepository.findAllBy(seatIds);
        Optional<Show> showOptional = showRepository.findById(showId);

        if (showOptional.isEmpty()) {
            throw new InvalidArgumentsException(
                    "Show by: " + showId + " doesn't exist."
            );
        }

    }
    @Transactional
    public getLockShowSeats(List<Seat> seats, Show show) throws SeatNotAvailableException
    {
        List<ShowSeatMapping> showSeats = showSeatRepository.findAll(seats,show);
        for(ShowSeatMapping showseat : showSeats)
        {
            if(showseat.getStatus().equals(ShowSeatStatus.BOOKED) || (showseat.getStatus().equals(ShowSeatStatus.LOCKED)))
            {
                throw new SeatNotAvailableException("Seat has already been booked.");
            }
        }
        List<ShowSeatMapping> showSeatsSaved = new ArrayList<>();
        for(ShowSeatMapping showseat : showSeats)
        {
            showseat.setStatus(ShowSeatStatus.LOCKED);
            showSeatsSaved.add(showSeatRepository.save(showseat));
        }
    }
}
