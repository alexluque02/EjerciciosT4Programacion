package ejercicio5;

public class Gerente extends Empleado{

	private double impuestos;

	public Gerente(String nombre, String apellidos, double sueldoBase, int nEmpleado, double impuestos) {
		super(nombre, apellidos, sueldoBase, nEmpleado);
		this.impuestos = impuestos;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "Gerente [impuestos=" + impuestos + "]";
	}
	
	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return super.calcularSueldo()-super.calcularSueldo()*impuestos/100;
	}
}
