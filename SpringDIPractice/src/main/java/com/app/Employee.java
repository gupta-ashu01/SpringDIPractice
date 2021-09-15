package com.app;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private Address address;
    private List<String> assets;
    private List<Address> addresses;
    private Map<String, String> performanceScore;
    private Department department;
    
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee(Address address, List<String> assets, List<Address> addresses, Map<String, String> performanceScore) {
        this.address = address;
        this.assets = assets;
        this.addresses = addresses;
        this.performanceScore = performanceScore;
    }

    public String getEmployeeAddress() {
        return this.address.getAddress();
    }

    public String getEmployeeAssets() {
        return assets.toString();
    }

    public String getEmployeeListOfAddress() {
        return addresses.toString();
    }

    public String getPerformanceScore() {
        return performanceScore.toString();
    }
}
