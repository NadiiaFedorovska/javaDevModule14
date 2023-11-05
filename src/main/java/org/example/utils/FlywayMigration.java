package org.example.utils;

import org.apache.log4j.Logger;
import org.example.App;
import org.flywaydb.core.Flyway;

public class FlywayMigration {
    private static final Logger LOGGER = Logger.getLogger(App.class);

    private FlywayMigration() {
    }

    public static void migrateDatabase() {
        LOGGER.info("Flyway migration start");
        Flyway.configure()
                .dataSource(Config.JDBC_URL, Config.USERNAME, Config.PASSWORD)
                .locations("classpath:flyway/scripts")
                .load()
                .migrate();
        LOGGER.info("Flyway migration completed!");
    }
}
