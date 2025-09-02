package com.loic.gestiondestock.service;

import com.loic.gestiondestock.dto.RolesRequestDto;
import com.loic.gestiondestock.dto.RolesResponseDto;

import java.util.List;

public interface RolesService {
    RolesResponseDto save(RolesRequestDto rolesDto);

    RolesResponseDto findById(Integer id);

    RolesResponseDto findByRoleName(String roleName);

    List<RolesResponseDto> findAll();

    void delete(Integer id);

    RolesResponseDto update(Integer id, RolesRequestDto rolesDto);
}

 
