package ejercicio5;

public class Empleado {

	private String nombre;
	private String apellidos;
	private double sueldoB;
	private int numEmpleado;
	
	public Empleado(String nombre, String apellidos, double sueldoB, int numEmpleado) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoB = sueldoB;
		this.numEmpleado = numEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSueldoB() {
		return sueldoB;
	}

	public void setSueldoB(double sueldoB) {
		this.sueldoB = sueldoB;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoB=" + sueldoB + ", numEmpleado="
				+ numEmpleado + "]";
	}
	
	public double calcularSueldo() {
		return sueldoB;
	}
}
