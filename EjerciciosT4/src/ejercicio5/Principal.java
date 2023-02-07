package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Empleado[]lista=new Empleado[4];
		Oficina o1;
		int menu, num, objetivo;
		Empleado e;
		
		lista[0]=new Vendedor("Alex", "Luque", 800, 1, 25, 5);
		lista[1]=new Gerente("Pablo", "López", 1500, 2, 25);
		lista[2]=new Empleado("Daniel", "Luque", 1000, 3);
		lista[3]=new Vendedor("David", "Serrano", 800, 4, 19, 6);
		o1=new Oficina(lista);
		
		System.out.println("Bienvenido al programa");
		
		do {
			System.out.println("Pulse: \n"
					+ "1. Ver sueldo de un empleado\n"
					+ "2. Ver Total Gastado\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			
			switch(menu) {
			case 1:
				System.out.println("Diga el número de empleado");
				num=Leer.datoInt();
				if(o1.findEmpleado(num) instanceof Vendedor) {
					System.out.println("Diga objetivo");
					objetivo=Leer.datoInt();
					o1.comprobarObjetivo(o1.findEmpleado(num), objetivo);
				}
				System.out.println(o1.calcularSueldoUnEmpleado(o1.findEmpleado(num)));
				break;
			case 2:
				System.out.println(o1.calcularGastado());
				break;
			case 0: 
				break;
			default:
				break;
			}
		}while(menu!=0);
	}

}