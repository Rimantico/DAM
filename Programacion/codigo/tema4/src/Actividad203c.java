
public class Actividad203c {

	public static void main(String[] args) {
		// Cuadrado
		
		//Puntos del cuadrado
		Punto puntoCuadrado1 = new Punto(0,0);
		Punto puntoCuadrado2 = new Punto(0,20);
		Punto puntoCuadrado3 = new Punto(20,0);
		Punto puntoCuadrado4 = new Punto(20,20);
		
		//Lineas del cuadrado
		Linea lineaCuadrado1 = new Linea(puntoCuadrado1,puntoCuadrado2);
		Linea lineaCuadrado2 = new Linea(puntoCuadrado3,puntoCuadrado4);
		Linea lineaCuadrado3 = new Linea(puntoCuadrado1,puntoCuadrado3);
		Linea lineaCuadrado4 = new Linea(puntoCuadrado2,puntoCuadrado4);
		
		// Resultado
		
		System.out.println(lineaCuadrado1.getLongitud());
		System.out.println(lineaCuadrado2.getLongitud());
		System.out.println(lineaCuadrado3.getLongitud());
		System.out.println(lineaCuadrado4.getLongitud());
		
	}

}
