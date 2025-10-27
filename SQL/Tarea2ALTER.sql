create schema tarea2;

use tarea2;

CREATE TABLE Region (
CodRegion INT PRIMARY KEY AUTO_INCREMENT,
Nombre VARCHAR(30)
);

CREATE TABLE provincia (
CodProvincia INT PRIMARY KEY AUTO_INCREMENT,
Nombre VARCHAR(30) NOT NULL,
CodRegion INT 
);

CREATE TABLE Localidad (
CodLocalidad INT PRIMARY KEY AUTO_INCREMENT,
Nombre VARCHAR(30) NOT NULL,
CodProvincia INT
);

CREATE TABLE Empleado (
ID  INT PRIMARY KEY AUTO_INCREMENT,
DNI CHAR(9) UNIQUE NOT NULL,
Nombre CHAR(30) NOT NULL,
FechaNac DATE,
Telefono VARCHAR(15),
Salario INT,
CodLocalidad INT 
);

ALTER TABLE Provincia
ADD 
    FOREIGN KEY (CodRegion)
	REFERENCES Region(CodRegion);

ALTER TABLE Localidad
ADD
	FOREIGN KEY (CodProvincia)
    REFERENCES Provincia(CodProvincia);
    
ALTER TABLE Empleado
ADD
	FOREIGN KEY (CodLocalidad)
    REFERENCES Localidad(CodLocalidad);
	

