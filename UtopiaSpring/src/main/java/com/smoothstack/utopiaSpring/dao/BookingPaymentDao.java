package com.smoothstack.utopiaSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaSpring.model.BookingPayment;

@Repository
public interface BookingPaymentDao extends JpaRepository<BookingPayment, Long>{

}