package com.loic.gestiondestock.repository;

import com.loic.gestiondestock.model.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneVenteRepository extends JpaRepository<LigneVente, Integer> {
    void deleteAllByVenteId(Integer id);
}
