package com.loic.gestiondestock.service;

import com.loic.gestiondestock.dto.AuthResponseDto;
import com.loic.gestiondestock.dto.LoginRequestDto;
import com.loic.gestiondestock.dto.RegisterRequestDto;

public interface AuthService {

    AuthResponseDto register(RegisterRequestDto request);

    AuthResponseDto login(LoginRequestDto request);

}
