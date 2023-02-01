package ejercicio4;

public class Alimentacion extends Producto{

	private int caducidad;
	
	public Alimentacion(int codigo, String nombre, double precio, int caducidad) {
		super(codigo, nombre, precio);
		this.caducidad = caducidad;
	}
	
	

	@Override
	public String toString() {
		return "Alimentacion [caducidad=" + caducidad + "]";
	}



	public int getCaducidad() {
		return caducidad;
	}



	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}



	public double calcularPrecio() {
		if(caducidad<=2) {
			return super.getPrecio()*(1-0.2);
		}else {
			return super.getPrecio();
		}
	}
	
	public void avisarCaducacion() {
		if(caducidad<=2) {
			System.out.println("Al producto le quedan menos de dos días para caducar");
		}
	}
}
