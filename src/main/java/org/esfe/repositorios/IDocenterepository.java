package org.esfe.repositorios;

import org.esfe.modelos.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocenterepository extends JpaRepository<Docente, Integer> {
}
