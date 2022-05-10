package es.gvneg;

import java.time.LocalDateTime;

public abstract class Movimiento {
	
	private String concepto;
	private float importe;
	private LocalDateTime fechaDateTime;
	
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
	
	public LocalDateTime getFechaDateTime() {
		return fechaDateTime;
	}
	
	public void setFechaDateTime(LocalDateTime fechaDateTime) {
		this.fechaDateTime = fechaDateTime;
	}
	
	public Movimiento() {
		super();
	}
	
	public Movimiento(String concepto, float importe, LocalDateTime fechaDateTime) {
		super();
		this.concepto = concepto;
		this.importe = importe;
		this.fechaDateTime = fechaDateTime;
	}
}
