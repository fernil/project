package com.example.CityDemo.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class CityModel {
    @Id
    private Integer id;
    private String name;
    private String countryCode;
    private String district;
    private Long population;

    public CityModel(Integer id, String name, String countryCode, String district, Long population) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.district = district;
        this.population = population;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public Long getPopulation() {
        return population;
    }
}
