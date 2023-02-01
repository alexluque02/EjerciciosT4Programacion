package ejercicio4;

public class Ropa extends Producto{

	public Ropa(int codigo, String nombre, double precio) {
		super(codigo, nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public double calcularPrecio() {
		return super.getPrecio();
	}
}
