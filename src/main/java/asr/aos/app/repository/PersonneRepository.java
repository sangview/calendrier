package asr.aos.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asr.aos.app.entity.Personne;

//JpaRepsotory nous permet de faciliter le mapping relationnel : 
//on precise juste la classe et type de Id

@Repository
public interface  PersonneRepository extends JpaRepository<Personne, Long>{	

	/*
	@Query("select ev from Evenement ev where ev.description like :x")
	public Page<Evenement> chercher(@Param("x") String motCle, Pageable pageable);
	*/
}
