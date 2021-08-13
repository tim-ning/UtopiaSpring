package com.smoothstack.utopiaSpring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	private Long id;
	private Long routeId;
	private String airplaneId, departureTime, reservedSeats, seatPrice;

	public Flight() {
	}

	public Flight(Long id, Long routeId, String airplaneId, String departureTime, String reservedSeats,
			String seatPrice) {
		this.id = id;
		this.routeId = routeId;
		this.airplaneId = airplaneId;
		this.departureTime = departureTime;
		this.reservedSeats = reservedSeats;
		this.seatPrice = seatPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRouteId() {
		return routeId;
	}

	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}

	public String getAirplaneId() {
		return airplaneId;
	}

	public void setAirplaneId(String airplaneId) {
		this.airplaneId = airplaneId;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getReservedSeats() {
		return reservedSeats;
	}

	public void setReservedSeats(String reservedSeats) {
		this.reservedSeats = reservedSeats;
	}

	public String getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(String seatPrice) {
		this.seatPrice = seatPrice;
	}

}
