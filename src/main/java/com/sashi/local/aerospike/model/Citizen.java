package com.sashi.local.aerospike.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
public class Citizen implements Serializable {
    private String nationalId;
    private String firstName;
    private String lastName;
    private String occupation;
    private int age;
}
