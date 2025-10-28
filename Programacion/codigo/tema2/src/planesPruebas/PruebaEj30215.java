package planesPruebas;

public class PruebaEj30215 {

	public static void main(String[] args) {
System.out.println("TABLAS DE MULTIPLICAR");
		
		for(int i = 1 ; i <= 10 ; i++ ) {
			System.out.println("Tabla del " + i);
			System.out.println("-------------");
			for(int j = 1 ; j<= 10; j++) {
				System.out.println(i + " X " + j + " = " + i*j );
			}
		}
		
		/*
		 * Al no tener que introducir algun valor lo unico que podemos hacer es modificar el bucle para que nos de la tabla de multiplicar del numero que queramos o hasta cuantos numeros queremos multiplicar
		 */

	}

}
