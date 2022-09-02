package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="formateur")
public class Formateur implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFormateur;
	private String nom;
	private String prenom;
	private String cin;
	private String tel;
	private String adresse;
	public int getIdFormateur() {
		return idFormateur;
	}
	public void setIdFormateur(int idFormateur) {
		this.idFormateur = idFormateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Formateur(String nom, String prenom, String cin, String tel, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.tel = tel;
		this.adresse = adresse;
	}
	public Formateur() {
		super();
	}
	
	@Override
	public String toString() {
		return "Formateur [idFormateur=" + idFormateur + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin
				+ ", tel=" + tel + ", adresse=" + adresse + "]";
	}
	
	
	
}

