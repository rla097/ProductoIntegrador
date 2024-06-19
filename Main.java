package pack;

public class Main {
    public static void main(String[] args) {
        // Tasa de cambio de ejemplo: 1 Euro = 20 Pesos
        double tasaDeCambio = 20.0;
        ConversorDeMoneda conversor = new ConversorDeMoneda(tasaDeCambio);
        CajaEnEuros caja = new CajaEnEuros();

        // Cantidad en pesos a convertir
        double cantidadEnPesos = 5000.0;
        double cantidadEnEuros = conversor.convertirAEuros(cantidadEnPesos);

        // Mostrar el equivalente en Euros
        System.out.println("Cantidad en Pesos: " + cantidadEnPesos);
        System.out.println("Cantidad en Euros: " + cantidadEnEuros);

        // Agregar la cantidad en Euros a la caja
        caja.agregarDinero(cantidadEnEuros);

        // Mostrar el saldo en Euros
        System.out.println("Saldo en Euros en la caja: " + caja.obtenerSaldo());
    }
}