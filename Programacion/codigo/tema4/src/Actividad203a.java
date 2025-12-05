
public class Actividad203a {

	public static void main(String[] args) {
		CuentaCorriente cuenta = new CuentaCorriente("11111");
		
		cuenta.ingresar(1000);
		
		System.out.println(cuenta.getSaldo()); 
		
		cuenta.retirar(1100);
		
		System.out.println(cuenta.getSaldo()); 
		/*
		 * Si intento hacer esto me saldrá error porque el saldo es insuficiente
		 */
		
		cuenta.retirar(900);
		
		System.out.println(cuenta.getSaldo());
		
		/*
		 * En este caso si podre sacar el dinero ya que si tenemos el dinero en la cuenta,
		 */
		
		cuenta.retirar(100);
		
		System.out.println(cuenta.getSaldo());
		
		cuenta.ingresar(350);
		
		System.out.println(cuenta.getSaldo());
		
		cuenta.retirar(400);
		
		System.out.println(cuenta.getSaldo());
		
		/*
		 * No podremos retirarlo porque no tenemos en dinero suficiente
		 */

	}

}
