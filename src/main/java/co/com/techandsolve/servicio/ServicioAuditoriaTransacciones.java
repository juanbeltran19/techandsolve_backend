/**
 * Copyright (c) 2019 TechandSolve
 * <br><A HREF="http://www.techandsolve.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.techandsolve.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import co.com.techandsolve.modelo.AuditoriaTransacciones;
import co.com.techandsolve.repositorio.RepositorioAuditoriaTransacciones;

/**
 * Clase servicio que se encarga de guardar los datos de la traza de ejecucion
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 16/09/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */

@Service
@Component
@Configuration
@ComponentScan(value = "co.com.techandsolve")
public class ServicioAuditoriaTransacciones {
	
	@Autowired
	RepositorioAuditoriaTransacciones repositorioAuditoriaTransacciones;
	
	public ServicioAuditoriaTransacciones() {
	}
	/**
	 * Metodo que se encarga de guardar registros de la traza de ejecución
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 16/09/2019 <br>
	 *         <b>Fecha de modificación : </b>  00/00/0000
	 * 
	 * @param auditoriaTransacciones objeto de tipo AuditoriaTransacciones
	 * 
	 */
	public void guardarCliente(AuditoriaTransacciones auditoriaTransacciones) {
		repositorioAuditoriaTransacciones.save(auditoriaTransacciones);
	}	
}
