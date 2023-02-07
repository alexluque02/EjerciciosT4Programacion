package ejercicio5;

import java.util.Arrays;

public class Oficina {

	Empleado [] lista;

	public Oficina(Empleado[] lista) {
		super();
		this.lista = lista;
	}

	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}
	
	public double calcularSueldoUnEmpleado(Empleado e) {
		return e.calcularSueldo();
	}
	
	public double calcularGastado() {
		double suma=0;
		for (int i = 0; i < lista.length; i++) {
			suma+=calcularSueldoUnEmpleado(lista[i]);
		}
		return suma;
	}
	
	public Empleado findEmpleado(int nEmpleado) {
		int i=0;
		boolean encontrado=false;
		
		while(i<lista.length && !encontrado && lista[i]!=null) {
			if(lista[i].getNumEmpleado()==nEmpleado) {
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
	
	public void comprobarObjetivo(Empleado e, int objetivo) {
		if (e instanceof Vendedor) {
			((Vendedor) e).felicitar(objetivo);
		}
	}
	
	
}