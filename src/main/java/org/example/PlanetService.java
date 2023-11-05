package org.example;

import org.apache.log4j.Logger;
import org.example.entities.Planet;
import org.example.repositories.PlanetCrud;

public class PlanetService {
    private static final Logger LOGGER = Logger.getLogger(TicketService.class);
    private PlanetCrud planetCrud = new PlanetCrud();

    public void savePlanet(Planet planet) {
        planetCrud.save(planet);
        LOGGER.info("SavePlanet" + planet);
    }

    public Planet findPlanetById(String id) {
        LOGGER.info("FindPlanetById" + id);
        return planetCrud.getById(id);
    }

    public void updatePlanet(Planet planet) {
        planetCrud.update(planet);
        LOGGER.info("UpdatePlanet" + planet);
    }

    public void deletePlanet(Planet planet) {
        planetCrud.delete(planet);
        LOGGER.info("DeletePlanet" + planet);
    }
}
