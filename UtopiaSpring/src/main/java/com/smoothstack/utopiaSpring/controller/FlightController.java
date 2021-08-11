package com.smoothstack.utopiaSpring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.utopiaSpring.model.*;
import com.smoothstack.utopiaSpring.service.FlightService;

@RestController
@RequestMapping("/utopia")
public class FlightController {

	@Autowired
	private FlightService service;

	@GetMapping("/flight")
	public List<Flight> readAllFlights() {
		return service.readAllFlights();
	}

	@GetMapping("/flight/{id}")
	public Optional<Flight> findById(@PathVariable Long id) {
		return service.readFlightById(id);
	}

	@GetMapping("/route")
	public List<Route> readAllRoutes() {
		return service.readAllRoutes();
	}

	@GetMapping("/airport")
	public List<Airport> readAllAirports() {
		return service.readAllAirports();
	}

}
