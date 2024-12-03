package com.practice.lldbookmyshow.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
//dont create separate table for basemodel
@MappedSuperclass
public class BaseModel {
    @Id
    private int id;
}
