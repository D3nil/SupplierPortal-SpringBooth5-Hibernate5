package com.app.SupplierPortalDemo.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * The persistent class for the password database table.
 * 
 */
@Entity
@Table(name="password")
@NamedQuery(name="Password.findAll", query="SELECT p FROM Password p")
public class Password implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int id_password;
//
//	@Column(name="id_bodyrentalvendor_fk")
//	private int id_bodyrentalvendor_fk;

	//bi-directional one-to-one association to Fornitore
	@OneToOne(cascade=CascadeType.ALL)
	@JsonBackReference
	@JoinColumn(name="id_bodyrentalvendor_fk", 
	referencedColumnName="id_bodyrentalvendor", 
	nullable=false ,unique=true)
	private Fornitore fornitore;

	@Column(length=30)
	private String password;
	
	public Password(){}

	public int getId_password() {
		return id_password;
	}

	public void setId_password(int id_password) {
		this.id_password = id_password;
	}

	public Fornitore getFornitore() {
		return fornitore;
	}

	public void setFornitore(Fornitore fornitore) {
		this.fornitore = fornitore;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}