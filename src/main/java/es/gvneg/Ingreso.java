package es.gvneg;

public class Ingreso extends Movimiento {

	private Estado estado;
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Ingreso() {
		super();
	}

	public Ingreso(Estado estado) {
		super();
		this.estado = estado;
	}
}
