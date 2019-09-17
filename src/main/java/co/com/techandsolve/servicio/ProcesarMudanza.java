/**
 * Copyright (c) 2019 TechandSolve
 * <br><A HREF="http://www.techandsolve.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.techandsolve.servicio;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que se encarga de administrar los viajes de la mudanza
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 13/09/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */
public class ProcesarMudanza {
	
	/**
	 * Metodo que se encarga de procesar los dias de trabajo del viaje de
	 * la mudanza
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 13/09/2019 <br>
	 *         <b>Fecha de modificación : </b> 00/00/0000
	 * 
	 * @param resultado objeto de tipo StringBuilder
	 * 
	 */
	public void procesarDiasDeTrabajo(List<Integer> listadoInicial) {

		StringBuilder str = new StringBuilder();
		ProcesarViajeMudanza procesarViajeMudanza = null;
		List<Integer> listaPesoObjetosPorDia = null;
		int diaNumero = 0;
		int c;

		procesarViajeMudanza = new ProcesarViajeMudanza();
		for (int z = 1; z < listadoInicial.size(); z++) {
			diaNumero = diaNumero + 1;
			int numeroElementos = listadoInicial.get(z);

			listaPesoObjetosPorDia = new ArrayList<Integer>();

			for (c = z + 1; c <= (z + numeroElementos); c++) {
				listaPesoObjetosPorDia.add(listadoInicial.get(c));
			}

			String resultPorDia = "Case #" + diaNumero + ":"
					+ procesarViajeMudanza.calcularViajes(listaPesoObjetosPorDia);
			str.append(resultPorDia).append('\n');
			z = c - 1;
		}
		// Se guarda en archivo plano el resultado de la mudanza
		ResultadoArhivoMudanza.guardarResultadoMudanza(str);
	}
}
