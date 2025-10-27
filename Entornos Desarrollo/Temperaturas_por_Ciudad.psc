Algoritmo Temperaturas_por_Ciudad
	Definir matriz Como Entero
	Dimension matriz[3,7]
	Definir i , j Como Entero
	media1<-0
	media2<-0
	media3<-0
	
	Para i<-1 Hasta 3 Con Paso 1
		Para j<-1 Hasta 7 Con Paso 1
			Escribir "Dime la temperatura de la ciudad [" i "," j "]"
			Leer matriz[i,j]
		FinPara
	FinPara
	
	Para j<-1 Hasta 7 Con Paso 1
		media1<-media1+matriz[1,j]
	FinPara
	Para j<-1 Hasta 7 Con Paso 1
		media2<-media2+matriz[2,j]
	FinPara
	Para j<-1 Hasta 7 Con Paso 1
		media3<-media3+matriz[3,j]
	FinPara
	
	media1<-media1/7
	media2<-media2/7
	media3<-media3/7
	
	Para i<-1 Hasta 3 Con Paso 1
		Para  j<-1 Hasta 7 Con Paso 1
			
			Escribir "La ciudad " i " Tiene la siguiente temperatura: " matriz[i, j]
		FinPara
	FinPara
	Escribir "La media de la primera ciudad es " media1
	Escribir "La media de la segunda ciudad es " media2
	Escribir "La media de la tercera ciudad es " media3
	
FinAlgoritmo
