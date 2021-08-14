package com.smoothstack.utopiaSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaSpring.model.BookingGuest;

@Repository
public interface BookingGuestDao extends JpaRepository<BookingGuest, Long>{

}