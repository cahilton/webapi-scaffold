--Needed for JPA/hibernate
CREATE TABLE ${defaultSchema}.HIBERNATE_SEQUENCE (ID BIGINT IDENTITY);

--Example
CREATE TABLE ${defaultSchema}.EXAMPLEAPP_WIDGET  (
	ID BIGINT  NOT NULL PRIMARY KEY ,
	NAME VARCHAR(50)
);
