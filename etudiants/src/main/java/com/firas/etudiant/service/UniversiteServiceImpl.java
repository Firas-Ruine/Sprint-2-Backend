package com.firas.etudiant.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firas.etudiant.entities.Universite;
import com.firas.etudiant.repos.UniversiteRepository;

@Service
public class UniversiteServiceImpl implements UniversiteService {

	@Autowired
	UniversiteRepository universiteRepository;
	@Override
	public Universite saveUniversite(Universite u) {
	return universiteRepository.save(u);
}

@Override
public Universite updateUniversite(Universite u) {
return universiteRepository.save(u);
}
@Override
public void deleteUniversite(Universite u) {
	universiteRepository.delete(u);
}
@Override
public void deleteUniversiteById(Long id) {
	universiteRepository.deleteById(id);
}
@Override
public Universite getUniversite(Long id) {
return universiteRepository.findById(id).get();
}
@Override
public List<Universite> getAllUniversites() {
return universiteRepository.findAll();
}

	

}
