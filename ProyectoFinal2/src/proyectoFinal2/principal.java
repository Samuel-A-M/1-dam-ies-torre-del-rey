package proyectoFinal2;

public class principal {

	public static void main(String[] args) throws Exception {
		Cuenta miCuenta = new Cuenta("samuel albarran murillo", "1111", 5000);

		System.out.println("Saldo actual " + miCuenta.getSaldo() + " €");
		System.out.println("ingresamos 200 €");
		miCuenta.ingresarDinero(200);
		System.out.println("Saldo actual " + miCuenta.getSaldo() + " €");

	}

}
