/**
 * Copyright (c) 2019 TechandSolve
 * <br><A HREF="http://www.techandsolve.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.techandsolve.servicio;

import java.util.List;

/**
 * Clase que se encarga de administrar los viajes de la mudanza
 *
 * @version
 * @author juanpbeltran <br>
 *         <b>Fecha de desarrollo : </b> 13/09/2019 <br>
 *         <b>Fecha de modificación : </b> 00/00/0000
 */
public class ProcesarElementoPivote {

	/**
	 * Metodo que se encarga de eliminar un elemento pivote de la lista
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 13/09/2019 <br>
	 *         <b>Fecha de modificación : </b> 00/00/0000
	 * 
	 * @param elementos objeto de tipo List<Integer>
	 * @param pivote objeto de tipo int
	 * 
	 */
	public static void eliminarElementoPivote(List<Integer> elementos, int pivote) {
		elementos.remove((Object) pivote);
	}
}
