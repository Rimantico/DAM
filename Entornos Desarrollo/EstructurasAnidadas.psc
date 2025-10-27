Algoritmo EstructurasAnidadas
	Repetir
		Escribir "Calificaciones Estudiantes"
		Escribir "Introduce la primera nota"
		Leer Nota1
		Escribir "Introduce la segunda nota"
		Leer Nota2
		Escribir "Introduce la tercera nota"
		Leer Nota3
		Si Nota1 >= 0 Y Nota1 <= 10 Y Nota2 >= 0 Y Nota2 <= 10 Y Nota3 >= 0 Y Nota3 <= 10
			Entonces
			Media<- (Nota1 + Nota2 + Nota3)/3
			Si Media >= 6
				Entonces
				Escribir "El estudiante ha aprobado con una media de ", Media
			SiNo
				Escribir "El alumno ha suspendido con una media de ", Media
			FinSi
		Sino
			Escribir "No has introducido una nota que este en el rango de 0 a 10"
		FinSi
		Escribir "¿Desea Introducir otro Estudiante?"
		Leer OtroEstudiante
	Hasta Que OtroEstudiante = "N"
	
	
FinAlgoritmo
