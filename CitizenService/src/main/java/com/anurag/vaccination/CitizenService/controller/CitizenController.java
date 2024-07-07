package com.anurag.vaccination.CitizenService.controller;

import com.anurag.vaccination.CitizenService.entity.Citizen;
import com.anurag.vaccination.CitizenService.services.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    CitizenService citizenService;

    @GetMapping("id/{id}")
    public ResponseEntity<List<Citizen>> getById(@PathVariable("id") Integer id){
        List<Citizen> citizens = citizenService.findCitizenInVaccinationCenter(id);

        return new ResponseEntity<>(citizens, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen){
        Citizen citizen = citizenService.addCitizen(newCitizen);
        return new ResponseEntity<>(citizen, HttpStatus.CREATED);
    }
}
