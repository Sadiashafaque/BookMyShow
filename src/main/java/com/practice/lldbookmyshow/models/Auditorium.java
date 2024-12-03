package com.practice.lldbookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    @OneToMany
    private List<Seat> seats;
    @ManyToOne
    private Theatre theatreName;
}
