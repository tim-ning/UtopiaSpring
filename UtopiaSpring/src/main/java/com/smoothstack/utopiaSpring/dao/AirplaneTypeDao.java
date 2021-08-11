package com.smoothstack.utopiaSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaSpring.model.AirplaneType;

@Repository
public interface AirplaneTypeDao extends JpaRepository<AirplaneType, Long> {

}
