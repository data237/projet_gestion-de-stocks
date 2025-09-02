package com.loic.gestiondestock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommandeFournisseurRequestDto {
    private String code;
    private String dateCommande;
    private Integer entrepriseId;
    private Integer fournisseurId;

    public static com.loic.gestiondestock.model.CommandeFournisseur toEntity(CommandeFournisseurRequestDto dto) {
        if (dto == null) return null;
        return com.loic.gestiondestock.model.CommandeFournisseur.builder()
                .code(dto.getCode())
                .dateCommande(dto.getDateCommande() != null ? Instant.parse(dto.getDateCommande()) : null)
                .entreprise_id(dto.getEntrepriseId())
                .build();
    }
} 