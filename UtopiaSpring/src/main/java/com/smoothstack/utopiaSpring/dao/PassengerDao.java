package com.smoothstack.utopiaSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaSpring.model.Passenger;



@Repository
public interface PassengerDao extends JpaRepository<Passenger, Long>{

}