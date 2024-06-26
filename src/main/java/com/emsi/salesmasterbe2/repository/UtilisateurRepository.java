package com.emsi.salesmasterbe2.repository;


import com.emsi.salesmasterbe2.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
