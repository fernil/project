package com.example.CityDemo.Repository;

import com.example.CityDemo.Model.CityModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<CityModel, Integer> {
}
