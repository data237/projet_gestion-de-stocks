package com.loic.gestiondestock.service;

import com.loic.gestiondestock.dto.ArticleRequestDto;
import com.loic.gestiondestock.dto.ArticleResponseDto;

import java.util.List;

public interface ArticleService {

    ArticleResponseDto save(ArticleRequestDto articleDto);

    ArticleResponseDto findById(Integer id);

    ArticleResponseDto findByCodeArticle(String codeArticle);

    List<ArticleResponseDto> findAll();

    void delete(Integer id);

    ArticleResponseDto update(Integer id, ArticleRequestDto articleDto);

}
