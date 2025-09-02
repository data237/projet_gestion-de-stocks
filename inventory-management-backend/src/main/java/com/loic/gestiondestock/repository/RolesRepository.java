package com.loic.gestiondestock.repository;

import com.loic.gestiondestock.model.Roles;
import com.loic.gestiondestock.model.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolesRepository extends JpaRepository<Roles, Integer> {
    Optional<Roles> findByRoleName(Role roleName);
}
