package com.gm.mundopc;

public class Computador {

	private int idComputador;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputador;
	
	
	private Computador() {
		this.idComputador=++contadorComputador;
	}
	
	public Computador(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre = nombre;
		this.monitor = monitor;
		this.teclado = teclado;
		this.raton = raton;
	}
	
	public int getIdComputador() {
		return this.idComputador;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monitor getMonitor() {
		return this.monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Raton getRaton() {
		return this.raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	@Override
	public String toString() {
		return "Computador [idComputador=" + idComputador + ", nombre=" + nombre + ", monitor=" + monitor
				+ ", teclado=" + teclado + ", raton=" + raton + "]";
	}
}