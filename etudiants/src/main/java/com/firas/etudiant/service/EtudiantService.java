package com.firas.etudiant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.firas.etudiant.entities.Etudiant;
import com.firas.etudiant.entities.Universite;
@Service
public interface EtudiantService {

		Etudiant saveEtudiant(Etudiant e);
		Etudiant updateEtudiant(Etudiant e);
		void deleteEtudiant(Etudiant e);
		void deleteEtudiantById(Long id);
		Etudiant getEtudiant(Long id);
		List<Etudiant> getAllEtudiants();
		List<Etudiant> findByNom(String nom);
		List<Etudiant> findByNomContains(String nom);
		List<Etudiant> findByUniversite (Universite Universite);
		List<Etudiant> findByUniversiteIdUni(Long id);
		//List<Etudiant> findByOrderByNomEtudiantAsc();
		//List<Etudiant> trierEtudiantsNomsPrix();
	}

