package asr.aos.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import asr.aos.app.entity.Evenement;
import asr.aos.app.repository.EvenementRepository;

@RestController
public class EvenementService {
	
	@Autowired
	private EvenementRepository evenementRepository;

	@RequestMapping(value = "/evenments",method = RequestMethod.GET)
	public List<Evenement>  getEvenements(){
		return evenementRepository.findAll();
	}
	
	@RequestMapping(value = "/evenments/{id}",method = RequestMethod.GET)
	public Optional<Evenement>  getEvenement(@PathVariable Long id){
		return evenementRepository.findById(id);
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
	@RequestMapping(value = "/evenments",method = RequestMethod.POST)
	public Evenement  enregistrer(@RequestBody Evenement ev){
		return evenementRepository.save(ev);
	}
	
	@RequestMapping(value = "/evenments/{id}",method = RequestMethod.DELETE)
	public boolean  supprimer(@PathVariable Long id){
		   evenementRepository.deleteById(id);
		   return true;
	}
	
	@RequestMapping(value = "/evenments/{id}",method = RequestMethod.PUT)
	public Evenement  update(@PathVariable Long id,@RequestBody Evenement ev){
		   ev.setId(id);
		   return evenementRepository.save(ev);
		  
	}
	
	
}
