Algoritmo EstructurasAnidadasII
	PrecioBase<-50
	Descuento5<-0.05
	Descuento10<-0.1
	Escribir "Compra de entradas para espectáculos"
	Repetir
		Escribir "¿Cuantos espectáculos desea ver?"
		Leer NumEspectaculos
		Si NumEspectaculos >=1
			TotalEntradas<-0
			Para i<-1 Hasta NumEspectaculos Con Paso 1 Hacer
				Escribir "Cuantas Entradas Quiere para el ",i "º Espectaculo"
				Leer NumEntradas
				Si NumEntradas <= 0
					Escribir"Numero de entradas erronea, vuelva a introducir un numero valido"
				SiNo
					TotalEntradas<-TotalEntradas+(PrecioBase*NumEntradas)
				FinSi
			FinPara
		FinSi
		Si TotalEntradas <= 100
			Escribir "El total sin descuento es de ", TotalEntradas
			Escribir "No tienes descuento, el precio total a pagar es de ",TotalEntradas
		SiNo
			Si TotalEntradas >100 Y TotalEntradas < 200
				
				Escribir"El total sin descuento es de ", TotalEntradas
				TotalEntradas<-TotalEntradas-(TotalEntradas*Descuento5)
				Escribir "Tienes un descuento del 5%"
				Escribir "El precio total a pagar es de ", TotalEntradas
			SiNo
				Escribir"El total sin descuento es de ", TotalEntradas
				TotalEntradas<-TotalEntradas-(TotalEntradas*Descuento10)
				Escribir "Tienes un descuento del 10%"
				Escribir "El precio total a pagar es de ", TotalEntradas
			FinSi
		FinSi
		Escribir "¿Desea Ingresar otro cliente?"
		Leer Cliente
	Hasta Que Cliente = "N"
FinAlgoritmo
