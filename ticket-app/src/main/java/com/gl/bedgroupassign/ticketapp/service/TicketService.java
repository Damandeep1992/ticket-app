package com.gl.bedgroupassign.ticketapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.bedgroupassign.ticketapp.dao.TicketRepository;
import com.gl.bedgroupassign.ticketapp.model.Ticket;

@Service
public class TicketService {
	
	@Autowired 
	private TicketRepository ticketRepository;

	
	public Ticket saveTicket(Ticket ticket) {
		return this.ticketRepository.save(ticket);
	}
	public List<Ticket> fetchAllTickets(){
		return this.ticketRepository.findAll();
	}
	
	public Ticket findTicketById(long ticketId) {
		return this.ticketRepository.findById(ticketId).orElseThrow();
	}
	
	public void deleteTicketById(long ticketId) {
		this.ticketRepository.deleteById(ticketId);
	}
}
