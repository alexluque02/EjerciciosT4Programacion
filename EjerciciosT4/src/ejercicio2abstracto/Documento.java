package ejercicio2abstracto;

public abstract class Documento {

	private String nombreEmpresa;
	private String calle;
	private int numero;
	
	public Documento(String nombreEmpresa, String calle, int numero) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.calle = calle;
		this.numero = numero;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", calle=" + calle + ", numero=" + numero + "]";
	}

	public abstract void imprimirDocumento();
	
}
