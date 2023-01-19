package com.gl.bedgroupassign.ticketapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.bedgroupassign.ticketapp.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
