package ejercicio4;

public class Alimentacion extends Producto{

	public Alimentacion(int codigo, String nombre, double precio) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public double calcularPrecio(int numDias) {
		if(numDias<=2) {
			return super.getPrecio()*(1-0.2);
		}else {
			return super.getPrecio();
		}
	}
	
	public void avisarCaducacion(int numDias) {
		if(numDias<=2) {
			System.out.println("Al producto le quedan menos de dos días para caducar");
		}
	}
}
