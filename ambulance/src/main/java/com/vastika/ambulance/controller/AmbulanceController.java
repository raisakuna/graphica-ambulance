package com.vastika.ambulance.controller;

import com.vastika.ambulance.dto.SuccessResponse;
import com.vastika.ambulance.entity.Ambulance;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/api/v1")
public class AmbulanceController {
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

    @GetMapping(value ="/ambulance")
    public ResponseEntity<SuccessResponse<ArrayList<Ambulance>>> getListOfAmbulance(){
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


       // return ResponseEntity.status(HttpStatus.OK).body(ambulances);

        return new ResponseEntity<>(new SuccessResponse<>(0,ambulances), HttpStatus.OK);

    }


    @GetMapping(value ="/ambulance/city")
    public String getListOfAmbulanceOfParticularCity(@RequestParam("city") String city){
        return "get ambulance by city";

    }

    @PostMapping(value ="/ambulance")
    public ResponseEntity<SuccessResponse<Ambulance>> createAmbulance(){
        Ambulance.AmbulanceBuilder builder = Ambulance.builder()
                .id(1L)
                .vehicleNumber("1234")
                .latitude(27.2345)
                .longitude(86.5433).hospitalName("Teaching Hospital");
        Ambulance ambulance =builder.build();



        return new ResponseEntity<>(new SuccessResponse<>(0,ambulance), HttpStatus.CREATED);

    }

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
