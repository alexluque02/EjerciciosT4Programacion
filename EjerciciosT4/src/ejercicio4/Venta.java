package ejercicio4;

import java.util.Arrays;

public class Venta {

	private LineaDeVenta [] lista;

	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}

	public LineaDeVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void mostrarLista() {
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			System.out.println(lista[i]);
		}
		if(lista[0]==null) {
			System.out.println("No hay productos guardados");
		}
	}
	
	public void imprimirTicket() {
		System.out.printf("********TODOMARKET********\n"
				+ "Fecha:12/01/50     ID:1234\n"
				+ "Dependiente: Alex\n"
				+ "**************************\n");
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			lista[i].mostrarProducto();
		}
		System.out.printf("**************************\n"
				+ "Precio Total:        %.2f€\n", calcularSumaTotal());
	}
	
	public double calcularSumaTotal() {
		double suma=0;
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			suma+=lista[i].calcularSumaPrecios();
		}
		return suma;
	}
}
