package asr.aos.app.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Personne implements Serializable{
	
	@Id @GeneratedValue
	private Long id;
	private String nom;
	private String specialite;
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(String nom, String specialite) {
		super();
		this.nom = nom;
		this.specialite = specialite;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
