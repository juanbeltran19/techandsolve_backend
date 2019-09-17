/**
 * Copyright (c) 2019 TechandSolve
 * <br><A HREF="http://www.techandsolve.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.techandsolve.servicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que se encarga de procesar el archivo de viajes de la mudanza
 *
 * @version
 * @author juanpbeltran <br>
 *         <b>Fecha de desarrollo : </b> 13/09/2019 <br>
 *         <b>Fecha de modificación : </b> 00/00/0000
 */

public class ProcesarArhivoMudanza {

	/**
	 * Metodo que se encarga de leer y asignar los elementos para calcular 
	 * los viaje de la mudanza
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 13/09/2019 <br>
	 *         <b>Fecha de modificación : </b> 00/00/0000
	 * 
	 * @param file objeto de tipo File
	 * 
	 */
	public void procesarArchivo(File file) {

		FileReader fileR = null;
		BufferedReader file2 = null;

		try {
			fileR = new FileReader(file);
			file2 = new BufferedReader(fileR);


			List<Integer> lista = new ArrayList<Integer>();
			String lines = "";
			while ((lines = file2.readLine()) != null) {
				lista.add(Integer.parseInt(lines));
			}
			ProcesarMudanza mc = new ProcesarMudanza();
			mc.procesarDiasDeTrabajo(lista);
		} catch (IOException e) {
			System.out.println("No se encontro el archivo " + file.getName());
		}
	}

}
