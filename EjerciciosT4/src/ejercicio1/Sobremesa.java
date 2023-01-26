package ejercicio1;

public class Sobremesa extends Ordenador{

	private double precioMontaje;

	public Sobremesa(int capDiscoDuro, int frecuenciaProc, double precioBase, String marca, double precioMontaje) {
		super(capDiscoDuro, frecuenciaProc, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return super.toString()+"Sobremesa [precioMontaje=" + precioMontaje + "]";
	}
	
	public double calcularPvp(double porc) {
		return precioMontaje+super.calcularPvp(porc);
	}
}
