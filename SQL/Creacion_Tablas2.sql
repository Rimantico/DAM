create schema creacion_tablas2;

use creacion_tablas2;

CREATE TABLE	Cliente(
	CodCliente	INT Primary Key auto_increment,
	DNI CHAR(9) Unique,
	Nombre VARCHAR(30) Not null,
	Direccion VARCHAR (30),
	Telefono CHAR(15)
);

CREATE TABLE Reserva(
	Numero INT Primary Key auto_increment,
	FechaInicio DATE,
	FechaFin DATE,
	PrecioTotal INT,
	CodCliente INT
);

Create TABLE Coche(
	Matricula CHAR(7) Primary key,
	Marca VARCHAR(30) not null,
	Modelo VARCHAR(25) not null,
	Color VARCHAR(30),
	PrecioHora INT
);

Create TABLE Avala(
	Avalado INT Primary Key,
	Avalador INT 
);

Create TABLE Incluye(
	Numero INT,
	Matricula CHAR(7),
	litrosGas INT,
	PRIMARY KEY(Numero,Matricula)
);

AlTER TABLE Avala 
ADD	
    Constraint FK_Avalado Foreign Key (Avalado)
    References Cliente(CodCliente),
ADD
	Constraint FK_Avalador Foreign Key (Avalador)
    References Cliente(CodCliente);

ALTER TABLE Incluye
ADD
	Constraint FK_Numero Foreign Key (Numero)
    References Reserva(Numero),
ADD
	Constraint FK_Matricula foreign key (Matricula)
    References Coche(Matricula);

ALTER TABLE Reserva
ADD
	Constraint FK_CodCliente Foreign Key (CodCliente)
    References Cliente(CodCliente);