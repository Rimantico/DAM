Algoritmo Matriz3x3
	
	Definir matriz  Como Entero
	Dimension matriz[3, 3]
    Definir i, j Como Entero
	
    // Llenar la matriz con los valores introducidos por el usuario
    Para i <- 1 Hasta 3 Con Paso 1
        Para j <- 1 Hasta 3 Con Paso 1
            Escribir "Introduce el valor para la posición [", i, ",", j, "]"
            Leer matriz[i, j]
        FinPara
    FinPara
	
    // Imprimir la matriz
    Escribir "La matriz es:"
    Para i <- 1 Hasta 3 Con Paso 1
        Para j <- 1 Hasta 3 Con Paso 1
            Escribir matriz[i, j] Sin Saltar
        FinPara
        Escribir ""  // Salto de línea
    FinPara
	
FinAlgoritmo
