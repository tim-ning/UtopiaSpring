package com.smoothstack.utopiaSpring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smoothstack.utopiaSpring.model.Airplane;

@Repository
public interface AirplaneDao extends JpaRepository<Airplane, Long> {

}
