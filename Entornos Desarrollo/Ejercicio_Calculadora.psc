Algoritmo Calculadora
	Repetir
		Escribir "Calculadora"
		Escribir "1 -- Sumar"
		Escribir "2 -- Restar"
		Escribir "3 -- Multiplicar"
		Escribir "4 -- Dividir"
		Escribir "0 -- Salir del programa"
		Leer Operacion
		Si Operacion > 4
			Escribir "Numero incorrecto Introduzca un valor valido"
		FinSi
		Segun Operacion
			1:
				Escribir "Has elegido Sumar, �Cuantos n�meros quiere sumar?:"
				Leer cantNumeros
				resultado <-0
				Para i<-1 Hasta cantNumeros Con Paso 1 Hacer
					Escribir "N�mero",i,":"
					Leer num
					resultado <-resultado + num
				FinPara
				Escribir "El resultado de la suma: ", resultado
			2:
				Escribir "Has elegido Restar, �Cuantos n�meros quiere Restar?:"
				Leer cantNumeros
				resultado <-0
				Para i<-2 Hasta cantNumeros Con Paso 1 Hacer
					Escribir "N�mero",i,":"
					Leer num
					resultado <-resultado - num
				FinPara
				Escribir "El resultado de la resta: ", resultado
			3:
				Escribir "Has elegido Multiplicar, �Cuantos n�meros quiere Multiplicar?:"
				Leer cantNumeros
				resultado <-0
				Para i<-1 Hasta cantNumeros Con Paso 1 Hacer
					Escribir "N�mero",i,":"
					Leer num
					resultado <-resultado * num
				FinPara
				Escribir "El resultado de la Multiplicacion: ", resultado
			4:
				Escribir "Has elegido Division, �Cuantos n�meros quiere Dividir?:"
				Leer cantNumeros
				resultado <-0
				Para i<-2 Hasta cantNumeros Con Paso 1 Hacer
					Escribir "N�mero",i,":"
					Leer num
					resultado <-resultado / num
				FinPara
				Escribir "El resultado de la Division: ", resultado
				
		FinSegun
	Hasta Que Operacion = 0

	
FinAlgoritmo
