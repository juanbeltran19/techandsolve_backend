package co.com.techandsolve.servicio;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class ProcesarArhivoMudanzaTest {

	@Test
	public void procesarArchivoNullTest() {

		// Arrange
		File fichero = new File("");
		ProcesarArhivoMudanza procesarArhivoMudanza = new ProcesarArhivoMudanza();
		boolean exito = true;
		try {
			// Act
			procesarArhivoMudanza.procesarArchivo(fichero);
		} catch (Exception ex) {
			exito = false;
		}
		// Assert
		Assert.assertTrue(exito);
	}	
	
	@Test
	public void procesarArchivoElementoCeroTest() {

		// Arrange
		File fichero = new File(
				"C:\\Users\\JP\\Downloads\\spring-tool-eclipse\\sts-4.3.2.RELEASE\\backend\\lazy_loading_example_input0.txt");
		ProcesarArhivoMudanza procesarArhivoMudanza = new ProcesarArhivoMudanza();
		boolean exito = true;
		try {
			// Act
			procesarArhivoMudanza.procesarArchivo(fichero);
		} catch (Exception ex) {
			exito = false;
		}
		// Assert
		Assert.assertFalse(exito);
	}		
	
	@Test
	public void procesarArchivoElementosCorrectoTest() {

		// Arrange
		File fichero = new File(
				"C:\\Users\\JP\\Downloads\\spring-tool-eclipse\\sts-4.3.2.RELEASE\\backend\\lazy_loading_example_input.txt");
		ProcesarArhivoMudanza procesarArhivoMudanza = new ProcesarArhivoMudanza();
		boolean exito = true;
		try {
			// Act
			procesarArhivoMudanza.procesarArchivo(fichero);
		} catch (Exception ex) {
			exito = false;
		}
		// Assert
		Assert.assertTrue(exito);
	}
		
}
