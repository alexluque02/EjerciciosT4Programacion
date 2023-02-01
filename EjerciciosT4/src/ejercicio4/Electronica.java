package ejercicio4;

public class Electronica extends Producto{

	public Electronica(int codigo, String nombre, double precio) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public double calcularPrecio(int desc) {
		double div=100;
		return super.getPrecio()*(int)desc/div;
	}
}
