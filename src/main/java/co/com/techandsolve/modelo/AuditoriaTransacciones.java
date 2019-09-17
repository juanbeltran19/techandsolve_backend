/**
 * Copyright (c) 2019 TechandSolve
 * <br><A HREF="http://www.techandsolve.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.techandsolve.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Clase modelo que se encarga de persistir la informacion de la trazabilidad 
 * de cada ejecucion por el ejecutor de la aplicacion
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 16/09/2019
 * <br><b>Fecha de modificación : </b> 16/09/2019
 */

@Entity
public class AuditoriaTransacciones {
	
	@Id
	@Column(name="nmidentificacion")
	private int numeroCedulaEjecutor;
	
	@Column(name="feEjecucion")
	private String fechaEjecucion;	
	
	public AuditoriaTransacciones() {}
	
	public int getNumeroCedulaEjecutor() {
		return numeroCedulaEjecutor;
	}
	/**
	 * @param numeroCedulaEjecutor the numeroCedulaEjecutor to set
	 */
	public void setNumeroCedulaEjecutor(int numeroCedulaEjecutor) {
		this.numeroCedulaEjecutor = numeroCedulaEjecutor;
	}

	public String getFechaEjecucion() {
		return fechaEjecucion;
	}
	/**
	 * @param fechaEjecucion the fechaEjecucion to set
	 */
	public void setFechaEjecucion(String fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}	

}
