package org.example;

import org.apache.log4j.Logger;
import org.example.entities.Client;
import org.example.repositories.ClientCrud;

public class ClientService {
    private static final Logger LOGGER = Logger.getLogger(TicketService.class);
    private ClientCrud clientCrud = new ClientCrud();

    public void saveClient(Client client) {
        clientCrud.save(client);
        LOGGER.info("SaveClient" + client);
    }

    public Client findClientById(Long id) {
        LOGGER.info("FindClientById" + id);
        return clientCrud.getById(id);
    }

    public void updateClient(Client client) {
        clientCrud.update(client);
        LOGGER.info("UpdateClient" + client);
    }

    public void deleteClient(Client client) {
        clientCrud.delete(client);
        LOGGER.info("DeleteClient" + client);
    }
}
