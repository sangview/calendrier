package asr.aos.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import asr.aos.app.entity.Evenement;
import asr.aos.app.entity.Personne;
import asr.aos.app.repository.PersonneRepository;

@RestController
public class PersonneService {
	
	@Autowired
	private PersonneRepository personneRepository;

	@RequestMapping(value = "/personnes",method = RequestMethod.GET)
	public List<Personne>  getEvenements(){
		return personneRepository.findAll();
	}
	
	@RequestMapping(value = "/personnes/{id}",method = RequestMethod.GET)
	public Optional<Personne>  getEvenement(@PathVariable Long id){
		return personneRepository.findById(id);
	}
	
	/*
	@RequestMapping(value = "/evenments",method = RequestMethod.GET)
	public Page<Evenement>  chercher(
			@RequestParam(name = "motCle",defaultValue = "") String motCle,  //chaine vide par defaut
			@RequestParam(name = "page",defaultValue = "0")  int page,       // page 0 par defaut
			@RequestParam(name = "taillePage",defaultValue = "5")int taillePage // on recupere 5 enregistrements par defaut
			){   
		return evenementRepository.chercher(motCle, new PageRequest(page,taillePage, Sort.by("price").descending()));
	}
	*/
	@RequestMapping(value = "/personnes",method = RequestMethod.POST)
	public Personne  enregistrer(@RequestBody Personne ev){
		return personneRepository.save(ev);
	}
	
	@RequestMapping(value = "/personnes/{id}",method = RequestMethod.DELETE)
	public boolean  supprimer(@PathVariable Long id){
		personneRepository.deleteById(id);
		   return true;
	}
	
	@RequestMapping(value = "/personnes/{id}",method = RequestMethod.PUT)
	public Personne  update(@PathVariable Long id,@RequestBody Personne ev){
		   ev.setId(id);
		   return personneRepository.save(ev);
		  
	}
	
	
}
