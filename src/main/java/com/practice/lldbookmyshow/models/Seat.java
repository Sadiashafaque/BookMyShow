package com.practice.lldbookmyshow.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Seat_Entity")

//   1 ---->   1  one seat will have 1 seattype
//Seat ---- SeatType
// M <--------- 1   one seatype will belong to many seats
public class Seat extends BaseModel {
    @ManyToOne
    private  SeatType seatType;
    @Column(name = "row_num")
    private int col;
    @Column(name = "col_num")
    private int row;
}
