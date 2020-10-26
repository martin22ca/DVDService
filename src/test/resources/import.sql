-- You can use this file to load seed data into the database using SQL statements
INSERT INTO CLIENT (`ID`, `DNI`, `EMAIL`, `LAST_NAME`, `NAME`) VALUES ('1', '42512078', 'caceresmartin@gmail.com', 'Caceres', 'Martin');
INSERT INTO CLIENT (`ID`, `DNI`, `EMAIL`, `LAST_NAME`, `NAME`) VALUES ('2', '18232164', 'josegarcia@gmail.com', 'Garcia', 'Jose');
INSERT INTO CLIENT (`ID`, `DNI`, `EMAIL`, `LAST_NAME`, `NAME`) VALUES ('3', '46128234', 'federicabarrera@gmail.com', 'Barrera', 'Federica');
INSERT INTO CLIENT (`ID`, `DNI`, `EMAIL`, `LAST_NAME`, `NAME`) VALUES ('4', '33154756', 'analiagonzales@gmail.com', 'Gonzales', 'Analia');

INSERT INTO FILM (`ID`, `GENRE`, `SYNOPSIS`, `TITLE`, `YEAR`) VALUES ('1', "2", 'A battle in space full of action ', 'Star Wars', '1977');
INSERT INTO FILM (`ID`, `GENRE`, `SYNOPSIS`, `TITLE`, `YEAR`) VALUES ('2', "0", 'An old horror classic', 'The Thing', '1982');
INSERT INTO FILM (`ID`, `GENRE`, `SYNOPSIS`, `TITLE`, `YEAR`) VALUES ('3', "2", 'A fantastic view of dreams and its implications ', 'Inception', '1977');
INSERT INTO FILM (`ID`, `GENRE`, `SYNOPSIS`, `TITLE`, `YEAR`) VALUES ('4', "1", 'The secret code hidden by Da vinci', '2006');
INSERT INTO FILM (`ID`, `GENRE`, `SYNOPSIS`, `TITLE`, `YEAR`) VALUES ('5', "4", 'The legendary tail of an retired explorer', 'Indiana Jones', '2008');
INSERT INTO FILM (`ID`, `GENRE`, `SYNOPSIS`, `TITLE`, `YEAR`) VALUES ('6', "4", 'An old tale about a legendary fight in Greece', '300', '2006');

INSERT INTO RENTAL (`ID`, `RENTAL_DATE`, `CLIENT_ID`, `FILM_ID`) VALUES ('1', '2000-04-19', '1', '1');
INSERT INTO RENTAL (`ID`, `RENTAL_DATE`, `CLIENT_ID`, `FILM_ID`) VALUES ('2', '2000-02-29', '2', '5');
INSERT INTO RENTAL (`ID`, `RENTAL_DATE`, `CLIENT_ID`, `FILM_ID`) VALUES ('3', '2000-09-09', '4', '4');
INSERT INTO RENTAL (`ID`, `RENTAL_DATE`, `CLIENT_ID`, `FILM_ID`) VALUES ('4', '2000-03-30', '3', '3');
INSERT INTO RENTAL (`ID`, `RENTAL_DATE`, `CLIENT_ID`, `FILM_ID`) VALUES ('5', '2000-07-11', '2', '6');
INSERT INTO RENTAL (`ID`, `RENTAL_DATE`, `CLIENT_ID`, `FILM_ID`) VALUES ('6', '2000-03-12', '1', '4');
INSERT INTO RENTAL (`ID`, `RENTAL_DATE`, `CLIENT_ID`, `FILM_ID`) VALUES ('7', '2000-11-09', '3', '2');
INSERT INTO RENTAL (`ID`, `RENTAL_DATE`, `CLIENT_ID`, `FILM_ID`) VALUES ('8', '2000-01-05', '4', '2');
INSERT INTO RENTAL (`ID`, `RENTAL_DATE`, `CLIENT_ID`, `FILM_ID`) VALUES ('9', '2000-12-22', '4', '1');
