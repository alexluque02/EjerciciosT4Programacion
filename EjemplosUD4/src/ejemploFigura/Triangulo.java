package ejemploFigura;

public class Triangulo extends Figura{

	private double base;
	private double altura;
	
	public Triangulo(double x, double y, double base, double altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return super.toString()+"Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	public double calcularArea() {
		return base*altura/2;
	}
	
	
}
