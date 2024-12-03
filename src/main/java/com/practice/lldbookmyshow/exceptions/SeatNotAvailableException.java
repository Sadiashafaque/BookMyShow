package com.practice.lldbookmyshow.exceptions;

import com.practice.lldbookmyshow.models.Seat;

public class SeatNotAvailableException extends Exception{
    public SeatNotAvailableException(String message){
        super(message);

    }
}
