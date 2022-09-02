package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Formation")
public class Formation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
    @Column(name = "Formation_id")
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private ParticipantInformation participantInformation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCycle") 
	private Cycle cycle;
	
	@Column(name = "REGISTERED_DATE")
    @Temporal(TemporalType.DATE)
	private Date registeredDate;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	 
	public ParticipantInformation getParticipantInformation() {
		return participantInformation;
	}
	public void setParticipantInformation(ParticipantInformation participantInformation) {
		this.participantInformation = participantInformation;
	}
	
	
	public Cycle getCycle() {
		return cycle;
	}
	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}
	
	
	public Date getRegisteredDate() {
		return registeredDate;
	}
	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}
	
	

	
	
}
