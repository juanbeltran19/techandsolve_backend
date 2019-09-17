/**
 * Copyright (c) 2019 TechandSolve
 * <br><A HREF="http://www.techandsolve.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.techandsolve.servicio;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
/**
 * Clase que se encarga de registrar el resultado de viajes de la mudanza
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 16/09/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */
public class ResultadoArhivoMudanza {
	
	/**
	 * Metodo que se encarga de almacenar en archivo plano el resultado del viaje de
	 * la mudanza
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 16/09/2019 <br>
	 *         <b>Fecha de modificación : </b> 00/00/0000
	 * 
	 * @param resultado objeto de tipo StringBuilder
	 * 
	 */
	public static void guardarResultadoMudanza(StringBuilder resultado) {

		Path path = Paths.get("lazy_loading_example_output.txt");

		try (BufferedWriter br = Files.newBufferedWriter(path, Charset.defaultCharset(), StandardOpenOption.CREATE)) {
			br.write(resultado.toString());
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
