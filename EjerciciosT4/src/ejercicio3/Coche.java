package ejercicio3;

public class Coche extends Vehiculo{

	public Coche(int cilindrada, int potencia, String categoriaEmisiones, int impuesto) {
		super(cilindrada, potencia, categoriaEmisiones, impuesto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Coche [getCilindrada()=" + getCilindrada() + ", getPotencia()=" + getPotencia()
				+ ", getCategoriaEmisiones()=" + getCategoriaEmisiones() + ", getImpuesto()=" + getImpuesto()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	public int calcularImpuesto() {
		int impuesto=super.calcularImpuesto();
		impuesto+=(int) super.getPotencia()*0.25;
		return impuesto;
	}
}
