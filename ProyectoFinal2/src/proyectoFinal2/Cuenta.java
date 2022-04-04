package proyectoFinal2;


	public class Cuenta {
		private String titular;
		private String numeroCuenta;
		private double saldo;

		public Cuenta() {
		}

		// utilizaremos este constructor para declarar la instancia cuentas en el apartado principal
		public Cuenta(String titular, String cuenta, double saldo) {
			this.titular = titular;
			this.numeroCuenta = cuenta;
			this.saldo = saldo;
		}
	// -----------------------------------------------------------------------------------------------

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public String getTitular() {
			return titular;
		}

		public double getSaldo() {
			return this.saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public String getNumeroCuenta() {
			return numeroCuenta;
		}

		public void ingresarDinero(double cantidad) throws Exception {
			if (cantidad < 0) {
				throw new Exception("No se puede hacer un ingreso de un valor negativo");
			}
			this.saldo = this.saldo + cantidad;
		}

		public void retirarDinero(double cantidad) throws Exception {
			if (cantidad < 0) {
				throw new Exception("No se puede retirar una cantidad negativa");
			}
			if (getSaldo() < cantidad) {
				throw new Exception("Saldo insuficiente, retire una cantidad menor");
			}
			this.saldo = this.saldo - cantidad;
		}
	}
