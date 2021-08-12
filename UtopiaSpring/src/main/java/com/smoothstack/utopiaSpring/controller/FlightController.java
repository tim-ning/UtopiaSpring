package com.smoothstack.utopiaSpring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@PostMapping("/flight/add")
	public Flight addFlight(@RequestParam("id") Long id, @RequestParam("routeId") String routeId,
			@RequestParam("airplaneId") String airplaneId, @RequestParam("departureTime") String departureTime,
			@RequestParam("reservedSeats") String reservedSeats, @RequestParam("seatPrice") String seatPrice) {
		return service.addFlight(new Flight(id, routeId, airplaneId, departureTime, reservedSeats, seatPrice));
	}

	@GetMapping("/flight/{id}")
	public Optional<Flight> findById(@PathVariable Long id) {
		return service.readFlightById(id);
	}

	@PostMapping("/flight/delete")
	public String deleteFlight(@RequestParam("id") Long id) {
		service.deleteFlight(id);
		return "Deleted flight with id: " + id;
	}

	@GetMapping("/route")
	public List<Route> readAllRoutes() {
		return service.readAllRoutes();
	}

	@PostMapping("/route/add")
	public Route addRoute(@RequestParam("originId") String originId,
			@RequestParam("destinationId") String destinationId) {
		return service.addRoute(new Route(originId, destinationId));
	}

	@PostMapping("/route/delete")
	public String deleteRoute(@RequestParam("id") Long id) {
		service.deleteRoute(id);
		return "Deleted route with id: " + id;
	}

	@GetMapping("/airport")
	public List<Airport> readAllAirports() {
		return service.readAllAirports();
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
