package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int menu, cantidadFija, potencia, cilindrada;
		Vehiculo v=new Vehiculo(200, 120, "tipo b", 0);
		Motocicleta m;
		Coche c;
		Furgoneta f;

		System.out.println("Bienvenido al programa");
		do {
			System.out.println("1. Vehículo\n"
					+ "2. Motocicleta\n"
					+ "3. Coche\n"
					+ "4. Furgoneta\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			
			switch(menu) {
			case 1:
				System.out.println(v.calcularImpuesto());
				break;
			case 2:
				System.out.println("Diga la cilindrada de la moto");
				cilindrada=Leer.datoInt();
				m=new Motocicleta(cilindrada, 30, "tipo a", 0);
				System.out.println(m.calcularImpuesto());
				break;
			case 3:
				System.out.println("Diga la potencia del coche en cv");
				potencia=Leer.datoInt();
				c=new Coche(170, potencia, "tipo b", 0);
				System.out.println(c.calcularImpuesto());
				break;
			case 4:
				System.out.println("Diga el impuesto fijo");
				cantidadFija=Leer.datoInt();
				f=new Furgoneta(200, 120, "ECO", 0, cantidadFija);
				System.out.println(f.calcularImpuesto());
				break;
			case 0:
				break;
			default:
				break;
			}
		}while(menu!=0);
	}

}
