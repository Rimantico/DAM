create schema tarea2;

use tarea2;

CREATE TABLE Region (
CodRegion INT PRIMARY KEY,
Nombre VARCHAR(30)
);

CREATE TABLE PROVINCIA (
CodProvincia INT PRIMARY KEY,
Nombre VARCHAR(30),
CodRegion INT 
);

CREATE TABLE Localidad (
CodLocalidad INT PRIMARY KEY,
Nombre VARCHAR(30),
CodProvincia INT
);

CREATE TABLE Empleado (
DNI CHAR(9) PRIMARY KEY,
Nombre CHAR(30),
FechaNac DATE,
Telefono VARCHAR(15),
Salario INT,
CodLocaliddad INT 
);