package com.vastika.ambulance.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Builder
@Getter
@Table(name = "ambulance_tbl")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ambulance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ambulance_id")
    private Long ambulanceId;

    @Setter
    @Column(name="vehicle_number")
    private String vehicleNumber;

    @Setter
    @Column(name="latitude")
    private double latitude;

    @Setter
    @Column(name="longitude")
    private double longitude;

    @Setter
    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "city")
    @Setter
    private String city;

    @Column(name = "availability")
    @Setter
    @JsonProperty(value = "available") // isAvailable doesn't get updated, so we override with "available"
    private Boolean isAvailable;
    // Boolean is a wrapper class, it can handle true,false and null value. boolean doesn't handle null value.




}
