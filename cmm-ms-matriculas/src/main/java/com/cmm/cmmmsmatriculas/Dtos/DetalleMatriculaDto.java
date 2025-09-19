package com.cmm.cmmmsmatriculas.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class DetalleMatriculaDto {
    private Long idMatricula;
    private Long id;
    private Long idDetalleMatricula;
    private CursoDto curso;
}
