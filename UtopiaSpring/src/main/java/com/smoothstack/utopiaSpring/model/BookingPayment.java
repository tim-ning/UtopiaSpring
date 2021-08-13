package com.smoothstack.utopiaSpring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingPayment {

	@Id
	private Long id;
	private String stripeId;
	private Integer refunded;
	
	public BookingPayment() {
	}
	
	public BookingPayment(Long id, String stripeId, Integer refunded) {
		this.id = id;
		this.stripeId = stripeId;
		this.refunded = refunded;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStripeId() {
		return stripeId;
	}

	public void setStripeId(String stripeId) {
		this.stripeId = stripeId;
	}

	public Integer getRefunded() {
		return refunded;
	}

	public void setRefunded(Integer refunded) {
		this.refunded = refunded;
	}
}
