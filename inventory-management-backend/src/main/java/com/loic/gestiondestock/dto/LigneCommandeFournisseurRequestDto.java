package com.loic.gestiondestock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LigneCommandeFournisseurRequestDto {
    private Integer articleId;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    private Integer entrepriseId;

    // Méthode utilitaire pour convertir en entité
    public static com.loic.gestiondestock.model.LigneCommandeFournisseur toEntity(LigneCommandeFournisseurRequestDto dto) {
        if (dto == null) return null;
        com.loic.gestiondestock.model.LigneCommandeFournisseur ligne = new com.loic.gestiondestock.model.LigneCommandeFournisseur();
        ligne.setQuantite(dto.getQuantite());
        ligne.setPrixUnitaire(dto.getPrixUnitaire());
        ligne.setEntreprise_id(dto.getEntrepriseId());
        // L'association de l'article se fait dans le service à partir de l'id
        return ligne;
    }
} 