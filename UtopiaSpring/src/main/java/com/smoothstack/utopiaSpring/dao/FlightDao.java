package com.smoothstack.utopiaSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaSpring.model.Flight;

@Repository
public interface FlightDao extends JpaRepository<Flight, Long> {
	
}
