package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Formation")
public class Formation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Formation_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "id_User",referencedColumnName = "id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "id_Cycle" ,referencedColumnName = "idCycle") 
	private Cycle cycle;
	
	@Column(name = "REGISTERED_DATE")
    @Temporal(TemporalType.DATE)
	private Date registeredDate;
	
	
	
	
	public Formation() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	 
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
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

	public Formation(User user, Cycle cycle, Date registeredDate) {
		this.user = user;
		this.cycle = cycle;
		this.registeredDate = registeredDate;
	}
	@Override
	public String toString() {
		return "Formation [id=" + id + ", user=" + user + ", cycle=" + cycle + ", registeredDate=" + registeredDate
				+ "]";
	}
	
	
	
	

	
	
}
