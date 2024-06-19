package pack;

public class CajaEnEuros {
	private double saldo;
	
	//Constructor
	public CajaEnEuros() {
		this.saldo=0.0;
	}
	
	//Metodo para agregar dinero en euros
	public void agregarDinero(double euros) {
		this.saldo+=euros;
	}
	
	//Metodo para obtener el saldo en Euros
	public double obtenerSaldo() {
		return this.saldo;
	}
}
