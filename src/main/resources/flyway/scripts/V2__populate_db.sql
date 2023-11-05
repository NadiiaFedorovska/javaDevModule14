INSERT INTO clients (client_name) VALUES ( 'name1');
INSERT INTO clients (client_name) VALUES ( 'name2');
INSERT INTO clients (client_name) VALUES ( 'name3');
INSERT INTO clients (client_name) VALUES ( 'name4');
INSERT INTO clients (client_name) VALUES ( 'name5');
INSERT INTO clients (client_name) VALUES ( 'name6');
INSERT INTO clients (client_name) VALUES ( 'name7');
INSERT INTO clients (client_name) VALUES ( 'name8');
INSERT INTO clients (client_name) VALUES ( 'name9');
INSERT INTO clients (client_name) VALUES ( 'name10');

INSERT INTO planets (planet_id, planet_name) VALUES ( 'MER', 'Mercury');
INSERT INTO planets (planet_id, planet_name) VALUES ( 'VEN', 'Venus');
INSERT INTO planets (planet_id, planet_name) VALUES ( 'EAR', 'Earth');
INSERT INTO planets (planet_id, planet_name) VALUES ( 'MAR', 'Mars');
INSERT INTO planets (planet_id, planet_name) VALUES ( 'JUP', 'Jupiter');

INSERT INTO tickets (created_at, client_id, from_planet_id, to_planet_id ) VALUES ( '2023-10-01 10:00:00',	2,	'MER',	'JUP');
INSERT INTO tickets (created_at, client_id, from_planet_id, to_planet_id ) VALUES ( '2023-10-01 11:00:00',	4,	'VEN',	'JUP');
INSERT INTO tickets (created_at, client_id, from_planet_id, to_planet_id ) VALUES ( '2023-10-01 12:00:00',	6,	'MAR',	'JUP');
INSERT INTO tickets (created_at, client_id, from_planet_id, to_planet_id ) VALUES ( '2023-10-01 13:00:00',	8,	'JUP',	'MER');
INSERT INTO tickets (created_at, client_id, from_planet_id, to_planet_id ) VALUES ( '2023-10-01 14:00:00',	10,	'MAR',	'MER');