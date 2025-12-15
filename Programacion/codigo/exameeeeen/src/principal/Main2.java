package principal;

import java.util.Scanner;
import clase.Alumno;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear 2 alumnos
        Alumno alumno1 = new Alumno("111A", "Ana", 20, 5);
        Alumno alumno2 = new Alumno("222B", "Luis", 22, 5);

        // Introducir notas alumno 1
        System.out.println("Introduce las 5 notas del alumno 1:");
        alumno1.introducirNotas(sc);

        // Introducir notas alumno 2
		System.out.println("\nIntroduce las 5 notas del alumno 2:");
        alumno2.introducirNotas(sc);
         

        // Mostrar alumnos y sus notas
        System.out.println("\nDatos del alumno 1:");
        System.out.println(alumno1.toString());

        System.out.println("\nDatos del alumno 2:");
        System.out.println(alumno2.toString());

        // Comparar notas mayores
        int mayor1 = alumno1.notaMayor();
        int mayor2 = alumno2.notaMayor();

        System.out.println("\nNota mayor de " + alumno1.getNombre() + ": " + mayor1);
        System.out.println("Nota mayor de " + alumno2.getNombre() + ": " + mayor2);

        if (mayor1 > mayor2) {
            System.out.println("El alumno con la nota mayor es: " + alumno1.getNombre());
        } else if (mayor2 > mayor1) {
            System.out.println("El alumno con la nota mayor es: " + alumno2.getNombre());
        } else {
            System.out.println("Ambos alumnos tienen la misma nota mayor");
        }

        sc.close();
    }
}
