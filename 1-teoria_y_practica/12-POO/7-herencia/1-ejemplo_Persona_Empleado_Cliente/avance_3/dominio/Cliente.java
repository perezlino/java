package directorio;

import java.util.Date;

public class Cliente extends Persona{

	private int idCliente;
	private Date fechaRegistro;
	private boolean vip;
	private static int contadorCliente;
	
	// Constructor con argumentos de la Clase Padre y argumentos de la Clase 'Cliente'
	public Cliente(Date fechaRegistro, boolean vip, String nombre,
					char genero, int edad, String direccion) {
		super(nombre, genero, edad, direccion); // manda a llamar al constructor de la Clase padre
		                                        // Siempre debe ser la primera linea
		this.idCliente = ++Cliente.contadorCliente;
		this.fechaRegistro = fechaRegistro;
		this.vip = vip;
	}

	public int getIdCliente(){
		return this.idCliente;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public boolean isVip() {
		return this.vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cliente [idCliente=").append(idCliente);
		sb.append(", fechaRegistro=").append(fechaRegistro);
		sb.append(", vip=").append(vip);
		sb.append(", Persona={").append(super.toString());
		sb.append("}");
		sb.append("]");
		return sb.toString();
	}	
}