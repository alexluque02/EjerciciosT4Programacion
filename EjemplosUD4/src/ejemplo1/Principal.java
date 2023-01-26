package ejemplo1;

public class Principal {

	public static void main(String[] args) {

		Trabajador trab=new Trabajador ("Alex", "Jefe");
		Empleado emp= new Empleado ("Nono", "Junior", 1200.0, 30.0);
		Consultor cons=new Consultor ("Ángel", "Marketing", 7, 50);
		int numHijos=3;
		
		
		System.out.println(trab.calcularPaga(numHijos));
		System.out.println(emp.calcularPaga(numHijos));
		System.out.println(cons.calcularPaga(numHijos));

	}

}
