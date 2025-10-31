package pruebas;

public class NumerosPrimos {

	public static void main(String[] args) {
		for(int i = 1 ; i<= 100 ; i++) {
			int primos= 0;
			
			for(int j = 1; j<=i ; j++) {
				
				if(i%j == 0) {
					primos++;
				}
				
			}
			if(primos <= 2)
				System.out.println(i);
		}

	}

}
