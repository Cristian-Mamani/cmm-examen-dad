package com.cmm.cmmmsmatriculas.Service;

import com.cmm.cmmmsmatriculas.Dtos.MatriculaDto;
import com.cmm.cmmmsmatriculas.Models.Matricula;

import java.util.List;

public interface MatriculaService {
    Matricula save(Matricula matricula);
    Matricula update(Long id, Matricula matricula);
    void delete(Long id);
    MatriculaDto findById(Long id);
    List<Matricula> findAll();
}