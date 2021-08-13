package com.smoothstack.utopiaSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaSpring.dao.BookingDao;
import com.smoothstack.utopiaSpring.model.Booking;

@Service
public class BookingService {

	@Autowired
	private BookingDao bookingDao;

	public List<Booking> readAllBookings() {
		return bookingDao.findAll();
	}

	public Optional<Booking> readBookingById(Long id) {
		return bookingDao.findById(id);
	}

	public Booking addBooking(Booking newBooking) {
		return bookingDao.save(newBooking);
	}

	public void deleteBooking(Long id) {
		bookingDao.deleteById(id);
	}
	
}
