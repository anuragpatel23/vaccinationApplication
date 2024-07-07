package com.anurag.vaccination.CitizenService.repositories;

import com.anurag.vaccination.CitizenService.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Integer> {

    public List<Citizen> findByVaccinationCenterId(Integer id);

}