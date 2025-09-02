package com.loic.gestiondestock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequestDto {
    private String nom;
    private String prenom;
    private AdresseRequestDto adresse;
    private String photo;
    private String email;
    private String numTel;
    private Integer entrepriseId;

    // Méthode utilitaire pour convertir en entité
    public static com.loic.gestiondestock.model.Client toEntity(ClientRequestDto dto) {
        if (dto == null) return null;
        com.loic.gestiondestock.model.Client client = new com.loic.gestiondestock.model.Client();
        client.setNom(dto.getNom());
        client.setPrenom(dto.getPrenom());
        client.setPhoto(dto.getPhoto());
        client.setEmail(dto.getEmail());
        client.setNumTel(dto.getNumTel());
        client.setAdresse(dto.getAdresse() != null ? AdresseRequestDto.toEntity(dto.getAdresse()) : null);
        // L'entreprise sera associée dans le service à partir de l'id
        return client;
    }
} 