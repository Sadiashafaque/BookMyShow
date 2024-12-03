package com.practice.lldbookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class City extends BaseModel{
    private String cityName;
    @OneToMany(mappedBy = "citySituated")
    private List<Theatre> theatres;

}
