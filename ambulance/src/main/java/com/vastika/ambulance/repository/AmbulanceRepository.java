package com.vastika.ambulance.repository;

import com.vastika.ambulance.entity.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AmbulanceRepository extends JpaRepository<Ambulance, Long>{



}
