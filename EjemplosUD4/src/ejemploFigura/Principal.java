package ejemploFigura;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		Rectangulo r;
		Triangulo t;
		int menu;
		double lado1, lado2, base, altura;
		
		do {
			System.out.println("1. Calcular Área Rectángulo\n"
					+ "2. Calcular Área Triángulo\n"
					+ "0. Salir");
			menu=Leer.datoInt();
			
			switch(menu) {
			case 1:
				System.out.println("Diga cuánto mide un lado");
				lado1=Leer.datoDouble();
				System.out.println("Diga cuánto mide el otro lado");
				lado2=Leer.datoDouble();
				r=new Rectangulo(1, 1, lado1, lado2);
				System.out.println("El área es: "+r.calcularArea());
				break;
			case 2:
				System.out.println("Diga la base");
				base=Leer.datoDouble();
				System.out.println("Diga la altura");
				altura=Leer.datoDouble();
				t=new Triangulo(1, 1, base, altura);
				System.out.println("El área es: "+t.calcularArea());
				break;
			default:
				break;
			case 0: 
				break;
			}
		}while(menu!=0);
		

	}

}
