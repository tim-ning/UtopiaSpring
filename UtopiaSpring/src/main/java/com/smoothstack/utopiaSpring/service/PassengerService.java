package com.smoothstack.utopiaSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaSpring.dao.PassengerDao;
import com.smoothstack.utopiaSpring.model.Passenger;

@Service
public class PassengerService {

	@Autowired
	private PassengerDao passengerDao;

	public List<Passenger> readAllPassengers() {
		return passengerDao.findAll();
	}

	public Optional<Passenger> readPassengerById(Long id) {
		return passengerDao.findById(id);
	}

	public Passenger addPassenger(Passenger newPassenger) {
		return passengerDao.save(newPassenger);
	}

	public void deletePassenger(Long id) {
		passengerDao.deleteById(id);
	}
	
}