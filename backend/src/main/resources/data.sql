INSERT INTO team(name) VALUES ('Red Bull Racing');
INSERT INTO team(name) VALUES ('Aston Martin');
INSERT INTO team(name) VALUES ('AMG Mercedes');

INSERT INTO destination(name, country, length) VALUES ('Hungaroring', 'Hungary', 4.381);
INSERT INTO destination(name, country, length) VALUES ('Spa-Francorchamps', 'Belgium', 7.004);
INSERT INTO destination(name, country, length) VALUES ('Red Bull Ring', 'Austria', 4.326);

INSERT INTO pilot(name, date_of_birth, team, number_of_championship_titles, active) VALUES ('Max Verstappen', '1997-09-30', 1, 2, true);
INSERT INTO pilot(name, date_of_birth, team, number_of_championship_titles, active) VALUES ('Sergio Perez', '1990-01-26', 1, 0, true);
INSERT INTO pilot(name, date_of_birth, team, number_of_championship_titles, active) VALUES ('Fernando Alonso', '1981-07-29', 2, 2, true);
INSERT INTO pilot(name, date_of_birth, team, number_of_championship_titles, active) VALUES ('Lance Stroll', '1998-10-29', 2, 0, true);
INSERT INTO pilot(name, date_of_birth, team, number_of_championship_titles, active) VALUES ('Lewis Hamilton', '1985-01-07', 3, 7, true);
INSERT INTO pilot(name, date_of_birth, team, number_of_championship_titles, active) VALUES ('George Russel', '1998-02-15', 3, 0, true);

INSERT INTO race(race_winner, destination, date_of_race, number_of_dnfs) VALUES (1, 1, current_date(), 4);
INSERT INTO race(race_winner, destination, date_of_race, number_of_dnfs) VALUES (3, 2, current_date(), 2);
INSERT INTO race(race_winner, destination, date_of_race, number_of_dnfs) VALUES (6, 3, current_date(), 1);
INSERT INTO race(race_winner, destination, date_of_race, number_of_dnfs) VALUES (5, 3, current_date(), 0);

