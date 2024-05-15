package com.vastika.ambulance.repository;

import com.vastika.ambulance.entity.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AmbulanceRepository extends JpaRepository<Ambulance, Long>{

    // select * from ambulance_tbl where city = ''
    Optional<Ambulance> findByCity(String city);

    // select * from ambulance_tbl where id = '' and city = ''
    Optional<Ambulance> findByAmbulanceIdAndCity(Long id,String city);


}
