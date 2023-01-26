package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		Ordenador o=new Ordenador(256, 17, 300, "HP");
		Portatil p=new Portatil(256, 17, 600, "Lenovo", 200);
		Sobremesa s=new Sobremesa(256, 17, 340, "Intel", 350);
		double porcGanancia;
		
		System.out.println("Diga el porcentaje de ganancia");
		porcGanancia=Leer.datoDouble();
		
		System.out.println(o.calcularPvp(porcGanancia));
		System.out.println(p.calcularPvp(porcGanancia));
		System.out.println(s.calcularPvp(porcGanancia));
	}

}
