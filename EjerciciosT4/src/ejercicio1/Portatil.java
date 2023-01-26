package ejercicio1;

public class Portatil extends Ordenador{

	private double seguro;

	public Portatil(int capDiscoDuro, int frecuenciaProc, double precioBase, String marca, double seguro) {
		super(capDiscoDuro, frecuenciaProc, precioBase, marca);
		this.seguro = seguro;
	}

	public double getSeguro() {
		return seguro;
	}

	public void setSeguro(double seguro) {
		this.seguro = seguro;
	}

	@Override
	public String toString() {
		return super.toString()+"Portatil [seguro=" + seguro + "]";
	}
	
	public double calcularPvp(double porc) {
		return seguro+super.calcularPvp(porc);
	}
}
