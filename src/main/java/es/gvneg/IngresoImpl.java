package es.gvneg;

public class IngresoImpl extends Movimiento {

	private Estado estado;
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public IngresoImpl() {
		super();
	}

	public IngresoImpl(Estado estado) {
		super();
		this.estado = estado;
	}
}
