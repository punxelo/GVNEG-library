package es.gvneg;

public class GastoImpl extends Movimiento {
	
	private String usuario;

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public GastoImpl() {
		super();
	}

	public GastoImpl(String usuario) {
		super();
		this.usuario = usuario;
	}
}
