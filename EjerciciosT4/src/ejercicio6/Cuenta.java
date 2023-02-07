package ejercicio6;

public class Cuenta {

	private double saldo;
	private int id;

	public Cuenta(double saldo, int id) {
		super();
		this.saldo = saldo;
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", id=" + id + "]";
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public void ingresar(double cant) {
		saldo+=cant;
	}
	
	public void retirar(double cant) {
		saldo-=cant;
	}
}
