package com.smoothstack.utopiaSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.utopiaSpring.dao.BookingPaymentDao;
import com.smoothstack.utopiaSpring.model.BookingPayment;

@Service
public class BookingPaymentService {

	@Autowired
	private BookingPaymentDao bookingPaymentDao;

	public List<BookingPayment> readAllBookingPayments() {
		return bookingPaymentDao.findAll();
	}

	public Optional<BookingPayment> readBookingPaymentById(Long id) {
		return bookingPaymentDao.findById(id);
	}

	public BookingPayment addBookingPayment(BookingPayment newBookingPayment) {
		return bookingPaymentDao.save(newBookingPayment);
	}

	public void deleteBookingPayment(Long id) {
		bookingPaymentDao.deleteById(id);
	}
	
}