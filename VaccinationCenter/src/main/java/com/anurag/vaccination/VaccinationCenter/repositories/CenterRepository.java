package com.anurag.vaccination.VaccinationCenter.repositories;

import com.anurag.vaccination.VaccinationCenter.entity.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CenterRepository extends JpaRepository<VaccinationCenter, Integer> {
}
