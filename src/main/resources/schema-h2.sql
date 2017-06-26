DROP TABLE IF EXISTS USERS;
CREATE TABLE USERS ( 
   id INT NOT NULL, 
   name VARCHAR(20) NOT NULL, 
   email VARCHAR(20), 
   password VARCHAR(10)
);

Commit;

INSERT INTO USERS VALUES(1,'jo bo h2','jobo@email.com','pass1');
INSERT INTO USERS VALUES(2,'mi tu h2','mitu@email.com','pass1');
INSERT INTO USERS VALUES(3,'va pa h2','vapa@email.com','pass1');

Commit;