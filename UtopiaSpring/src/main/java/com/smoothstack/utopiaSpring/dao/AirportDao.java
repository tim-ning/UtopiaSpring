package com.smoothstack.utopiaSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaSpring.model.Airport;

@Repository
public interface AirportDao extends JpaRepository<Airport, String> {

}
