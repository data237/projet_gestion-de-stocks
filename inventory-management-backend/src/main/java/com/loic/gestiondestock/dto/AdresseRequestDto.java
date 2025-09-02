package com.loic.gestiondestock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdresseRequestDto {
    private String adresse1;
    private String adresse2;
    private String ville;
    private String codePostal;
    private String pays;

    public static com.loic.gestiondestock.model.Adresse toEntity(AdresseRequestDto dto) {
        if (dto == null) return null;
        com.loic.gestiondestock.model.Adresse adresse = new com.loic.gestiondestock.model.Adresse();
        adresse.setAdresse1(dto.getAdresse1());
        adresse.setAdresse2(dto.getAdresse2());
        adresse.setVille(dto.getVille());
        adresse.setCodePostal(dto.getCodePostal());
        adresse.setPays(dto.getPays());
        return adresse;
    }
} 