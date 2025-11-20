Proceso  CalculadoraMejorada
	numero1<-0
	numero2<-0
	numero3<-0
	Repetir
		Escribir "==============================="
		
        Escribir "     CALCULADORA CON FUNCIONES"
		
        Escribir "==============================="
		
        Escribir "1. Sumar"
		
        Escribir "2. Restar"
		
        Escribir "3. Multiplicar"
		
        Escribir "4. Dividir"
		
        Escribir "5. Potencia (a^b)"
		
		Escribir "6.  Raiz Cuadrada"
		
		Escribir "7. Promedio de tres valores"
		
		Escribir "8. Area Circulo"
        
		Escribir "9. Salir"
		
        Escribir "==============================="
		
		Escribir "Ingrese una opción: "
		Leer opciones
		
		
		Segun opciones Hacer
			1:
				Escribir "Has elegido Sumar"
				Escribir "Ingrese el primer numero"
				Leer numero1
				Escribir "Ingrese el segundo numero"
				Leer numero2
				 
				Escribir "El resultado de sumar " numero1 " y "  numero2 " es: " suma(numero1, numero2)
			2:
				Escribir "Has elegido Restar"
				Escribir "Ingrese el primer numero"
				Leer numero1
				Escribir "Ingrese el segundo numero"
				Leer numero2
				Escribir "El resultado de sumar " numero1 " y "  numero2 " es: " resta(numero1, numero2)
			3:
				Escribir "Has elegido Multiplicar"
				Escribir "Ingrese el primer numero"
				Leer numero1
				Escribir "Ingrese el segundo numero"
				Leer numero2
				Escribir "El resultado de multiplicar " numero1 " y "  numero2 " es: " multiplicar(numero1, numero2)
			4:
				Escribir "Has elegido Dividir"
				Escribir "Ingrese el primer numero"
				Leer numero1
				Escribir "Ingrese el segundo numero"
				Leer numero2
				Escribir "El resultado de dividir " numero1 " y "  numero2 " es: " dividir(numero1, numero2)
			5:
				Escribir "Has elegido Potencia"
				Escribir "Ingrese el numero al cual quieres que se le haga la potencia"
				Leer numero1
				Escribir "Ingrese el numero de la potencia"
				Leer numero2
				Escribir "El resultado de la potencia de  " numero1 " y "  numero2 " es: " potencia(numero1, numero2)
			6:
				Escribir "Has elegido Raiz Cuadrada"
				Escribir "Ingrese el numero al cual quieres que se le haga la raiz cuadrada"
				Leer numero1
				Escribir "El resultado de la de la raiz es " raizcuadrada(numero1)
			7:
				Escribir "Has elegido Promedio de tres valores"
				Escribir "Ingrese el primer numero"
				Leer numero1
				Escribir "Ingrese el segundo numero"
				Leer numero2
				Escribir "Ingrese el tercer numero"
				Leer numero3
				Escribir "El resultado del promedio de los tres numeros es " promedio(numero1, numero2 , numero3)
			8:
				Escribir "Has elegido calcular el Area de un circulo"
				Escribir "Ingrese el radio"
				Leer numero1
				Escribir "El area de nuestro circulo es de " area(numero1)
			9:
				Escribir "Has decidido acabar nuestro programa de calculadora. Muchas gracias por utilizarla!!!!"
			De Otro Modo:
				Escribir "Has introducido un numero erroneo. Por favor introduzca un numero entre el 1 y el 9"
		FinSegun
	Hasta Que opciones =9 
FinProceso


// FUNCIONES


Funcion resultado<-suma(numero1, numero2)
	Definir resultado Como Entero
	resultado<-numero1 + numero2
FinFuncion

Funcion resultado<-resta(numero1, numero2)
	Definir resultado Como Real
	resultado<- numero1 - numero2
FinFuncion

Funcion resultado<-multiplicar(numero1, numero2)
	Definir resultado Como Real
	resultado<-numero1* numero2
FinFuncion

Funcion resultado<-dividir(numero1, numero2)
	Definir resultado Como Real
	Si numero2 = 0
		Escribir "No se puede dividir entre 0"
	SiNo
		resultado<-numero1 / numero2
	FinSi
FinFuncion

Funcion resultado<-potencia(numero1 , numero2)
	Definir resultado Como Real
	resultado<-numero1^numero2
FinFuncion

Funcion resultado<-raizcuadrada(numero1)
	Definir resultado Como Real
	resultado<-raiz(numero1)
FinFuncion

Funcion resultado<-promedio(numero1 , numero2, numero3)
	Definir resultado Como Real
	resultado<-(numero1 + numero2 + numero3) / 3
FinFuncion

Funcion resultado<-area(numero1)
	Definir resultado Como Real
	resultado<-(numero1*numero1)*PI
FinFuncion
	