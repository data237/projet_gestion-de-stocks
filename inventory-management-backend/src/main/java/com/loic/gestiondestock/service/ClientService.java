package com.loic.gestiondestock.service;

import com.loic.gestiondestock.dto.ClientRequestDto;
import com.loic.gestiondestock.dto.ClientResponseDto;

import java.util.List;

public interface ClientService {

    ClientResponseDto save(ClientRequestDto clientDto);

    ClientResponseDto findById(Integer id);

    ClientResponseDto findByNomClient(String nom);

    List<ClientResponseDto> findAll();

    void delete(Integer id);

    ClientResponseDto update(Integer id, ClientRequestDto clientDto);
}
