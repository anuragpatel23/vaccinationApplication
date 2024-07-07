package com.anurag.vaccination.CitizenService.services;

import com.anurag.vaccination.CitizenService.entity.Citizen;
import com.anurag.vaccination.CitizenService.repositories.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenService {

    @Autowired
    CitizenRepository citizenRepository;

    public List<Citizen> findCitizenInVaccinationCenter(Integer id){
        return citizenRepository.findByVaccinationCenterId(id);
    }

    public Citizen addCitizen(Citizen citizen){
        return citizenRepository.save(citizen);
    }

}
