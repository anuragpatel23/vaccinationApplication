package com.anurag.vaccination.VaccinationCenter.services;

import com.anurag.vaccination.VaccinationCenter.entity.VaccinationCenter;
import com.anurag.vaccination.VaccinationCenter.model.VaccinationResponse;
import com.anurag.vaccination.VaccinationCenter.repositories.CenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CenterService {

    @Autowired
    CenterRepository centerRepository;

    @Autowired
    RestTemplate restTemplate;

    public VaccinationCenter addCenter(VaccinationCenter vaccinationCenter){
        return centerRepository.save(vaccinationCenter);
    }

    public VaccinationResponse getAllCenter(Integer id){

        VaccinationResponse vaccinationResponse = new VaccinationResponse();
        vaccinationResponse.setVaccinationCenter(centerRepository.findById(id).get());

        //Citizen microservice call
        vaccinationResponse.setCitizens(restTemplate.getForObject("http://CITIZENSERVICE/citizen/id/1", List.class));

        return vaccinationResponse;
    }
}
