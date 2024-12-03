package com.practice.lldbookmyshow.models;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    @ManyToOne
    private Show show;
    @ManyToMany
    private List<Seat> seats;
    private int amount;
    @ManyToOne
    private User bookedBy;



}
