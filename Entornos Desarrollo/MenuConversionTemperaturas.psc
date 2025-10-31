Proceso  MenuConversionTemperaturas
	Repetir
		
		Escribir "====================================="
		
		Escribir "    MENÚ DE FUNCIONES - TEMPERATURAS"
		
		Escribir "====================================="
		
		Escribir "1. Convertir Celsius -> Fahrenheit"
		
		Escribir "2. Convertir Fahrenheit -> Celsius"
		
		Escribir "3. Convertir Celsius -> Kelvin"
		
		Escribir "4. Calcular promedio de temperaturas" 
		
		Escribir "5. Mostrar temperatura máxima y mínima" 
		
		Escribir "6. Salir"
		
		Escribir "====================================="
		
		Escribir "Seleccione una opción: "
		Leer opciones
		
		Segun opciones
			1:
				Farenheit<-0
				Escribir "Has elegido Convertir Celsius a Farenheit"
				Escribir "Introduce el numero a convertir"
				Leer valor1
				Farenheit<-(valor1*(9/5))+32
				Escribir "La Conversion de " , valor1 "ºC a Farenheit es " Farenheit
			2:
				Celsius<-0
				Escribir "Has elegido Convertir Farenheit a Celsius"
				Leer valor1
				Celsius<- (valor1-32)*(5/9)
				Escribir "La Conversion de " , valor1 "ºF a Celsius es " Celsius
			3:
				Kelvin<-0
				Escribir "Has elegido Convertir Celsius a Kelvin"
				Leer valor1
				Kelvin<- valor1+273.15
				Escribir "La Conversion de " , valor1 "ºC a Kelvin es " Kelvin
			4:
				Escribir "Has elegido Calcular el promedio de temperaturas"
				Escribir "¿Cuantas temperaturas va a introducir?"
				Leer numTemperaturas
				sumaTemperaturas<-0
				contador<-0
				media<-0
				Para i<-1 Hasta numTemperaturas Con Paso 1
					Escribir "Introduzca el " , i "º numero: "
					Leer num
					sumaTemperaturas<-sumaTemperaturas+num
					contador<-contador+1
				FinPara
				media<-sumaTemperaturas/contador
				Escribir "La media de esas temperaturas es "  media
			5:
				Escribir "Has elegido Mostar temperatura máxima y mínima"
				
				Escribir "¿Cuantas temperaturas va a introducir?"
				Leer numTemperaturas
				
				Dimensionar arreglo[numTemperaturas]
				numMayor<-0
				numMenor<-0
				Para i<-1 Hasta numTemperaturas Con Paso 1
					Escribir "Introduzca el " , i "º numero: "
					Leer arreglo[i]
				FinPara
				Para i<-1 Hasta numTemperaturas Con Paso 1
					si arreglo[i]> arreglo[1]
						numMayor<-arreglo[i]
					SiNo
						si arreglo[i]< arreglo[1]
							numMenor<-arreglo[i]
						FinSi
					FinSi
				FinPara
				Escribir "La temperatura mayor es " , numMayor
				Escribir "La temperatura menor es " , numMenor
			6:
				Escribir "Saliendo del programa ..."
		FinSegun
Hasta Que opciones == 6 
FinProceso

