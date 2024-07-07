package com.anurag.vaccination.VaccinationCenter.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {

    private int id;

    @Column
    private String name;

    @Column
    private int vaccinationCenterId;
}
