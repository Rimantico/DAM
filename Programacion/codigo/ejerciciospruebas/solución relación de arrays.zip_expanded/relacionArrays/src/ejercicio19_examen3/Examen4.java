package ejercicio19_examen3;
	
import java.util.Random;
	
public class Examen4 {
	
	public static final int DIAS = 100;

    public static void main(String[] args) {

	        int[] temperaturas = new int[DIAS];
	        Random random = new Random();

	        // Rellenamos el array de las temperaturas entre 0 y 45ºC
	        for (int i = 0; i < DIAS; i++) {
	            temperaturas[i] = random.nextInt(46); 
	        }

	        // Calculamos el mínimo y el máximo valor
	        int minimo = temperaturas[0];
	        int maximo = temperaturas[0];

	        for (int i = 1; i < DIAS; i++) {
	            if (temperaturas[i] < minimo) minimo = temperaturas[i];
	            if (temperaturas[i] > maximo) maximo = temperaturas[i];
	        }
	        System.out.println("Temperatura mínima: " + minimo);
	        System.out.println("Temperatura máxima: " + maximo);

	        // Calculamos la media
	        int suma = 0;
	        for (int t : temperaturas) {
	            suma += t;
	        }
	        double media = (double) suma / DIAS;
	        System.out.println("Media de temperaturas: " + media);

	        // Ordenación por el método de la burbuja
	        int[] ordenado = new int[DIAS];

	        for (int i = 0; i < DIAS; i++) {
	            ordenado[i] = temperaturas[i];
	        }

	        for (int i = 0; i < DIAS - 1; i++) {
	            for (int j = 0; j < DIAS - 1 - i; j++) {
	                if (ordenado[j] > ordenado[j + 1]) {
	                    int aux = ordenado[j];
	                    ordenado[j] = ordenado[j + 1];
	                    ordenado[j + 1] = aux;
	                }
	            }
	        }

	        // Mostrar lista ordenada
	        System.out.println("\nTemperaturas ordenadas (burbuja):");
	        for (int t : ordenado) {
	            System.out.print(t + " ");
	        }
	        System.out.println();

	        // Calculamos el segundo menor y mayor
	        int segundaMenor = -1;
	        int segundaMayor = -1;

	        // buscar segunda menor
	        for (int i = 1; i < DIAS; i++) {
	            if (ordenado[i] != ordenado[0]) {
	                segundaMenor = ordenado[i];
	                break;
	            }
	        }

	        // buscar segunda mayor
	        for (int i = DIAS - 2; i >= 0; i--) {
	            if (ordenado[i] != ordenado[DIAS - 1]) {
	                segundaMayor = ordenado[i];
	                break;
	            }
	        }

	        System.out.println("\nSegunda temperatura menor: " + segundaMenor);
	        System.out.println("Segunda temperatura mayor: " + segundaMayor);

	        // Calculamos las fechas
	        int indexMax = 0;
	        int indexMin = 0;

	        for (int i = 0; i < DIAS; i++) {
	            if (temperaturas[i] == maximo) indexMax = i;
	            if (temperaturas[i] == minimo) indexMin = i;
	        }

	        String fechaMax = calcularFecha(30, 11, DIAS - 1 - indexMax);
	        String fechaMin = calcularFecha(30, 11, DIAS - 1 - indexMin);

	        System.out.println("\nLa temperatura máxima ocurrió el: " + fechaMax);
	        System.out.println("La temperatura mínima ocurrió el: " + fechaMin);
	    }

    	// Calculamos el día que corresponde
	    public static String calcularFecha(int dia, int mes, int restar) {

	        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	        while (restar > 0) {
	            dia--;
	            if (dia < 1) {
	                mes--;
	                if (mes < 1) mes = 12;
	                dia = diasMes[mes - 1];
	            }
	            restar--;
	        }
	        return dia + "/" + mes;
	    }
	}
