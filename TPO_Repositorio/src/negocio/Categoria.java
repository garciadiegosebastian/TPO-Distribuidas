package negocio;

import java.io.Serializable;

public class Categoria implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String nombre;
	private long puntosMinimo;
	private long promedioMinimo;
	private long partidosMinimo;
	
	public Categoria(long id, String nombre, long puntosMinimo, long promedioMinimo, long partidosMinimo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puntosMinimo = puntosMinimo;
		this.promedioMinimo = promedioMinimo;
		this.partidosMinimo = partidosMinimo;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getPuntosMinimo() {
		return puntosMinimo;
	}
	public void setPuntosMinimo(long puntosMinimo) {
		this.puntosMinimo = puntosMinimo;
	}
	public long getPromedioMinimo() {
		return promedioMinimo;
	}
	public void setPromedioMinimo(long promedioMinimo) {
		this.promedioMinimo = promedioMinimo;
	}
	public long getPartidosMinimo() {
		return partidosMinimo;
	}
	public void setPartidosMinimo(long partidosMinimo) {
		this.partidosMinimo = partidosMinimo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
