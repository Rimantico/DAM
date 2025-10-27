Algoritmo Temperaturas_por_CiudadMejorada
	Escribir "Introduce el numero de ciudades"
	Leer N
	Escribir "Introduce el numero de dias que desea medir"
	Leer M
	
	//Aqui defino variables arrays y matrices
	Dimension arreglo[N]
	Definir matriz Como Entero
	Dimension matriz[N , M ]
	diasCalurosos<-0
	Dimension mediaCiudad[N]
	Dimension mediaDia[M]
	
	
	Para i<-1 Hasta N Con Paso 1
		Escribir "Introduce el nombre de la " i "º ciudad: "
		Leer arreglo[i]
	FinPara
	
	Para i<-1 Hasta N Con Paso 1
		Para j<-1 Hasta M Con Paso 1
			Escribir "Dime la temperatura de la ciudad de " arreglo[i] " del dia " j
			Leer matriz[i,j]
		FinPara
	FinPara
	Si   matriz[N,M] > -50 Y matriz[N,M] < 60
		Para i<-1 Hasta N Con Paso 1
			Para  j<-1 Hasta M Con Paso 1
				Escribir "La ciudad " arreglo[i] " Tiene la siguiente temperatura: " matriz[i, j]
				Si matriz[ i,j ] >= 30
					diasCalurosos<- diasCalurosos + 1
				FinSi
			FinPara
		FinPara
		//Calcular por Ciudad
		Para i<-1 Hasta N
			suma<-0
			Para j<-1 Hasta M
				suma<-suma + matriz[i,j]
			FinPara
			mediaCiudad[i] <- suma/M
		FinPara
		//Calcula por dia
		Para j<-1 Hasta M
			suma<-0
			Para i<-1 Hasta N
				suma<-suma + matriz[i,j]
			FinPara
			mediaDia[j] <- suma/N
		FinPara
		
		Para i<-1 Hasta  N
			Escribir "La media de la ciudad " arreglo[i] " es " , mediaCiudad[i]
		FinPara
		Para j<- 1 Hasta M
			Escribir "La media del día ", j " es " mediaDia[j]
		FinPara
		
		mayorMedia<-mediaCiudad[1]
		ciudadMayor<-arreglo[1]
		//Descubrir la media mayor de Ciudad
		Para i<-2 Hasta N
			Si mediaCiudad[i] > mayorMedia
				mayorMedia<-mediaCiudad[i]
				ciudadMayor<-arreglo[i]
			FinSi
		FinPara
		
		Escribir "La ciudad con la mayor media de temperatura es " ciudadMayor
		
		Escribir "El numero de dias calurosos es de " diasCalurosos
		
		Para i<-1 Hasta N
			Escribir arreglo[i]
			Para j<-1 Hasta M
				Escribir matriz[i,j]
			FinPara
		FinPara
	
	SiNo
		Escribir "Has introducido erroneamente datos, por favor vuelva a introducir nuevos datos"
	FinSi
	
	//Para comprobar si los nombres se guardaban de forma correcta
	
	//Para i<-1 Hasta N Con Paso 1
	//	Escribir "El nombre de la " i " ciudad es " arreglo[i]
	//FinPara
FinAlgoritmo
