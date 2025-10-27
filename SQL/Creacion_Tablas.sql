create schema creacion_tablas;
use creacion_tablas;

CREATE TABLE Cliente(
NIF CHAR(9) primary key,
Nombre VARCHAR(30),
Direccion VARCHAR(30),
Telefono CHAR (15)
);
CREATE TABLE ModeloDormitorio(
Cod INT primary key
);
CREATE TABLE Montador(
Nif CHAR(9) primary key,
Nombre VARCHAR(30),
Direcion VARCHAR(30),
Telefono CHAR(15)
);
CREATE TABLE Compra(
NIF_C CHAR(9) ,
Modelo INT ,
FechaCompra DATETIME,
PRIMARY KEY (NIF_C,Modelo,FechaCompra)
);
CREATE TABLE Monta(
Modelo INT ,
NIF_M CHAR(9) ,
FechaMontaje DATETIME,
PRIMARY KEY (Modelo,NIF_M,FechaMontaje)
);

ALTER TABLE Compra
ADD 
	Foreign Key (NIF_C)
		References Cliente(NIF),
ADD
	Foreign Key (Modelo)
		References ModeloDormitorio(Cod);
ALTER TABLE Monta
ADD
	Foreign Key (Modelo)
		References ModeloDormitorio(Cod),
ADD
	Foreign Key (NIF_M)
		References Montador(NIF);
Alter TABLE Cliente
ADD column Prepago boolean default (0),
MODIFY Direccion VARCHAR(150);
Create INDEX  Indice_cliente ON Cliente(Nombre)

