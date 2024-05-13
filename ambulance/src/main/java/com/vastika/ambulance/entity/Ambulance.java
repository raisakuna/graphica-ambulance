package com.vastika.ambulance.entity;

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

    @Column(name="vehicle_number")
    private String vehicleNumber;
    @Column(name="latitude")
    private double latitude;
    @Column(name="longitude")
    private double longitude;
    @Column(name = "hospital_name")
    private String hospitalName;




}
