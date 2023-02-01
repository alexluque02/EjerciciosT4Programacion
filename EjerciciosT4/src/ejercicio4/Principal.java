package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int numDias, porc;
		LineaDeVenta[] lista;
		Venta v;
		int menu, menu2, codigo, i = 0, cantidad, tam;
		String nombre;
		double precio;
		System.out.println("Bienvenido al programa");
		System.out.println("Diga cuántos productos va a guardar");
		tam = Leer.datoInt();
		lista = new LineaDeVenta[tam];
		v = new Venta(lista);

		do {
			System.out.println("1. Añadir Producto\n" + "2. Mostrar lista\n" + "3. Imprimir Ticket\n" + "0. Salir");
			menu = Leer.datoInt();

			switch (menu) {
			case 1:
				System.out.println("Diga el código del producto");
				codigo = Leer.datoInt();
				System.out.println("Diga el nombre del producto");
				nombre = Leer.dato();
				System.out.println("Indique el precio");
				precio = Leer.datoDouble();
				System.out.println("Indique la cantidad");
				cantidad = Leer.datoInt();
				System.out.println("Pulse:\n" + "1. Para listar un producto de Alimentación\n"
						+ "2. Para listar un prodcuto de Electrónica\n" + "3. Para listar un producto de Ropa\n"
						+ "**********************************************");
				menu2 = Leer.datoInt();
				switch (menu2) {
				case 1:
					lista[i] = new LineaDeVenta(new Alimentacion(codigo, nombre, precio), cantidad);
					System.out.println("Cuantos días falta para que caduque");
					numDias = Leer.datoInt();
					lista[i].getP().calcularPrecio(numDias);
					lista[i].getP().setPrecio(lista[i].getP().calcularPrecio(numDias));
					i++;
					break;
				case 2:
					lista[i] = new LineaDeVenta(new Electronica(codigo, nombre, precio), cantidad);
					System.out.println("Diga el impuesto sobre lujo del producto");
					porc = Leer.datoInt();
					lista[i].getP().calcularPrecio(porc);
					lista[i].getP().setPrecio(lista[i].getP().calcularPrecio(porc));
					i++;
					break;
				case 3:
					lista[i] = new LineaDeVenta(new Ropa(codigo, nombre, precio), cantidad);
					i++;
					break;
				case 0:
					break;
				default:
					break;
				}
				break;
			case 2:
				v.mostrarLista();
				break;
			case 3:
				v.imprimirTicket();
				break;
			}
		} while (menu != 0);
	}

}
