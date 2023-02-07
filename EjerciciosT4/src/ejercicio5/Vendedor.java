package ejercicio5;

public class Vendedor extends Empleado{

	private int cantVentas;
	private double incentivo;
	
	public Vendedor(String nombre, String apellidos, double sueldoB, int numEmpleado, int cantVentas,
			double incentivo) {
		super(nombre, apellidos, sueldoB, numEmpleado);
		this.cantVentas = cantVentas;
		this.incentivo = incentivo;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Vendedor [cantVentas=" + cantVentas + ", incentivo=" + incentivo + "]";
	}
	@Override
	public double calcularSueldo() {
		// TODO Auto-generated method stub
		return super.calcularSueldo()+cantVentas*incentivo/100;
	}
	
	public void comprobarIncentivo(int objetivo) {
		if(cantVentas>objetivo) {
			System.out.println("Felicidades. Has cumplido el incentivo");
		}else {
			System.out.println("No has cumplido tu objetivo");
		}
	}
	
	public void felicitar(int objetivo) {
		if(cantVentas>=objetivo) {
			System.out.println("Felicidades. Has alcanzado el objetivo");
		}
	}
	

}
