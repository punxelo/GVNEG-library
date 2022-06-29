package es.gvneg;

import java.time.LocalDate;

public abstract class Movimiento {
	
	private String concepto;
	float importe;
	private LocalDate fecha;
	
	public String getConcepto() {
		return concepto;
	}
	
	public float getImporte() {
		return importe;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	public void setImporte(float importe) {
		this.importe = importe;
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public Movimiento() {
		super();
	}
	
	public Movimiento(String concepto, float importe, LocalDate fecha) {
		this.concepto = concepto;
		this.importe = importe;
		this.fecha = fecha;
	}
}
