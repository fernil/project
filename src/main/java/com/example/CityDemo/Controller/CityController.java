package com.example.CityDemo.Controller;

import com.example.CityDemo.Model.CityModel;
import com.example.CityDemo.Repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/city/all")
        public List<CityModel> getAllCities(){
        return cityRepository.findAll();

    }

    @GetMapping("city/{id}")
    public CityModel getCity(@PathVariable("id") Integer id){
        return cityRepository.findById(id).get();
    }
}
