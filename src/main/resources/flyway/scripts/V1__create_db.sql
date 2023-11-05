CREATE TABLE `clients`
(
    `client_id`   INT          NOT NULL AUTO_INCREMENT,
    `client_name` VARCHAR(200) NOT NULL,
    CHECK ((CHAR_LENGTH(client_name) > 2) AND (CHAR_LENGTH(client_name) <= 200)),
    PRIMARY KEY (`client_id`)
);

CREATE TABLE `planets`
(
    `planet_id`   VARCHAR(50)  NOT NULL,
    `planet_name` VARCHAR(500) NOT NULL,
    CONSTRAINT planet_id_chars CHECK (REGEXP_LIKE(planet_id, '^([A-Z0-9])+\b')),
    CONSTRAINT planet_name_length CHECK (CHAR_LENGTH(planet_name) > 2 AND CHAR_LENGTH(planet_name) <= 200),
    PRIMARY KEY (`planet_id`)
);

CREATE TABLE IF NOT EXISTS tickets
(
    `ticket_id`      INT          NOT NULL AUTO_INCREMENT,
    `created_at`     TIMESTAMP    NOT NULL,
    `client_id`      INT          NOT NULL,
    `from_planet_id` VARCHAR(500) NOT NULL,
    `to_planet_id`   VARCHAR(500) NOT NULL,
    PRIMARY KEY (`ticket_id`),
    CONSTRAINT `fk_tickets_clients_id`
        FOREIGN KEY (`client_id`)
            REFERENCES clients (`client_id`),
    CONSTRAINT `fk_tickets_from_planet`
        FOREIGN KEY (`from_planet_id`)
            REFERENCES planets (`planet_id`),
    CONSTRAINT `fk_tickets_to_planet`
        FOREIGN KEY (`to_planet_id`)
            REFERENCES planets (`planet_id`)
);

