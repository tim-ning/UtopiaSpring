package com.smoothstack.utopiaSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaSpring.model.Booking;

@Repository
public interface BookingDao extends JpaRepository<Booking, Long>{

}