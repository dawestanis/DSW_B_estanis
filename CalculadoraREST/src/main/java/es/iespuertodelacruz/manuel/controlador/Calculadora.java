package es.iespuertodelacruz.manuel.controlador;

/**
 *
 * @author Manuel Alejandro
 */
public class Calculadora {

	private double numero1;
	private double numero2;
	private String operacion;
	private double resultado;

	public Calculadora(double numero1, double numero2, String operacion) {
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.operacion = operacion;
		ejecutarOperacion();
	}

	private void ejecutarOperacion() {
		switch (operacion) {

			case "suma":
					this.resultado = numero1 + numero2;
				break;
			case "resta":
					this.resultado = numero1 - numero2;
				break;
			case "multiplicacion":
					this.resultado = numero1 * numero2;
				break;
			case "division":
					this.resultado = numero1 / numero2;
				break;

		}

	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
