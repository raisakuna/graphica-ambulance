package com.vastika.ambulance.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Ambulance {
    private Long id;
    private String vehicleNumber;
    private double latitude;
    private double longitude;
    private String hospitalName;

    Ambulance(Long id, String vehicleNumber, double latitude, double longitude, String hospitalName) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.hospitalName = hospitalName;
    }

    public static AmbulanceBuilder builder() {
        return new AmbulanceBuilder();
    }


    public static class AmbulanceBuilder {
        private Long id;
        private String vehicleNumber;
        private double latitude;
        private double longitude;
        private String hospitalName;

        AmbulanceBuilder() {
        }

        public AmbulanceBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public AmbulanceBuilder vehicleNumber(String vehicleNumber) {
            this.vehicleNumber = vehicleNumber;
            return this;
        }

        public AmbulanceBuilder latitude(double latitude) {
            this.latitude = latitude;
            return this;
        }

        public AmbulanceBuilder longitude(double longitude) {
            this.longitude = longitude;
            return this;
        }

        public AmbulanceBuilder hospitalName(String hospitalName) {
            this.hospitalName = hospitalName;
            return this;
        }

        public Ambulance build() {
            return new Ambulance(id, vehicleNumber, latitude, longitude, hospitalName);
        }

        public String toString() {
            return "Ambulance.AmbulanceBuilder(id=" + this.id + ", vehicleNumber=" + this.vehicleNumber + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", hospitalName=" + this.hospitalName + ")";
        }
    }
}
