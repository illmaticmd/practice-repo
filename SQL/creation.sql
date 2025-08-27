CREATE TABLE people(
	person_id INT PRIMARY KEY,
	first_name VARCHAR(15) NOT NULL,
	last_name VARCHAR(15) NULL,
	birthdate DATE NOT NULL
);

CREATE TABLE birthday(
	person_id INT PRIMARY KEY,
	mm VARCHAR(15) NOT NULL,
	dd INT NOT NULL,
	yy INT NOT NULL
);


SET DATEFORMAT mdy;
INSERT INTO people
VALUES ('Philomena','Duru','01.15.1964');

INSERT INTO people
VALUES ('Philomena','Duru',TO_DATE('1964-01-15','yyyy-mm-dd'));

^^ SQL Server

INSERT INTO people
VALUES ('Desmond','Duru',STR_TO_DATE("August 6 1955", "%M %d %Y"));

INSERT INTO people
VALUES (2,'Desmond','Duru',STR_TO_DATE("August 6 1955", "%M %d %Y"));

INSERT INTO people
VALUES (1,'Philomena','Duru',STR_TO_DATE("January 15 1964", "%M %d %Y"));

("January 15 1964", "%M %d %Y"); 

INSERT INTO people
VALUES (3,'Dylan','Duru',STR_TO_DATE("August 25 1998", "%M %d %Y"));

INSERT INTO people
VALUES (4,'Monique','Duru',STR_TO_DATE("February 24 1994", "%M %d %Y"));

select * from people;

-- no last name

INSERT INTO people (person_id, first_name, birthdate)
VALUES (x,'Somebody',STR_TO_DATE("Dec XX XXXX", "%M %d %Y"));