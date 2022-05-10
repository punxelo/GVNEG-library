package es.gvneg;

public class Gasto extends Movimiento {
	
	private String usuario;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Gasto() {
		super();
	}

	public Gasto(String usuario) {
		super();
		this.usuario = usuario;
	}
}
