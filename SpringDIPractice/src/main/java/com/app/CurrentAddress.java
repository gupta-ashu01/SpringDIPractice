package com.app;

import org.springframework.stereotype.Component;

@Component
public class CurrentAddress implements Address {

    private String city;
    private String state;
    private String house;
    private int pincode;

    private String landmark;

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

   

    public CurrentAddress(String city, String house, String state, int pincode) {
        this.city = city;
        this.state = state;
        this.house = house;
        this.pincode = pincode;
    }

    public String getAddress() {
        return city + ", " + state + ", " + house + ", " + pincode +", "+landmark;
    }

    @Override
    public String toString() {
        return "CurrentAddress [city=" + city + ", state=" + state + ", house=" + house + ", pincode=" + pincode + ", landmark=" + landmark + "]";
    }

}
