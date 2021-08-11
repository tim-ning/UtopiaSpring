package com.smoothstack.utopiaSpring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airport {

	@Id
	private String iataId;
	private String city;

	public String getIataId() {
		return iataId;
	}

	public void setIataId(String iataId) {
		this.iataId = iataId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
