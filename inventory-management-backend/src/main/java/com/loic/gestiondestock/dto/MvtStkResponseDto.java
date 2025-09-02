package com.loic.gestiondestock.dto;

import com.loic.gestiondestock.model.TypeMvtStk;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MvtStkResponseDto {
    private Integer id;
    private Instant dateMvt;
    private BigDecimal quantite;
    private TypeMvtStk typeMvt;
    private ArticleResponseDto article;

    // Méthode utilitaire pour convertir une entité en DTO
    public static MvtStkResponseDto fromEntity(com.loic.gestiondestock.model.MvtStk mvtStk) {
        if (mvtStk == null) return null;
        return MvtStkResponseDto.builder()
                .id(mvtStk.getId())
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .typeMvt(mvtStk.getTypeMvt())
                .article(mvtStk.getArticle() != null ? ArticleResponseDto.fromEntity(mvtStk.getArticle()) : null)
                .build();
    }
}