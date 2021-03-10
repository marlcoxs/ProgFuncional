
public class Texto {
	String linea;
	
	

	public Texto(String linea) {
		super();
		this.linea = linea;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	@Override
	public String toString() {
		return "Texto [linea=" + linea + "]";
	}
	
	
	
	
}
