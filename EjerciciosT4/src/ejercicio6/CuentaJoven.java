package ejercicio6;

public class CuentaJoven extends Cuenta{

	private double bonificacion;
	
	public CuentaJoven(double saldo, int id, double bonificacion) {
		super(saldo, id);
		this.bonificacion = bonificacion;
	}
	
	public double getBonificacion() {
		return bonificacion;
	}

	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}
	

	@Override
	public String toString() {
		return "CuentaJoven [bonificacion=" + bonificacion + "]";
	}

	public void ingresar(double cant) {
		super.ingresar(cant);
		setSaldo(getSaldo()+1);
		bonificacion+=1;
	}
	
	

	
	
}
