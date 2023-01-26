package ejercicio3;

public class Furgoneta extends Vehiculo{

	private int impuestoFijo;

	public Furgoneta(int cilindrada, int potencia, String categoriaEmisiones, int impuesto, int impuestoFijo) {
		super(cilindrada, potencia, categoriaEmisiones, impuesto);
		this.impuestoFijo = impuestoFijo;
	}

	public int getImpuestoFijo() {
		return impuestoFijo;
	}

	public void setImpuestoFijo(int impuestoFijo) {
		this.impuestoFijo = impuestoFijo;
	}

	@Override
	public String toString() {
		return "Furgoneta [impuestoFijo=" + impuestoFijo + "]";
	}
	
	public int calcularImpuesto() {
		return impuestoFijo+super.calcularImpuesto();
	}
}
