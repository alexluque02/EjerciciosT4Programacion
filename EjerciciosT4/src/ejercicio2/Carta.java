package ejercicio2;

public class Carta extends Documento{

	private String nombre;
	private String fechaM;
	
	public Carta(String nombreEmpresa, String calle, int numero, String nombre, String fechaM) {
		super(nombreEmpresa, calle, numero);
		this.nombre = nombre;
		this.fechaM = fechaM;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaM() {
		return fechaM;
	}

	public void setFechaM(String fechaM) {
		this.fechaM = fechaM;
	}

	@Override
	public String toString() {
		return super.toString()+"Carta [nombre=" + nombre + ", fechaM=" + fechaM + "]";
	}
	
	public void imprimirDocumento() {
		super.imprimirDocumento();
		System.out.println("Nombre del remitente: "+nombre+"\n"
				+ "Fecha: "+fechaM);
	}
}
