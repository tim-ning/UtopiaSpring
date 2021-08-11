package com.smoothstack.utopiaSpring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	private Long id;
	private String routeId, airplaneId, departureTime, reservedSeats, seatPrice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
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
