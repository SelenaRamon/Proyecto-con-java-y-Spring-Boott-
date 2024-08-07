package org.esfe.servicios.implementaciones;

import org.esfe.modelos.Docente;
import org.esfe.repositorios.IDocenterepository;
import org.esfe.servicios.interfaces.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocenteService implements IDocenteService {

    @Autowired
    private IDocenterepository docenterepository;
    @Override
    public Page<Docente> buscarTodosPaginados(Pageable pageable) {
        return docenterepository.findAll(pageable);
    }

    @Override
    public List<Docente> obtenerTodos() {
        return docenterepository.findAll();
    }

    @Override
    public Optional<Docente> buscarPorId(Integer id) {
        return docenterepository.findById(id);
    }

    @Override
    public Docente crearOEditar(Docente docente) {
        return docenterepository.save(docente);
    }

    @Override
    public void eliminarPorld(Integer id) {
        docenterepository.deleteById(id);
    }
}
