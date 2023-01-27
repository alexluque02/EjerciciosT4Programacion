package ejercicio3;

public class Motocicleta extends Vehiculo{

	public Motocicleta(int cilindrada, int potencia, String categoriaEmisiones, int impuesto) {
		super(cilindrada, potencia, categoriaEmisiones, impuesto);

	}

	@Override
	public String toString() {
		return "Motocicleta [getCilindrada()=" + getCilindrada() + ", getPotencia()=" + getPotencia()
				+ ", getCategoriaEmisiones()=" + getCategoriaEmisiones() + ", getImpuesto()=" + getImpuesto()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	public int calcularImpuesto() { //El porcentaje hay que pedirlo en el main porque por el tiempo puede cambiar
		int impuesto=calcularImpuesto();
		impuesto+=(int)getCilindrada()*0.6;
		return impuesto;
	}
}
