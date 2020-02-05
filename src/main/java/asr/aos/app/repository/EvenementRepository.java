package asr.aos.app.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import asr.aos.app.entity.Evenement;

//JpaRepsotory nous permet de faciliter le mapping relationnel : 
//on precise juste la classe et type de Id

@Repository
public interface  EvenementRepository extends JpaRepository<Evenement, Long>{	

	/*
	@Query("select ev from Evenement ev where ev.description like :x")
	public Page<Evenement> chercher(@Param("x") String motCle, Pageable pageable);
	*/
}
