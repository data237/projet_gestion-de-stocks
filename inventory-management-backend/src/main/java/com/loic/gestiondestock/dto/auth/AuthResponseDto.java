package com.loic.gestiondestock.dto.auth;

import com.loic.gestiondestock.dto.UtilisateurResponseDto;

import lombok.Data;

@Data
public class AuthResponseDto {
    private String token;
    private UtilisateurResponseDto user;
} 