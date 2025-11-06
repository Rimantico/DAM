Proceso  ProyectoVentas
	
	Escribir "Proyecto Ventas"
	Repetir
		Escribir "1-- Registrar productos y precios"
		Escribir "2-- Registrar ventas diarias"
		Escribir "3-- Mostrar tabla completa de ventas"
		Escribir "4-- Calcular total vendido por producto"
		Escribir "5-- Calcular total vendido por día"
		Escribir "6-- Mostrar producto másy menos vendido"
		Escribir "7-- Buscar ventas de un producto específico"
		Escribir "8-- Salir del sistema"
		
		Escribir "Eliga una opcion"
		Leer opciones
		
		Segun opciones
			1:
				Escribir "Has elegido registrar prodcutos y sus precios"
				Escribir "¿Cuantos productos quiere introducir?"
				Leer producto
				//Pedimos los productos
				Dimension productos[producto]
				Para i<-1 Hasta producto Con Paso 1
					Escribir "Dime el nombre del producto " i
					Leer productos[i]
				FinPara
				//Pedimos los precios a esos productos
				Dimension precio[producto]
				Para i<-1 Hasta producto Con Paso 1
					Escribir "Dime el precio del producto " productos[i]
					Leer precio[i]
				FinPara
				Definir productoPrecio Como Real
			2:
				Escribir "Has elegido registrar ventas diarias"
				//Miramos los dias que queremos registrar
				Escribir "¿Cuantos días quiere registrar?"
				Leer Dias
				Dimension ventasdiarias[producto, Dias] 
				Dimension totalproductos[producto]
				//Registramos las ventas por productos
				Para i<-1 Hasta Dias Con Paso 1
					Para j<-1 Hasta producto Con Paso 1
						Escribir "Cuantas ventas registró " productos[j] " el dia " i
						Leer ventasdiarias[j , i]
					FinPara
				FinPara
				
			3:
				Escribir "Has elegido mostrar tabla completa de ventas"
				Para i<-1 Hasta Dias Con Paso 1
					Escribir " "
					Escribir "Dia " i
					Para j<-1 Hasta producto Con Paso 1
						Escribir productos[j]
						Escribir "Precio: "  precio[i] "?"
						Escribir "Total vendido: " ventasdiarias[j , i] " productos"
					FinPara
				FinPara
			4:
				Para i<-1 Hasta Dias Con Paso 1
					totalproductos[i]<-0
					Para j<-1 Hasta producto Con Paso 1
						totalproductos[j]<-totalproductos[j] + ventasdiarias[j ,i]*precio[j]
					FinPara
				FinPara
				Para j<-1 Hasta producto Con Paso 1
					Escribir  productos[j] ":" totalproductos[j]
				FinPara
			5:
				Para i <- 1 Hasta Dias Con Paso 1
					totalDia <- 0
					Escribir "Día ", i, ":"
					Para j <- 1 Hasta producto Con Paso 1
						ganancia <- ventasdiarias[j, i] * precio[j]
						totalDia <- totalDia + ganancia
						Escribir "   ", productos[j], ": " ganancia
					FinPara
					Escribir ">> Total del día " i, ": " totalDia
				FinPara
			6:
				
			7:
				
			8:
				Escribir "Saliendo del programa..."
				
				
				
		FinSegun
	Hasta Que opciones = 8

FinProceso

