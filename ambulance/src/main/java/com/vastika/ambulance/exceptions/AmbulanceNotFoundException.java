package com.vastika.ambulance.exceptions;

import com.vastika.ambulance.utils.Constants;

public class AmbulanceNotFoundException extends RuntimeException{
    public AmbulanceNotFoundException(){
        super(Constants.ErrorMessage.AMBULANCE_NOT_FOUND_MESSAGE);
    }
    public AmbulanceNotFoundException(String message){
        super(message);
    }
}
