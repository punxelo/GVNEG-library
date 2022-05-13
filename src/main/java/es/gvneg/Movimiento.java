package es.gvneg;

import java.time.LocalDateTime;

public abstract class Movimiento {
	
	private String concepto;
	private float importe;
	private LocalDateTime fecha;
	
	public String getConcepto() {
		return concepto;
	}
	
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	
	public float getImporte() {
		return importe;
	}
	
	public void setImporte(float importe) {
		this.importe = importe;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	
	public void setFechaDateTime(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	public Movimiento() {
		super();
	}
	
	public Movimiento(String concepto, float importe, LocalDateTime fecha) {
		this.concepto = concepto;
		this.importe = importe;
		this.fecha = fecha;
	}
}
