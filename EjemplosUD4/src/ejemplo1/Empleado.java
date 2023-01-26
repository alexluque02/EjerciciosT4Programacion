package ejemplo1;

public class Empleado extends Trabajador {

	private double sueldo;
	private double impuestos;
	
	public Empleado(String nombre, String puesto, double sueldo, double impuestos) {
		super(nombre, puesto); //Llama al constructor de la superclase
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return super.toString()+"Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]"; //super.toString() para llamar al de arriba
	}
	
	//super()--> Llamada al constructor de la superclase	
	//super. --> Para llamar a métodos de la superclase 
	
	public double calcularPaga(int numHijos) {
		double divisor=100;
		return sueldo-(sueldo*impuestos/divisor)+super.calcularPaga(numHijos);
	}
}
