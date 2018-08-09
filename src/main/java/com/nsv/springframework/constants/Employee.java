package com.nsv.springframework.constants;

import java.util.List;
import java.util.Map;

public class Employee {

    private String name;
    private int age;
    private String companyName;
    private List<String> companyLocations;
    private Map<String,String> companyLocationsGlobalMap;
    private Map<String,String> companyLocationsLocalMap;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<String> getCompanyLocations() {
        return companyLocations;
    }

    public void setCompanyLocations(List<String> companyLocations) {
        this.companyLocations = companyLocations;
    }

    public Map<String, String> getCompanyLocationsGlobalMap() {
        return companyLocationsGlobalMap;
    }

    public void setCompanyLocationsGlobalMap(Map<String, String> companyLocationsGlobalMap) {
        this.companyLocationsGlobalMap = companyLocationsGlobalMap;
    }

    public Map<String, String> getCompanyLocationsLocalMap() {
        return companyLocationsLocalMap;
    }

    public void setCompanyLocationsLocalMap(Map<String, String> companyLocationsLocalMap) {
        this.companyLocationsLocalMap = companyLocationsLocalMap;
    }
}
