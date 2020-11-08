package com.yunus.flightbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yunus.flightbooking.entity.Flight;

@Repository
public interface TicketRepository extends JpaRepository<Flight, Long> {

}
