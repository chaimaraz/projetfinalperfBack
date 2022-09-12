package com.example.demo.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.action.internal.OrphanRemovalAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Cycle")
public class Cycle implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCycle;
	private String entrprise;
	private int numAction;
	private String theme;
	private String lieu;
	private Date dateDebut;
	private Date dateFin;
	private String heureDebut;
	private String duree;
	private String pause;
	private String mode;
	private String choix;
	private String gouvernorat;
	private String numSalle;
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	@JoinColumn(name = "formateur.idFormateur")
	private Formateur formateur;

	
	 
	 
	
	public Long getIdCycle() {
		return idCycle;
	}
	public void setIdCycle( Long idCycle) {
		this.idCycle = idCycle;
	}
	public String getEntrprise() {
		return entrprise;
	}
	public void setEntrprise(String entrprise) {
		this.entrprise = entrprise;
	}
	public int getNumAction() {
		return numAction;
	}
	public void setNumAction(int numAction) {
		this.numAction = numAction;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getPause() {
		return pause;
	}
	public void setPause(String pause) {
		this.pause = pause;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getGouvernorat() {
		return gouvernorat;
	}
	public void setGouvernorat(String gouvernorat) {
		this.gouvernorat = gouvernorat;
	}
	public String getNumSalle() {
		return numSalle;
	}
	public void setNumSalle(String numSalle) {
		this.numSalle = numSalle;
	}
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	@Override
	public String toString() {
		return "Cycle [idCycle=" + idCycle + ", entrprise=" + entrprise + ", numAction=" + numAction + ", theme="
				+ theme + ", lieu=" + lieu + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", heureDebut="
				+ heureDebut + ", duree=" + duree + ", pause=" + pause + ", mode=" + mode + ", gouvernorat="
				+ gouvernorat + ", numSalle=" + numSalle + ", formateur=" + formateur + "]";
	}
	
	
	
	public Cycle() {
		
	}
	public String getChoix() {
		return choix;
	}
	public void setChoix(String choix) {
		this.choix = choix;
	}
	
	
	
	
	

}
