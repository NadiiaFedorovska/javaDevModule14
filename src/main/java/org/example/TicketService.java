package org.example;

import org.apache.log4j.Logger;
import org.example.entities.Ticket;
import org.example.repositories.TicketCrud;

public class TicketService {
    private static final Logger LOGGER = Logger.getLogger(TicketService.class);
    private TicketCrud ticketCrud = new TicketCrud();

    public void saveTicket(Ticket ticket) {
        ticketCrud.save(ticket);
        LOGGER.info("SaveTicket" + ticket);
    }

    public Ticket findTicketById(Long id) {
        LOGGER.info("FindTicketById" + id);
        return ticketCrud.getById(id);
    }

    public void updateTicket(Ticket ticket) {
        ticketCrud.update(ticket);
        LOGGER.info("UpdateTicket" + ticket);
    }

    public void deleteTicket(Ticket ticket) {
        ticketCrud.delete(ticket);
        LOGGER.info("DeleteTicket" + ticket);
    }
}
