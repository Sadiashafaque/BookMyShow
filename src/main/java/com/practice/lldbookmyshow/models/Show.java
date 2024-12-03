package com.practice.lldbookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity(name = "Show_Entity")
public class Show extends BaseModel {
    @ManyToOne
    private Theatre theatre;
    private Date StartTIme;
    private Date EndTIme;
    @ManyToOne
    private Movie movie;
    @ManyToOne          //important
    private Auditorium auditorium;
}
