/**
 * Copyright (c) 2019 TechandSolve
 * <br><A HREF="http://www.techandsolve.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.techandsolve.servicio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import co.com.techandsolve.modelo.AuditoriaTransacciones;
import co.com.techandsolve.servicio.ServicioAuditoriaTransacciones;
import co.com.techandsolve.servicio.ProcesarArhivoMudanza;

/**
 * Clase que se encarga de proveer el servicio rest
 * para procesar los datos del archivo de mudanzas
 *
 * @version
 * @author juanpbeltran <br>
 *         <b>Fecha de desarrollo : </b> 13/09/2019 <br>
 *         <b>Fecha de modificación : </b> 13/09/2019
 */

@RestController
@RequestMapping("v1")
public class ProcesarArchivoController {

	private final Logger LOOGER = LoggerFactory.getLogger(ProcesarArchivoController.class);

	@Autowired
	ServicioAuditoriaTransacciones servicioAuditoriaTransacciones;

	/**
	 * Metodo que se encarga de gestionar el archivo y la cedula del ejecutor
	 * para procesar los datos de la mundanza
	 * 
	 * @author juanpbeltran <br>
	 *         <b>Fecha de desarrollo : </b> 15/09/2019 <br>
	 *         <b>Fecha de modificación : </b> 00/00/0000
	 * 
	 * @param file objeto de tipo MultipartFile
	 * @param id objeto de tipo int
	 * 
	 */	
	@PostMapping("/files/upload/{id}")
	@ResponseBody
	public void procesarArchivo(@RequestParam("file") MultipartFile file, @PathVariable("id") int id) {
		System.out.println("Numero id:" + id);
		try {
			// Se obtiene el archivo
			byte[] bytes = file.getBytes();
			Path path = Paths.get(file.getOriginalFilename());
			Files.write(path, bytes);

			ProcesarArhivoMudanza p = new ProcesarArhivoMudanza();
			File fichero = new File(file.getOriginalFilename());
			p.procesarArchivo(fichero);

			AuditoriaTransacciones auditoria = new AuditoriaTransacciones();
			auditoria.setNumeroCedulaEjecutor(id);
			auditoria.setFechaEjecucion(LocalDate.now().toString());
			servicioAuditoriaTransacciones.guardarCliente(auditoria);

		} catch (IOException e) {
			LOOGER.error("Error Metodo procesarArchivo: " + e.getMessage());
		}
	}

}
