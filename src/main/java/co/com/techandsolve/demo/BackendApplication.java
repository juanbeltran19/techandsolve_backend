/**
 * Copyright (c) 2019 TechandSolve
 * <br><A HREF="http://www.techandsolve.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.techandsolve.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Clase que se encarga de iniciar la aplicación
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 12/09/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */

@SpringBootApplication
@EnableTransactionManagement
@EnableJpaRepositories("co.com.techandsolve.repositorio")
@EntityScan("co.com.techandsolve.modelo")
@ComponentScan(basePackages = "co.com.techandsolve") 
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
