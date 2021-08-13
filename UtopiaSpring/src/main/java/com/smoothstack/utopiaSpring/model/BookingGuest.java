package com.smoothstack.utopiaSpring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingGuest {

	@Id
	private Long bookingId;
	private String contactEmail, contactPhone;
	
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
}
