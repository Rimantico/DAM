package array;

public class Ej2Examen {

	public static void main(String[] args) {
		// Inicio el array con limite 100
		double[] temperaturas = new double[100];

		// Introduzco los valores del array
		double temperaturasAleatorias;
		for (int i = 0; i < temperaturas.length; i++) {
			temperaturasAleatorias = (Math.random() * 50) + 1;
			temperaturas[i] = temperaturasAleatorias;
		}

		// Muestro por pantalla los valores mínimos y maximos con bucle for
		double temperaturaMin = Double.POSITIVE_INFINITY;
		double temperaturaMax = Double.NEGATIVE_INFINITY;

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] > temperaturaMax)
				temperaturaMax = temperaturas[i];
			if (temperaturas[i] < temperaturaMin)
				temperaturaMin = temperaturas[i];
		}
		System.out.println("La temperatura máxima es de " + temperaturaMax);
		System.out.println("La temperatura mínima es de " + temperaturaMin);

		// Hacer la media de las temperaturas con bucle for
		double mediaTemp = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			mediaTemp += temperaturas[i];
		}
		mediaTemp = mediaTemp / 100;
		System.out.println("La media total de las temperaturas es de " + mediaTemp);

		// Muestro por pantalla la temperatura máxima y minima con bucle for each
		double tempMax = Double.NEGATIVE_INFINITY;
		double tempMin = Double.POSITIVE_INFINITY;
		for (double temp : temperaturas) {
			if (temp > tempMax)
				tempMax = temp;
			if (temp < tempMin)
				tempMin = temp;
		}
		System.out.println("La temperatura máxima es de " + tempMax);
		System.out.println("La temperatura mínima es de " + tempMin);
		
		// Muestro por pantalla la media con un bucle for each

		double mediaTempForEach = 0;
		for (double temp : temperaturas) {
			mediaTempForEach += temp;
		}	
		
		mediaTempForEach = mediaTempForEach / 100;
		System.out.println("La media total de las temperaturas es de " + mediaTempForEach);

	}

}
