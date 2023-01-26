package ejercicio1;

public class Ordenador {

	private int capDiscoDuro;
	private int frecuenciaProc;
	private double precioBase;
	private String marca;
	
	public Ordenador(int capDiscoDuro, int frecuenciaProc, double precioBase, String marca) {
		super();
		this.capDiscoDuro = capDiscoDuro;
		this.frecuenciaProc = frecuenciaProc;
		this.precioBase = precioBase;
		this.marca = marca;
	}

	public int getCapDiscoDuro() {
		return capDiscoDuro;
	}

	public void setCapDiscoDuro(int capDiscoDuro) {
		this.capDiscoDuro = capDiscoDuro;
	}

	public int getFrecuenciaProc() {
		return frecuenciaProc;
	}

	public void setFrecuenciaProc(int frecuenciaProc) {
		this.frecuenciaProc = frecuenciaProc;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [capDiscoDuro=" + capDiscoDuro + ", frecuenciaProc=" + frecuenciaProc + ", precioBase="
				+ precioBase + ", marca=" + marca + "]";
	}
	
	public double calcularPvp(double porc) {
		return precioBase+(precioBase*porc/100);
	}
}
