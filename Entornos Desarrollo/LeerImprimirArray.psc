Algoritmo LeerImprimirArray
	
	//Declarar un arreglo con indices de 1 a 7 
	Dimension arreglo[7]
	Definir i Como Entero
	
	//Leer los valores del arreglo
	Para i<-1 Hasta 7 Con Paso 1
		Escribir "Ingrese el valor para la posición " , i ": "
		Leer arreglo[i]
	FinPara
	
	//Imprimir los valores del arreglo
	Escribir "Los valores ingresados son: "
	Para i<- 1 Hasta 7 Con Paso 1
		Escribir "arreglo[", i, "] = ", arreglo[i]
	FinPara
	
FinAlgoritmo
