package proyectoFinal2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaTest {

	Cuenta miCuenta1 = new Cuenta("samuel albarran murillo", "1111", 5000);

	@Test
	public void TestIngresarDinero() throws Exception {
		// verificamos el saldo actual de cuenta1
		System.out.println("saldo actual de " + miCuenta1.getTitular() + " " + miCuenta1.getSaldo() + " €");
		// mostramos el texto citado
		System.out.println("ejecutamos ingresar dinero y realizamos el test a miCuenta1");
		// ejecutamos el metodo ingresar dinero
		miCuenta1.ingresarDinero(200);
		// mostramos el texto citado
		System.out.println("Dinero tras ingreso " + miCuenta1.getSaldo() + " €");
		// comprobamos que la cifra esperada (5200) sea igual que la que almacena la
		// variable saldo tras el metodo
		assertEquals(5200, miCuenta1.getSaldo());
		// comprobamos que el objeto saldo no sea nulo
		assertNotNull(miCuenta1.getSaldo());
		System.out.println("                                                                               ");

	}
}
