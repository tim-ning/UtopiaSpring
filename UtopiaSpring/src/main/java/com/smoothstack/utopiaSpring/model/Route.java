package com.smoothstack.utopiaSpring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Route {

	@Id
	private Long id;
	private String originId, destinationId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOriginId() {
		return originId;
	}

	public void setOriginId(String originId) {
		this.originId = originId;
	}

	public String getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}

}
