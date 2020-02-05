package asr.aos.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Evenement implements Serializable{

	@Id @GeneratedValue
	private Long id;
	private String description;
	@Temporal(TemporalType.DATE)
	private Date dateEvenement;
	
	
	public Evenement(String description, Date dateEvenment) {
		super();
		this.description = description;
		this.dateEvenement = dateEvenment;
	}
	public Evenement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateEvenement() {
		return dateEvenement;
	}
	public void setDateEvenement(Date dateEvenment) {
		this.dateEvenement = dateEvenment;
	}
	
	
}
