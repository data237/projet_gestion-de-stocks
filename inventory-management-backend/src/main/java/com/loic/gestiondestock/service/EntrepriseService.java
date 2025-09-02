package com.loic.gestiondestock.service;

import com.loic.gestiondestock.dto.EntrepriseRequestDto;
import com.loic.gestiondestock.dto.EntrepriseResponseDto;

import java.util.List;

public interface EntrepriseService {

    EntrepriseResponseDto save(EntrepriseRequestDto entrepriseDto);

    EntrepriseResponseDto findById(Integer id);

    EntrepriseResponseDto findByNomEntreprise(String nom);

    List<EntrepriseResponseDto> findAll();

    void delete(Integer id);

    EntrepriseResponseDto update(Integer id, EntrepriseRequestDto entrepriseDto);
}
