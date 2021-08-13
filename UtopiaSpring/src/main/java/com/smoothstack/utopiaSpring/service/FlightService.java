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

	private final String pageEnd = "</table><div style=\"height: 250px;\"></div></body></html>";

	// start of html page
	private String getPageStart(String title) {
		String pageStart = "<html><head><title>" + title + "</title><style type=\"text/css\">"
				+ "body{ font-family: Verdana; } " + "td{ border: 1px solid LightGray; padding: 5px; }"
				+ "</style></head><body><table>";
		return pageStart;
	}

	// returns html page
	public String readAllFlightsAndRoutes() {
		StringBuilder sb = new StringBuilder();
		sb.append(getPageStart("View All Flights"));
		sb.append("<tr><th>Flight ID</th><th>Origin</th><th>Destination</th><th>Departure Time</th>"
				+ "<th>Reserved Seats</th><th>Price</th></tr>");

		List<Flight> flights = flightDao.findAll();
		for (Flight f : flights) {
			Route r = routeDao.getById(f.getRouteId());
			Airport a0 = airportDao.getById(r.getOriginId());
			Airport a1 = airportDao.getById(r.getDestinationId());

			sb.append("<tr><td>" + f.getId() + "</td><td>" + a0.getIataId() + ", " + a0.getCity() + "</td><td>"
					+ a1.getIataId() + ", " + a1.getCity() + "</td><td>" + f.getDepartureTime() + "</td><td>"
					+ f.getReservedSeats() + "</td><td>" + "$" + f.getSeatPrice() + "</td></tr>");
		}
		
		sb.append(pageEnd);
		return sb.toString();
	}

	// returns list of json objects
	public List<Flight> readAllFlights() {
		return flightDao.findAll();
	}

	public Optional<Flight> readFlightById(Long id) {
		return flightDao.findById(id);
	}

	public String readAllRoutes() {
		StringBuilder sb = new StringBuilder();
		sb.append(getPageStart("View All Routes"));
		sb.append("<tr><th>Route ID</th><th>Origin</th><th>Destination</th></tr>");

		List<Route> routes = routeDao.findAll();
		for (Route r : routes) {
			Airport a0 = airportDao.getById(r.getOriginId());
			Airport a1 = airportDao.getById(r.getDestinationId());
			sb.append("<tr><td>" + r.getId() + "</td><td>" + a0.getIataId() + ", " + a0.getCity() + "</td><td>"
					+ a1.getIataId() + ", " + a1.getCity() + "</td></tr>");
		}

		sb.append(pageEnd);
		return sb.toString();
	}

	public Route addRoute(Route newRoute) {
		return routeDao.save(newRoute);
	}

	public void deleteRoute(Long id) {
		routeDao.deleteById(id);
	}

	public String readAllAirports() {
		StringBuilder sb = new StringBuilder();
		sb.append(getPageStart("View All Airports"));
		sb.append("<tr><th>IATA ID</th><th>City</th></tr>");

		List<Airport> airports = airportDao.findAll();
		for (Airport a : airports) {
			sb.append("<tr><td>" + a.getIataId() + "</td><td>" + a.getCity() + "</td></tr>");
		}

		sb.append(pageEnd);
		return sb.toString();
	}

	public Flight addFlight(Flight newFlight) {
		return flightDao.save(newFlight);
	}

	public void deleteFlight(Long id) {
		flightDao.deleteById(id);
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
	 */
}
