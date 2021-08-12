package com.smoothstack.utopiaSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaSpring.dao.*;
import com.smoothstack.utopiaSpring.model.*;

@Service
public class FlightService {

	@Autowired
	private FlightDao flightDao;

	@Autowired
	private RouteDao routeDao;

	@Autowired
	private AirportDao airportDao;

	public List<Flight> readAllFlights() {
		return flightDao.findAll();
	}

	public Optional<Flight> readFlightById(Long id) {
		return flightDao.findById(id);
	}

	public List<Route> readAllRoutes() {
		return routeDao.findAll();
	}

	public Route addRoute(Route newRoute) {
		return routeDao.save(newRoute);
	}

	public void deleteRoute(Long id) {
		routeDao.deleteById(id);
	}

	public List<Airport> readAllAirports() {
		return airportDao.findAll();
	}

	public Flight addFlight(Flight newFlight) {
		return flightDao.save(newFlight);
	}

	public void deleteFlight(Long id) {
		flightDao.deleteById(id);
	}

}
