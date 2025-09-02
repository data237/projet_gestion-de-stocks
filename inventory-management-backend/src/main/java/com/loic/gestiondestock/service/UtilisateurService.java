package com.loic.gestiondestock.service;

import com.loic.gestiondestock.dto.UtilisateurRequestDto;
import com.loic.gestiondestock.dto.UtilisateurResponseDto;

import java.util.List;

public interface UtilisateurService {
    UtilisateurResponseDto save(UtilisateurRequestDto utilisateurDto);

    UtilisateurResponseDto findById(Integer id);

    UtilisateurResponseDto findByEmailUser(String email);

    List<UtilisateurResponseDto> findAll();

    void delete(Integer id);

    UtilisateurResponseDto update(Integer id, UtilisateurRequestDto utilisateurDto);
}
