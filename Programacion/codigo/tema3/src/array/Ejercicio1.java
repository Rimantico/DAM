package array;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int[] aleatorio = new int[10];
		int valor;
				
		for(int i = 0 ; i<aleatorio.length ; i++) {
			valor = (int)(Math.random() * 10)+ 1;
			aleatorio[i] = valor;
		}
	
		for (int i = 0 ; i<aleatorio.length ; i++) {
			System.out.println("El numero aleatorio " + i + " es " + aleatorio[i]);
		}
	}

}
