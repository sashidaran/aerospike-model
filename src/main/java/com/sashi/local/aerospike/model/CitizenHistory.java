package com.sashi.local.aerospike.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class CitizenHistory implements Serializable {
    private String typeOfRecord;
    private String dateOfIncident;
    private String impactOfIncident;
    private String recognition;
    private String typeOfLoss;
    private String currency;
    private long amount;
    private Boolean isLossForExchequer;
    private Boolean isLossForCitizen;
    private Boolean isMonetaryBenefit;
    private Boolean isHonorary;
}
