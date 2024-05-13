package com.vastika.ambulance.controller;

import com.vastika.ambulance.dto.SuccessResponse;
import com.vastika.ambulance.entity.Ambulance;
import com.vastika.ambulance.repository.AmbulanceRepository;
import com.vastika.ambulance.service.AmbulanceService;
import com.vastika.ambulance.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/api/v1")
public class AmbulanceController {

    @Autowired
    private AmbulanceService ambulanceService;

    @Autowired
    private AmbulanceRepository ambulanceRepository;
    /**
     * Different HTTP methods
     * 1. GET -
     * 2. POST -
     * 3. PATCH -
     * 4. PUT -
     * 5. DELETE -
     */

    /** ============================ HTTP Protocol ===============
     *
     * HTTP Protocol - 80
     * HTTPs Protocol -443
     *
     * Different HTTP Status code
     * 200 -Successful
     * 201 - Created
     * 204 - No Content
     * 302 - Redirection
     *
     * Client Side
     * 400 - Bad Request
     * 401 - Unauthorized
     * 403 - Forbidden
     * 404 - Not Found
     * 422 - Unprocessable Entity
     *
     * Server Side Error
     * 500 - Internal Server Error
     * 502 -Bad Gateway
     * 503 - Service Not Available
     *
     */

   /* //Without Response Entity
   @GetMapping(value ="/ambulance")
    public ArrayList<Ambulance> getListOfAmbulance(){
         ArrayList<Ambulance> ambulances = new ArrayList<>();
       Ambulance.AmbulanceBuilder builder = Ambulance.builder()
               .id(1L)
               .vehicleNumber("1234")
               .latitude(27.2345)
               .longitude(86.5433).hospitalName("Teaching Hospital");
       Ambulance ambulance =builder.build();
         for(int i =0; i <=5; i++)
         {
             ambulances.add(ambulance);
         }


        return ambulances;

    }*/

    /*@GetMapping(value ="/ambulance")
    public ResponseEntity<SuccessResponse<ArrayList<Ambulance>>> getListOfAmbulance(){
        ArrayList<Ambulance> ambulances = new ArrayList<>();
        Ambulance.AmbulanceBuilder builder = Ambulance.builder()
                //.id(1L)
                .vehicleNumber("1234")
                .latitude(27.2345)
                .longitude(86.5433)
                .hospitalName("Teaching Hospital");
        Ambulance ambulance =builder.build();
        for(int i =0; i <=5; i++)
        {
            ambulances.add(ambulance);
        }
*/

    @GetMapping("/ambulance")
    public ResponseEntity<SuccessResponse<List<Ambulance>>> getListOfAmbulance() {
        List<Ambulance> ambulances = ambulanceService.getAllAmbulance();
        return new ResponseEntity<>(new SuccessResponse<>(0, ambulances), HttpStatus.OK);
    }

// Getting body by RequestParam
    @GetMapping(value ="/ambulance/{id}")
    public ResponseEntity<SuccessResponse<Ambulance>> getListOfAmbulanceOfParticularCity(@RequestParam(value ="id") String ambulanceId){
        Ambulance ambulance = ambulanceService.getAmbulanceDetails(Long.parseLong(ambulanceId));
        return new ResponseEntity<>(new SuccessResponse<>(Constant.SUCCESS, ambulance),HttpStatus.OK);

    }

    /*@PostMapping(value ="/ambulance")
    public ResponseEntity<SuccessResponse<Ambulance>> createAmbulance(){
        Ambulance.AmbulanceBuilder builder = Ambulance.builder()
               // .id(1L)
                .vehicleNumber("1234")
                .latitude(27.2345)
                .longitude(86.5433).hospitalName("Teaching Hospital");
        Ambulance ambulance =builder.build();



        return new ResponseEntity<>(new SuccessResponse<>(0,ambulance), HttpStatus.CREATED);

    }*/

    // Constructor injection of AmbulanceService
    public AmbulanceController(AmbulanceService ambulanceService) {
        this.ambulanceService = ambulanceService;
    }


    // Getting body by Requestbody
    @PostMapping(value ="/ambulance")
    public ResponseEntity<SuccessResponse<Ambulance>> createAmbulance(@RequestBody Ambulance ambulance) {
        Ambulance savedAmbulance = ambulanceRepository.save(ambulance);
        return new ResponseEntity<>(new SuccessResponse<>(Constant.SUCCESS, savedAmbulance), HttpStatus.OK);
    }

    /*
    @PostMapping(value ="/ambulance")
    public ResponseEntity<SuccessResponse<Ambulance>> createAmbulance(@RequestBody Ambulance ambulance) {
        return new ResponseEntity<>(new SuccessResponse<>(0, ambulance), HttpStatus.OK);
    }*/
    @PutMapping(value ="/ambulance")
    public String updateAmbulance(){
        return "ambulance data updated";

    }

    @PatchMapping(value ="/ambulance")
    public String updateAmbulanceAvailability(){
        return "update ambulance availability";

    }

    @DeleteMapping(value ="/ambulance")
    public ResponseEntity<String> deleteAmbulance(){
        // 204
        return new ResponseEntity<>("Delete Ambulance Data", HttpStatus.NO_CONTENT);

    }



    //baseurl/api/v1/


}
