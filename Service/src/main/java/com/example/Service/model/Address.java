package com.example.Service.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private long id;
    private String kladr_id;


}
