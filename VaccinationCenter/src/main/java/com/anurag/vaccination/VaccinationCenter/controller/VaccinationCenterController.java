package com.anurag.vaccination.VaccinationCenter.controller;

import com.anurag.vaccination.VaccinationCenter.entity.VaccinationCenter;
import com.anurag.vaccination.VaccinationCenter.model.VaccinationResponse;
import com.anurag.vaccination.VaccinationCenter.services.CenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {

    @Autowired
    CenterService centerService;

    @PostMapping("/add")
    public ResponseEntity<VaccinationCenter> addCenter(@RequestBody VaccinationCenter vaccinationCenter){
        VaccinationCenter vaccinationCenterAdded= centerService.addCenter(vaccinationCenter);

        return new ResponseEntity<>(vaccinationCenterAdded, HttpStatus.CREATED);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<VaccinationResponse> getAllDataBasedOnCenterId(@PathVariable("id") Integer id){
        VaccinationResponse vaccinationResponse = centerService.getAllCenter(id);
        return new ResponseEntity<>(vaccinationResponse, HttpStatus.CREATED);
    }
}
