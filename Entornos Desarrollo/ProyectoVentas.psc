Proceso  ProyectoVentas
	
	Escribir "Proyecto Ventas"
	
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
			Escribir "Dime el numero de productos que quiere introducir"
			Leer numProductos
			dimension numeroProductos[numProductos]
			dimension precioprodcutos[numProductos]
			Para i<-1 Hasta numProductos Con Paso 1
				Escribir "Dime el " i "º producto"
				Leer numeroProductos[i]
			FinPara
			Escribir "Dime el precio de los productos"
			Para i<-1 Hasta  numProductos Con Paso 1
				Escribir " Introduce el precio del producto " numeroProductos[i]
				Leer precioprodcutos[i]
			FinPara
			dimension productos(numeroProductos[], precioprodcutos[])
		2:
			dimension totalvendido(numeroProductos)
			Escribir "Ventas diarias de cada producto"
			para i<-1 Hasta numeroProductos Con Paso 1
				Escribir "Cuanto ha vendido " numeroProdutos[i]
				Leer totalvendido[i]
				
				totalvendido[i] * totalvendido[i]
			FinPara
			
		3:
			
		4:
			
		5:
			
		6:
			
		7:
			
		8:
			Escribir "Saliendo del programa..."
	FinSegun
	
FinProceso

