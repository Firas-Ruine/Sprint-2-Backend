package com.firas.etudiant.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.firas.etudiant.entities.Universite;

@RepositoryRestResource(path = "rest")
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
	/*List<Universite> findByNom(String nom);
	List<Universite> findByNomContains(String nom);
	@Query("select u from Universite p where u.nom ='Ruine' and p.prenom = 'Firas'")*/


}
