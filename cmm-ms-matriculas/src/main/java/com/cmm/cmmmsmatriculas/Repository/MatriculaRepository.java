package com.cmm.cmmmsmatriculas.Repository;

import com.cmm.cmmmsmatriculas.Models.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}