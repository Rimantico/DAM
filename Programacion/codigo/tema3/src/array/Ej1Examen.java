package array;

public class Ej1Examen {
	
	//Programa principal

	public static void main(String[] args) {
		//Arrays
		double[] array1 = crearArray();
		double[] array2 = crearArray();
		
				
		
		
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
	public static double[] resultado(double[] array1 , double[] array2) {
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

