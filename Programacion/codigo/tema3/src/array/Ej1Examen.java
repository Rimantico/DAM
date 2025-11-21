package array;

public class Ej1Examen {
	
	//Programa principal

	public static void main(String[] args) {
		//Arrays
		double[] array1 = crearArray();
		double[] array2 = crearArray();
		
		
		double[] resultado = compararValores(array1, array2);
		double mayorA = resultado[0];
		double mayorB = resultado[1];
		double iguales = resultado[2];
		String mayor;
		if(mayorA > mayorB) {
			mayor= "MayorA";
		}else
			if(mayorB > mayorA) {
				mayor= "MayorB";
			}else
				mayor = "Empate";
		
		
		System.out.println("Resultados");
		System.out.println("El array con más valores mayores es: " + mayor);
        System.out.println("Casillas donde A > B: " + mayorA);
        System.out.println("Casillas donde B > A: " + mayorB);
        System.out.println("Casillas iguales: " + iguales);

		
	}
	//Introducir valores en el array
	public static double[] crearArray() {
		double[] array = new double[100];
		double numAleatorio;
		
		for(int i = 0 ; i<array.length; i++) {
			numAleatorio = (Math.random()*10)+1;
			array[i] = numAleatorio;
		}
		
		return array;
	}
	
	//Comparar Array
	public static double[] compararValores(double[] array1 , double[] array2) {
		int mayorA = 0;
		int mayorB = 0;
		int iguales = 0;
		
		for(int i= 0 ; i<array1.length; i++) {
			if(array1[i] > array2[i]) {
				mayorA= incrementarValor(mayorA);
			}else if(array2[i] > array1[i]) {
				mayorB=incrementarValor(mayorB);		
			}else
				iguales=incrementarValor(iguales);
		}
		
		return new double[] {mayorA, mayorB , iguales};
	}
	
	//Incrementar el valor
	public static int incrementarValor(int valor) {
		return valor +1;
	}
}

