package ejercicio2;

public class TarjetaDeVisita extends Documento{

	private String nombreContacto;
	private int numContacto;
	
	public TarjetaDeVisita(String nombreEmpresa, String calle, int numero, String nombreContacto, int numContacto) {
		super(nombreEmpresa, calle, numero);
		this.nombreContacto = nombreContacto;
		this.numContacto = numContacto;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}

	public int getNumContacto() {
		return numContacto;
	}

	public void setNumContacto(int numContacto) {
		this.numContacto = numContacto;
	}

	@Override
	public String toString() {
		return super.toString()+"TarjetaDeVisita [nombreContacto=" + nombreContacto + ", numContacto=" + numContacto + "]";
	}
	
	public void imprimirDocumento() {
		super.imprimirDocumento();
		System.out.println("Nombre de contacto: "+nombreContacto+"\n"
				+ "Número de contacto: "+numContacto);
	}
}
