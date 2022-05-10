package es.gvneg;

import java.util.List;

public class Cuenta {
	
	private String nombreCuenta;
	private List<Movimiento> movimientos;
	
	public String getNombreCuenta() {
		return nombreCuenta;
	}	
	
	public List<Movimiento> getMovimientos() {
		return movimientos;
	}
	
	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}
	
	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public Cuenta() {
		super();
	}

	public Cuenta(String nombreCuenta, List<Movimiento> movimientos) {
		super();
		this.nombreCuenta = nombreCuenta;
		this.movimientos = movimientos;
	}
}
