/**
 * Copyright (c) 2019 TechandSolve
 * <br><A HREF="http://www.techandsolve.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.techandsolve.servicio;

import java.util.Collections;
import java.util.List;

/**
 * Clase que se encarga de administrar los viajes de la mudanza
 *
 * @version
 * @author juanpbeltran <br>
 *         <b>Fecha de desarrollo : </b> 14/09/2019 <br>
 *         <b>Fecha de modificación : </b> 00/00/0000
 */
public class ProcesarViajeMudanza {

	/**
	 * Metodo que se encarga de calcular los viajes de la mudanza
	 * 	 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 14/09/2019 <br>
	 *         <b>Fecha de modificación : </b> 00/00/0000
	 * 
	 * @param elementos objeto de tipo List<Integer>
	 * 
	 */
	public int calcularViajes(List<Integer> elementos) {

		int pivote = Collections.max(elementos).intValue();
		int peso = 0;
		int numeroElementos = 1;
		int viajes = 0;

		ProcesarElementoPivote.eliminarElementoPivote(elementos, pivote);

		if (validarElementoPesoPivote(peso, pivote, elementos, numeroElementos)) {
			return 0;
		}

		return resultadoViajesMudanza(viajes, elementos);
	}

	/**
	 * Metodo que se encarga de validar el peso de cada elemento 
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 14/09/2019 <br>
	 *         <b>Fecha de modificación : </b> 00/00/0000
	 * 
	 * @param peso objeto de tipo int 
	 * @param pivote objeto de tipo int
	 * @param elementos objeto de tipo List<Integer>
	 * @param numeroElementos objeto de tipo int
	 * 
	 */
	private boolean validarElementoPesoPivote(int peso, int pivote, List<Integer> elementos, int numeroElementos) {
		while (peso < 50 && pivote < 50) {
			if (elementos.size() == 0) {
				return true;
			}
			int masBajo = Collections.min(elementos);
			ProcesarElementoPivote.eliminarElementoPivote(elementos, masBajo);
			numeroElementos = numeroElementos + 1;
			peso = pivote * numeroElementos;
		}
		return false;
	}

	/**
	 * Metodo que se encarga de acumular 
	 * los viajes de la mudanza
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 14/09/2019 <br>
	 *         <b>Fecha de modificación : </b> 00/00/0000
	 * 
	 * @param viajes objeto de tipo int 
	 * @param elementos objeto de tipo List<Integer> 
	 * 
	 */
	private int resultadoViajesMudanza(int viajes, List<Integer> elementos) {
		viajes = viajes + 1;
		if (elementos.size() > 0)
			viajes = viajes + calcularViajes(elementos);

		return viajes;
	}
}
