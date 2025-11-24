package ejercicio18_examen2;
	
import java.util.Random;

public class Examen2 {

	    public static final int TOTAL_CARTAS = 52;
	    public static final int CARTAS_JUGADOR = 5;

	    public static void main(String[] args) {

	        String[] mazo = new String[TOTAL_CARTAS];
	        String[] jugador1 = new String[CARTAS_JUGADOR];
	        String[] jugador2 = new String[CARTAS_JUGADOR];

	        // Rellenamos mazo completo sin repetición
	        rellenar_array(mazo, TOTAL_CARTAS);

	        // Reparto inicial (sin repetir cartas)
	        repartir_cartas(jugador1, mazo);
	        repartir_cartas(jugador2, mazo);

	        // Mostrar resultados
	        System.out.println("JUGADOR 1");
	        mostrar_array(jugador1);

	        System.out.println("\nJUGADOR 2");
	        mostrar_array(jugador2);

	        System.out.println("\nRESTO DEL MAZO");
	        mostrar_array(mazo);
	    }

	    public static void rellenar_array(String[] array, int cantidad) {
	        Random r = new Random();

	        String[] valores = {"2","3","4","5","6","7","8","9","10","J","Q","K","AS"};
	        String[] palos = {"Corazones", "Picas", "Diamantes", "Trebol"};

	        int contador = 0;
	        while (contador < cantidad) {

	            String carta = valores[r.nextInt(13)] + " de " + palos[r.nextInt(4)];

	            // Comprobación de repetición dentro del mismo método
	            boolean repetida = false;
	            for (int i = 0; i < contador; i++) {
	                if (array[i].equals(carta)) {
	                    repetida = true;
	                    break;
	                }
	            }

	            if (!repetida) {
	                array[contador] = carta;
	                contador++;
	            }
	        }
	    }


	    public static void repartir_cartas(String[] jugador, String[] mazo) {
	        Random r = new Random();

	        for (int i = 0; i < jugador.length; i++) {
	            String carta;
	            do {
	                int pos = r.nextInt(TOTAL_CARTAS);
	                carta = mazo[pos];

	                if (carta != null) {
	                    jugador[i] = carta;
	                    mazo[pos] = null;    // eliminar carta del mazo
	                    break;
	                }

	            } while (true);
	        }
	    }

	    public static void mostrar_array(String[] array) {
	        for (String s : array) {
	            if (s != null) {
	                System.out.println(s);
	            }
	        }
	    }
	}
