package ejercicio2abstracto;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		String fecha;
		int menu;
		TarjetaDeVisita tv=new TarjetaDeVisita("Adidas", "Wall St.", 54, "Alex", 664845326);
		Carta c;
		
		System.out.println("Bienvenido al programa");
		
		do {
			System.out.println("Elija el membrete que desea realizar");
			System.out.println("1. Carta\n"
					+ "2. Tarjeta de visita\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			
			switch(menu) {
			case 1:
				System.out.println("Diga la fecha en la que se ha realizado el documento");
				fecha=Leer.dato();
				
				c=new Carta("Aquarel", "Calle Fontana", 31, "Rubén", fecha);
				c.imprimirDocumento();
				break;
			case 2:
				tv.imprimirDocumento();
				break;
			case 0:
				break;
			default:
				break;
			}
		}while(menu!=0);
		
		System.out.println("Gracias por utilizar el programa");
	}

}
