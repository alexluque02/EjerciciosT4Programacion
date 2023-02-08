package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		int menu, id;
		double cant, tope;
		Cuenta [] lista= new Cuenta[4];
		Oficina o1;
		
		lista[0]=new CuentaCorriente(2000.0, 1, 200.0, 0);
		lista[1]=new CuentaJoven(1000, 2, 0);
		lista[2]=new CuentaEmpresa(200000, 3, 0);
		lista[3]=new CuentaJoven(34, 3, 0);
		
		o1=new Oficina(lista);
		
		System.out.println("Bienvenido al programa del banco");
		
		do {
			System.out.println("1. Ingresar\n"
					+ "2. Retirar\n"
					+ "3. Ver Saldo\n"
					+ "4. Ver Saldo Total\n"
					+ "5. Ver Total Gastado\n"
					+ "6. Ver Total Ganado\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			
			switch(menu) {
			case 1:
				System.out.println("Diga el id de cuenta");
				id=Leer.datoInt();
				System.out.println("Indica la cantidad");
				cant=Leer.datoDouble();
				o1.ingresarCuenta(o1.findById(id), cant);
				break;
			case 2:
				System.out.println("Diga el id de cuenta");
				id=Leer.datoInt();
				System.out.println("Indica la cantidad");
				cant=Leer.datoDouble();
				o1.retirarCuenta(o1.findById(id), cant);
				break;
			case 3:
				System.out.println("Diga el id");
				id=Leer.datoInt();
				o1.mostrarSaldo(o1.findById(id));
				break;
			case 4:
				System.out.printf("El total de saldos es: %.2f€\n", o1.calcularSaldoTotal());
				break;
			case 5:
				System.out.printf("Se ha gastado un total de: %.2f€\n", o1.calcularGastado());
				break;
			case 6:
				System.out.printf("Se ha ganado un total de: %.2f€\n", o1.calcularGanado());
				break;
			case 7:
				System.out.println("Diga usted el tope");
				tope=Leer.datoDouble();
				for (int i = 0; i < lista.length; i++) {
					System.out.println(o1.buscarSaldoMayorQue(tope)[i]);
				}
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				break;
			}
		}while(menu!=0);
		
		System.out.println("Muchas gracias por utilizar nuestro programa");

	}

}
