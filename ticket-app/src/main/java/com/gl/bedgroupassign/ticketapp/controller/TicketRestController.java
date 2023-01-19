package com.gl.bedgroupassign.ticketapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.bedgroupassign.ticketapp.model.Ticket;
import com.gl.bedgroupassign.ticketapp.service.TicketService;

@RestController
@RequestMapping("/api/v1/tickets")
public class TicketRestController {
	
	@Autowired
	private TicketService ticketService;

	@GetMapping
	public List<Ticket> fetchAllTickets(){
		return this.ticketService.fetchAllTickets();
	}
	
	@GetMapping("/{id}")
	public Ticket fetchTicketById(@PathVariable("id") long ticketId){
		return this.ticketService.findTicketById(ticketId);
	}
	
	@PostMapping
	public Ticket saveTicket(@RequestBody Ticket ticket) {
		return this.ticketService.saveTicket(ticket);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTicketById(@PathVariable("id") long ticketId){
		this.ticketService.deleteTicketById(ticketId);
	}
}
