package array;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//Declaracion del array
		int[] aleatorio = new int[10];
		//Introducir los numeros aleatorios
		int valor;
		
		//Introducir datos en el array
		for(int i = 0 ; i<aleatorio.length ; i++) {
			//Un numero aleatorio del 1 al 10. Si no pongo el + 1 será hasta el 9
			valor = (int)(Math.random() * 10)+ 1;
			aleatorio[i] = valor;
		}
	
		//Saca por pantalla los datos del array
		for (int i = 0 ; i<aleatorio.length ; i++) {
			System.out.println("El numero aleatorio " + (i+1) + " es " + aleatorio[i]);
		}
	}

}
