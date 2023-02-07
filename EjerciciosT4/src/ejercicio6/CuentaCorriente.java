package ejercicio6;

public class CuentaCorriente extends Cuenta{

	private double mantenimientoFijo;
	private int puntos=0;

	public CuentaCorriente(double saldo, int id, double mantenimientoFijo, int puntos) {
		super(saldo, id);
		this.mantenimientoFijo = mantenimientoFijo;
		this.puntos = puntos;
	}
	
	

	@Override
	public String toString() {
		return "CuentaCorriente [mantenimientoFijo=" + mantenimientoFijo + ", puntos=" + puntos + "]";
	}



	public double getMantenimientoFijo() {
		return mantenimientoFijo;
	}



	public void setMantenimientoFijo(double mantenimientoFijo) {
		this.mantenimientoFijo = mantenimientoFijo;
	}



	public int getPuntos() {
		return puntos;
	}



	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}



	public void ingresar(double cant) {
		super.ingresar(cant);
		puntos++;
	}
	
	public void retirar(double cant) {
		super.retirar(cant);
		puntos++;
	}
	
	
}
