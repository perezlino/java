package com.gm.mundopc;

public class Monitor{

	private int idMonitor;
	private String marca;
	private double tamanio;
	private static int contadorMonitores;
	
	private Monitor() {
		idMonitor = ++contadorMonitores;
	}
		
	public Monitor(String marca, double tamanio) {
		this();
		this.marca=marca;
		this.tamanio=tamanio;
	}

	public int getIdMonitor() {
		return this.idMonitor;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamanio() {
		return this.tamanio;
	}

	public void setTamano(double tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public String toString() {
		return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + "]";
	}	
}