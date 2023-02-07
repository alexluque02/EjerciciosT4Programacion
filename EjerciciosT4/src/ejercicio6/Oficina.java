package ejercicio6;

import java.util.Arrays;

public class Oficina {

	private Cuenta [] lista;

	public Oficina(Cuenta[] lista) {
		super();
		this.lista = lista;
	}

	public Cuenta[] getLista() {
		return lista;
	}

	public void setLista(Cuenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void ingresarCuenta(Cuenta c, double cant) {
		c.ingresar(cant);
	}
	
	public void retirarCuenta(Cuenta c, double cant) {
		c.retirar(cant);
	}
	
	public Cuenta findById(int id) {
		int i=0;
		boolean encontrado=false;
		
		while (i<lista.length && !encontrado) {
			if(lista[i].getId()==id) {
				encontrado=true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return lista[i];
		}else {
			return null;
		}
	}
	
	public double calcularSaldoTotal() {
		double suma=0;
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			suma+=lista[i].getSaldo();
		}
		return suma;
	}
	
	public void mostrarSaldo(Cuenta c) {
		System.out.printf("El saldo es: %.2f€\n", c.getSaldo());
	}
	
	public double calcularGanado() {
		double suma=0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof CuentaEmpresa) {
				suma+=((CuentaEmpresa) lista[i]).getComision();
			}
		}
		return suma;
	}
	
	public double calcularGastado() {
		double suma=0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof CuentaJoven) {
				suma+=((CuentaJoven) lista[i]).getBonificacion();
			}
		}
		return suma;
	}
}
