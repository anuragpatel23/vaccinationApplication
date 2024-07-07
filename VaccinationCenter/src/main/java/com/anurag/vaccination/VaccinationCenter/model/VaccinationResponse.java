package com.anurag.vaccination.VaccinationCenter.model;

import com.anurag.vaccination.VaccinationCenter.entity.VaccinationCenter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccinationResponse {

    private VaccinationCenter vaccinationCenter;
    private List<Citizen> citizens;
}
