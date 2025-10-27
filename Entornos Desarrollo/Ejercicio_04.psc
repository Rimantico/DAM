Algoritmo If_Segun
	Escribir 'Descuentos al cliente'
	Leer Importe
	
	Si Importe>250 Entonces
		Si Importe > 500
			Entonces
			A= "Mucho"
		SiNo
			A="Medio"
		FinSi
	SiNo
		A="Poco"
	FinSi
	
	Segun A
		"Poco": 
			Descuento = 0.10
		"Medio":
			Descuento = 0.15
		"Mucho":
			Descuento= 0.20
	FinSegun
	ResultadoImporte<- Importe-(Importe*Descuento)
	
	Escribir "Tendremos un descuento del: ", Descuento
	Escribir "Tendremos que pagar el siguiente importe: " ResultadoImporte 
FinAlgoritmo

