package ejercicio15;
	
import java.util.Scanner;
	
public class ejercicio15 {

	    public static final int PARTIDOS = 15;

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String[][] equipos = new String[PARTIDOS][2];	// equipo1 - equipo2
	        int[][] resultados = new int[PARTIDOS][2];		// goles1  - goles2

	        System.out.println("Introduzca el nombre de los equipos y los goles obtenidos");
	        for (int i = 0; i < PARTIDOS; i++) {
	            System.out.println("\nPartido " + (i + 1));

	            System.out.print("Nombre del equipo local: ");
	            equipos[i][0] = sc.nextLine();

	            System.out.print("Nombre del equipo visitante: ");
	            equipos[i][1] = sc.nextLine();

	            resultados[i][0] = leerEntero(sc, "Goles de " + equipos[i][0] + ": ");
	            resultados[i][1] = leerEntero(sc, "Goles de " + equipos[i][1] + ": ");
	        }

	        System.out.println("\nQUINIELA DE LA JORNADA\n");
	        for (int i = 0; i < PARTIDOS; i++) {
	            System.out.println("Partido " + (i + 1) + ": " + equipos[i][0] + " " + resultados[i][0] + 
	                " - " + resultados[i][1] + " " + equipos[i][1] + "  QUINIELA: " + calcularSigno(resultados[i][0], resultados[i][1])
	            );
	        }
	        sc.close();
	    }

	    public static int leerEntero(Scanner sc, String mensaje) {
	        int numero;
	        while (true) {
	            System.out.print(mensaje);
	            try {
	                numero = Integer.parseInt(sc.nextLine());
	                if (numero >= 0)
	                    return numero;
	                else
	                    System.err.println("El número no puede ser negativo.");
	            } catch (NumberFormatException e) {
	                System.err.println("Error: introduce un número válido.");
	            }
	        }
	    }
	    // Calcula el signo de la quiniela
	    public static String calcularSigno(int goles1, int goles2) {
	        if (goles1 > goles2)
	            return "1";      
	        else if (goles2 > goles1)
	            return "2";      
	        else
	            return "X";      
	    }
	}
