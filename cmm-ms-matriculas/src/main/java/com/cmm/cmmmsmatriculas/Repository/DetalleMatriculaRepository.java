package com.cmm.cmmmsmatriculas.Repository;

import com.cmm.cmmmsmatriculas.Models.DetalleMatricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DetalleMatriculaRepository extends JpaRepository<DetalleMatricula, Long> {
    List<DetalleMatricula> findByMatriculaIdMatricula(Long id);

}