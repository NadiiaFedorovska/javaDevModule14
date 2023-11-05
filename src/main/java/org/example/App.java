package org.example;

import org.apache.log4j.Logger;
import org.example.entities.Client;
import org.example.entities.Planet;
import org.example.entities.Ticket;
import org.example.utils.FlywayMigration;
import org.example.utils.HibernateUtil;

import java.util.Date;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class);

    public static void main(String[] args) {
        LOGGER.info("The program has started");

        FlywayMigration.migrateDatabase();

        ClientService clientService = new ClientService();
        PlanetService planetService = new PlanetService();
        TicketService ticketService = new TicketService();

        Client client = clientService.findClientById(5L);
        Planet fromPlanet = planetService.findPlanetById("VEN");
        Planet toPlanet = planetService.findPlanetById("JUP");

        Ticket newTicket = new Ticket();
        Date currentDate = new Date();
        newTicket.setCreatedAt(currentDate);
        newTicket.setClient(client);
        newTicket.setFromPlanet(fromPlanet);
        newTicket.setToPlanet(toPlanet);
        ticketService.saveTicket(newTicket);
        LOGGER.info("Create new Ticket " + newTicket);

        Ticket ticket = ticketService.findTicketById(2L);
        LOGGER.info("Found Ticket: " + ticket);

        Client client2 = clientService.findClientById(7L);
        ticket.setClient(client2);
        ticketService.updateTicket(ticket);
        LOGGER.info("Ticket updated. New info: " + ticket);

        ticketService.deleteTicket(ticket);
        LOGGER.info("Ticket: " + ticket + "was deleted");

        HibernateUtil.getInstance().close();
        LOGGER.info("The program has finished");
    }
}
