package com.vastika.ambulance.service;

import com.vastika.ambulance.entity.Ambulance;
import com.vastika.ambulance.repository.AmbulanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AmbulanceService {

    @Autowired
    private AmbulanceRepository ambulanceRepository;

    public Ambulance saveAmbulanceToDatabase(Ambulance ambulance){
      return ambulanceRepository.save(ambulance);
    }

    public List<Ambulance> getAllAmbulance(){
        return ambulanceRepository.findAll();
    }

    public Ambulance getAmbulanceDetails(Long id){
       Optional<Ambulance> optionalAmubulance= ambulanceRepository.findById(id);
       if(optionalAmubulance.isPresent()){
           return optionalAmubulance.get();
       }else{
           throw new RuntimeException("The ambulance is not present");
       }
    }

}
