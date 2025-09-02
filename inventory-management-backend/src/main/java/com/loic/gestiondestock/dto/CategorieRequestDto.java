package com.loic.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategorieRequestDto {
    private String code;
    private String designation;
    private Integer entrepriseId;

    // Méthode utilitaire pour convertir en entité
    public static com.loic.gestiondestock.model.Categorie toEntity(CategorieRequestDto dto) {
        if (dto == null) return null;
        com.loic.gestiondestock.model.Categorie categorie = new com.loic.gestiondestock.model.Categorie();
        categorie.setCode(dto.getCode());
        categorie.setDesignation(dto.getDesignation());
        categorie.setEntrepriseId(dto.getEntrepriseId());
        return categorie;
    }
} 