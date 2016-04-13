package negocio;

import java.io.Serializable;

public class Jugador implements Serializable{
	private static final long serialVersionUID = 1L;
	private long id;
	private String nickname;
	private String email;
	private String password;
	private Categoria categoria;
	private long puntos;
	private float promedio;
	
	public Jugador(int id, String nickname, String email, String password, Categoria categoria, long puntos, float promedio) {
		this.id = id;
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		this.categoria = categoria;
		this.puntos = puntos;
		this.promedio = promedio;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public long getPuntos() {
		return puntos;
	}
	public void setPuntos(long puntos) {
		this.puntos = puntos;
	}
	public float getPromedio() {
		return promedio;
	}
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
