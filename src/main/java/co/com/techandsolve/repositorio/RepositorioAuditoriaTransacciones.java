/**
 * Copyright (c) 2019 TechandSolve
 * <br><A HREF="http://www.techandsolve.com>"</br>
 * Todos los derechos reservados.
 */
package co.com.techandsolve.repositorio;


import co.com.techandsolve.modelo.AuditoriaTransacciones;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * interface que implementa el registro de la traza de ejecucion
 *
 * @version
 * @author juanpbeltran
 * <br><b>Fecha de desarrollo : </b> 16/09/2019
 * <br><b>Fecha de modificación : </b> 00/00/0000
 */
@SuppressWarnings("rawtypes")
@Repository
public interface RepositorioAuditoriaTransacciones extends JpaRepository<AuditoriaTransacciones, Integer> {
}
