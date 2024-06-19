package pack;

public class ConversorDeMoneda {
	private double tasaDeCambio;
	
	//Constructor
	public ConversorDeMoneda(double tasaDeCambio) {
		this.tasaDeCambio=tasaDeCambio;
	}
	
	//Metodo que convierte de pesos a Euros
	public double convertirAEuros(double pesos) {
		return pesos/tasaDeCambio;
	}
}
