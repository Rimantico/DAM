Proceso ProyectoVentas
    Definir opciones, producto, Dias, i, j Como Entero
    Definir buscarProducto, masVendido, menosVendido Como Cadena
    Definir maxVenta, minVenta, totalDia, ganancia Como Real
    Definir encontrado Como Logico
    
    Escribir "=== Proyecto Ventas ==="
    
    Repetir
        Escribir "1-- Registrar productos y precios"
        Escribir "2-- Registrar ventas diarias"
        Escribir "3-- Mostrar tabla completa de ventas"
        Escribir "4-- Calcular total vendido por producto"
        Escribir "5-- Calcular total vendido por día"
        Escribir "6-- Mostrar producto más y menos vendido"
        Escribir "7-- Buscar ventas de un producto específico"
        Escribir "8-- Salir del sistema"
        Escribir "Elija una opción:"
        Leer opciones
        
        Segun opciones Hacer
            1:
                Escribir "¿Cuántos productos quiere introducir?"
                Leer producto
                Dimension productos[producto], precio[producto]
                Para i <- 1 Hasta producto Con Paso 1
                    Escribir "Nombre del producto ", i, ":"
                    Leer productos[i]
                FinPara
                Para i <- 1 Hasta producto Con Paso 1
                    Escribir "Precio de ", productos[i], ":"
                    Leer precio[i]
                FinPara
                
            2:
                Si producto = 0 Entonces
                    Escribir "Primero registre productos (opción 1)."
                Sino
                    Escribir "¿Cuántos días quiere registrar?"
                    Leer Dias
                    Dimension ventasdiarias[producto, Dias]
                    Para i <- 1 Hasta Dias Con Paso 1
                        Para j <- 1 Hasta producto Con Paso 1
                            Escribir "Ventas de ", productos[j], " el día ", i, ":"
                            Leer ventasdiarias[j, i]
                        FinPara
                    FinPara
                FinSi
                
            3:
				Escribir "Has elegio mostrar tabla completa de ventas"
                Para i <- 1 Hasta Dias Con Paso 1
                    Escribir ""
                    Escribir "Día ", i
                    Para j <- 1 Hasta producto Con Paso 1
                        Escribir productos[j], " Precio: ", precio[j], "  Vendido: ", ventasdiarias[j, i], " unidades"
                    FinPara
                FinPara
                
            4:
				Escribir "Has elegido calcular total por producto"
                Dimension totalproductos[producto]
                Para j <- 1 Hasta producto Con Paso 1
                    totalproductos[j] <- 0
                    Para i <- 1 Hasta Dias Con Paso 1
                        totalproductos[j] <- totalproductos[j] + ventasdiarias[j, i] * precio[j]
                    FinPara
                FinPara
                Para j <- 1 Hasta producto Con Paso 1
                    Escribir productos[j], ": ", totalproductos[j]
                FinPara
                
            5:
				Escribir "Has elegido calcular total por día"
                Para i <- 1 Hasta Dias Con Paso 1
                    totalDia <- 0
                    Escribir "Día ", i, ":"
                    Para j <- 1 Hasta producto Con Paso 1
                        ganancia <- ventasdiarias[j, i] * precio[j]
                        totalDia <- totalDia + ganancia
                        Escribir "   ", productos[j], ": ", ganancia
                    FinPara
                    Escribir "Total del día ", i, ": ", totalDia
                FinPara
                
            6:
				Escribir "Has elegido Mostrar Producto más y menos vendido"
                Dimension totalUnidades[producto]
                Para j <- 1 Hasta producto Con Paso 1
                    totalUnidades[j] <- 0
                    Para i <- 1 Hasta Dias Con Paso 1
                        totalUnidades[j] <- totalUnidades[j] + ventasdiarias[j, i]
                    FinPara
                FinPara
                
                maxVenta <- totalUnidades[1]
                minVenta <- totalUnidades[1]
                masVendido <- productos[1]
                menosVendido <- productos[1]
                
                Para j <- 2 Hasta producto Con Paso 1
                    Si totalUnidades[j] > maxVenta Entonces
                        maxVenta <- totalUnidades[j]
                        masVendido <- productos[j]
                    FinSi
                    Si totalUnidades[j] < minVenta Entonces
                        minVenta <- totalUnidades[j]
                        menosVendido <- productos[j]
                    FinSi
                FinPara
                
                Escribir "Producto más vendido: ", masVendido, " con ", maxVenta, " unidades."
                Escribir "Producto menos vendido: ", menosVendido, " con ", minVenta, " unidades."
                
            7:
                Escribir "Ingrese el nombre del producto a buscar:"
                Leer buscarProducto
                encontrado <- Falso
                Para j <- 1 Hasta producto Con Paso 1
                    Si productos[j] = buscarProducto Entonces
                        encontrado <- Verdadero
                        Escribir "Ventas de ", productos[j], ":"
                        Para i <- 1 Hasta Dias Con Paso 1
                            Escribir "   Día ", i, ": ", ventasdiarias[j, i], " unidades."
                        FinPara
                    FinSi
                FinPara
                Si No encontrado Entonces
                    Escribir "No se encontró el producto ", buscarProducto
                FinSi
                
            8:
                Escribir "Saliendo del programa..."
        FinSegun
    Hasta Que opciones = 8
FinProceso
