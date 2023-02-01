package ejercicio4;

public class Electronica extends Producto{

	private int porcentaje;
	

	public Electronica(int codigo, String nombre, double precio, int porcentaje) {
		super(codigo, nombre, precio);
		this.porcentaje = porcentaje;
	}
	
	

	@Override
	public String toString() {
		return "Electronica [porcentaje=" + porcentaje + "]";
	}



	public int getPorcentaje() {
		return porcentaje;
	}



	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}



	public double calcularPrecio() {
		double div=100;
		return super.getPrecio()*(int)porcentaje/div;
	}
}
