package com.smoothstack.utopiaSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaSpring.dao.BookingGuestDao;
import com.smoothstack.utopiaSpring.model.BookingGuest;

@Service
public class BookingGuestService {

	@Autowired
	private BookingGuestDao bookingGuestDao;

	public List<BookingGuest> readAllBookingGuests() {
		return bookingGuestDao.findAll();
	}

	public Optional<BookingGuest> readBookingGuestById(Long id) {
		return bookingGuestDao.findById(id);
	}

	public BookingGuest addBookingGuest(BookingGuest newBookingGuest) {
		return bookingGuestDao.save(newBookingGuest);
	}

	public void deleteBookingGuest(Long id) {
		bookingGuestDao.deleteById(id);
	}
	
}