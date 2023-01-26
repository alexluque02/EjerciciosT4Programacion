package ejercicio3;

public class Vehiculo {

	private int cilindrada;
	private int potencia;
	private String categoriaEmisiones;
	private int impuesto;
	
	public Vehiculo(int cilindrada, int potencia, String categoriaEmisiones, int impuesto) {
		super();
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.categoriaEmisiones = categoriaEmisiones;
		this.impuesto = impuesto;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCategoriaEmisiones() {
		return categoriaEmisiones;
	}

	public void setCategoriaEmisiones(String categoriaEmisiones) {
		this.categoriaEmisiones = categoriaEmisiones;
	}

	public int getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(int impuesto) {
		this.impuesto = impuesto;
	}

	@Override
	public String toString() {
		return "Vehiculo [cilindrada=" + cilindrada + ", potencia=" + potencia + ", categoriaEmisiones="
				+ categoriaEmisiones + ", impuesto=" + impuesto + "]";
	}
	
	//(cero, ECO, tipo B y tipo C)
	
	public int calcularImpuesto() {
		if(categoriaEmisiones.equalsIgnoreCase("cero")) {
			return impuesto=0;
		}else if(categoriaEmisiones.equalsIgnoreCase("ECO")) {
			return impuesto=50;
		}else if(categoriaEmisiones.equalsIgnoreCase("tipo B")){
			return impuesto=75;
		}else { //Si se equivocan es tipo a, el impuesto más alto
			return impuesto=100;
		}
	}
}
