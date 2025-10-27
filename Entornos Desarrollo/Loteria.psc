Algoritmo Loteria
	Escribir "Numeros de loteria"
	Escribir "Generando 10 numeros..."
	Para i<-1 Hasta 10 Con Paso 1
		si Aleatorio(1,49) = Aleatorio(1,49)
			Escribir "El numero " , Aleatorio(1,49) " se ha repetido, generando otro numero..."
			Escribir Aleatorio(1,49)
		SiNo
		Escribir 	Aleatorio(1,49)
		FinSi
	FinPara
FinAlgoritmo
