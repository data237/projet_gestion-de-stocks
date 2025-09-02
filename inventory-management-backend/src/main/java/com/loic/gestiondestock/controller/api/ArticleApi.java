// com/loic/gestiondestock/controller/api/ArticleApi.java
package com.loic.gestiondestock.controller.api;

import com.loic.gestiondestock.dto.ArticleRequestDto;
import com.loic.gestiondestock.dto.ArticleResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Encoding;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static com.loic.gestiondestock.utils.Constants.APP_ROOT;

@RequestMapping(APP_ROOT + "/articles") // Chemin de base global pour tous les endpoints d'article [1, 2]
public interface ArticleApi {

    @PostMapping(value = "/create", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ArticleResponseDto> save(
        @RequestParam("codeArticle") String codeArticle,
        @RequestParam("designation") String designation,
        @RequestParam("categorieId") Integer categorieId,
        @RequestParam("entrepriseId") Integer entrepriseId,
        @RequestParam("prixUnitaire") java.math.BigDecimal prixUnitaire,
        @RequestParam("tauxTva") java.math.BigDecimal tauxTva,
        @RequestParam("prixUnitaireTtc") java.math.BigDecimal prixUnitaireTtc,
        @RequestPart(value = "image", required = false) org.springframework.web.multipart.MultipartFile image
    );

    @GetMapping(value = "/id/{idArticle}", produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleResponseDto findById(@PathVariable("idArticle") Integer id);

    @GetMapping(value = "/code/{codeArticle}", produces = MediaType.APPLICATION_JSON_VALUE) // Chemin relatif
    ArticleResponseDto findByCodeArticle(@PathVariable("codeArticle") String codeArticle);

    @GetMapping(value = "/showAll", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticleResponseDto> findAll();

    @DeleteMapping(value = "/delete/{idArticle}")
    void delete(@PathVariable("idArticle") Integer id);

    @PutMapping(value = "/update/{idArticle}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ArticleResponseDto> update(
        @PathVariable("idArticle") Integer idArticle,
        @RequestParam("codeArticle") String codeArticle,
        @RequestParam("designation") String designation,
        @RequestParam("categorieId") Integer categorieId,
        @RequestParam("entrepriseId") Integer entrepriseId,
        @RequestParam("prixUnitaire") java.math.BigDecimal prixUnitaire,
        @RequestParam("tauxTva") java.math.BigDecimal tauxTva,
        @RequestParam("prixUnitaireTtc") java.math.BigDecimal prixUnitaireTtc,
        @RequestPart(value = "image", required = false) org.springframework.web.multipart.MultipartFile image
    );
}