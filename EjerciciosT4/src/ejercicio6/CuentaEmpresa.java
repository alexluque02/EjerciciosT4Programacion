package ejercicio6;

public class CuentaEmpresa extends Cuenta{

	private double comision;
	
	public CuentaEmpresa(double saldo, int id, double comision) {
		super(saldo, id);
		this.comision=comision;
	}

	
	public double getComision() {
		return comision;
	}


	public void setComision(double comision) {
		this.comision = comision;
	}


	@Override
	public String toString() {
		return "CuentaEmpresa [comision=" + comision + "]";
	}


	public void retirar(double cant) {
		super.retirar(cant);
		setSaldo(getSaldo()-1);
		comision+=1;
	}

	
}
