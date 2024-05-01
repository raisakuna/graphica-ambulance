package com.vastika.ambulance.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SuccessResponse <T>{
    private  int status;
    private T data;
}
