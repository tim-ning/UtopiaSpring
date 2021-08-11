package com.smoothstack.utopiaSpring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airplane {

	@Id
	private Long id;
	private Integer typeId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

}
