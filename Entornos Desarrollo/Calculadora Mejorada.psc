Proceso  Calculadora
	Repetir
		
		Escribir "Calculadora Mejorada"
		Escribir "Dime la operacion a realizar"
		Escribir "1 -- Sumar"
		Escribir "2 -- Restar"
		Escribir "3 -- Multiplicar"
		Escribir "4 -- Dividir"
		Escribir "5 -- Raiz Cuadrada"
		Escribir "6 -- Promedio"
		Escribir "7 -- Area Circulo"
		Escribir "8 -- Salir"
		
		Leer operacion
		
		Segun operacion
			1:
				Escribir "Dime el primer valor"
				Leer valor1
				Escribir "Dime el segundo valor"
				Leer valor2
				
				Escribir "El resultado de la suma es: " Suma(valor1, valor2)
			2:
				Escribir "Dime el primer valor"
				Leer valor1
				Escribir "Dime el segundo valor"
				Leer valor2
				
				Escribir "El resultado de la resta es: " Resta(valor1, valor2)
			3:
				Escribir "Dime el primer valor"
				Leer valor1
				Escribir "Dime el segundo valor"
				Leer valor2
				
				Escribir "El resultado de la multiplicacion es: " Multiplicacion(valor1, valor2)
			4:
				Escribir "Dime el primer valor"
				Leer valor1
				Escribir "Dime el segundo valor"
				Leer valor2
				
				Escribir "El resultado de la division es: " Division(valor1, valor2)
			5:
				Escribir "Dime el primer valor al cual le quieres hacer una raiz cuadrada"
				Leer valor1
				
				Escribir "El resultado de la raiz cuadrada es " RaizCuadrada(valor1)
			6:
				Escribir "Dime el primer valor"
				Leer valor1
				Escribir "Dime el segundo valor"
				Leer valor2 
				Escribir "Dime el tercer valor"
				Leer valor3
				
				Escribir "El resultado del promedio de los tres valores es " Promedio(valor1, valor2, valor3)
			7:
				Escribir "Dime el radio del circulo"
				Leer valor1
				
				Escribir "El area del circulo es: " Area(valor1)
		FinSegun
	Hasta Que operacion = 8
	
FinProceso

//Funciones

//Funcion para el calculo de la Suma
Funcion sum<-Suma(valor1 , valor2)
	Definir sum Como Entero
	sum<-valor1 + valor2
FinFuncion

//Funcion para el calculo de la Resta
Funcion res<-Resta(valor1 , valor2)
	Definir res Como Entero
	res<-valor1 - valor2
FinFuncion

//Funcion para el calculo de la Multiplicacion
Funcion mult<-Multiplicacion(valor1, valor2)
	Definir mult Como Entero
	mult<-valor1 * valor2
FinFuncion

//Funcion para el calculo de la Division
Funcion div<-Division(valor1, valor2)
	Definir div Como Entero
	div<- valor1 / valor2
FinFuncion

//Funcion para el calculo de la Raiz Cuadrada
Funcion raiz2<-RaizCuadrada(valor1)
	Definir raiz2 Como Real
	raiz2<-raiz(valor1)
FinFuncion

//Funcion para el calculo del promedio de tres valores
Funcion prom<-Promedio (valor1, valor2 , valor3)
	Definir prom Como Real
	prom<-(valor1 + valor2 + valor3)/3
FinFuncion

//Funcion para el calculo del area de un circulo
Funcion area1<- Area(valor1)
	Definir area1 Como Real
	area1<-(valor1*valor1) * PI
FinFuncion
	