package com.firas.etudiant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firas.etudiant.entities.Etudiant;
import com.firas.etudiant.entities.Universite;
import com.firas.etudiant.repos.EtudiantRepository;
@Service
public class EtudiantServiceImpl implements EtudiantService {
	@Autowired
	EtudiantRepository etudiantRepository;
	@Override
	public Etudiant saveEtudiant(Etudiant e) {
	return etudiantRepository.save(e);
}

@Override
public Etudiant updateEtudiant(Etudiant e) {
return etudiantRepository.save(e);
}
@Override
public void deleteEtudiant(Etudiant e) {
	etudiantRepository.delete(e);
}
@Override
public void deleteEtudiantById(Long id) {
	etudiantRepository.deleteById(id);
}
@Override
public Etudiant getEtudiant(Long id) {
return etudiantRepository.findById(id).get();
}
@Override
public List<Etudiant> getAllEtudiants() {
return etudiantRepository.findAll();
}
@Override
public List<Etudiant> findByNom(String nom) {
return etudiantRepository.findByNom(nom);
}
@Override
public List<Etudiant> findByNomContains(String nom) {
return etudiantRepository.findByNomContains(nom);
}

	@Override
	public List<Etudiant> findByUniversite(Universite Universite) {
	return etudiantRepository.findByUniversite(Universite);
	}
	@Override
	public List<Etudiant> findByUniversiteIdUni(Long id) {
	return etudiantRepository.findByUniversiteIdUni(id);
	}

	
	
	
}
