package com.app.SupplierPortalDemo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;



/**
 * The persistent class for the VendorType database table.
 * 
 */
@Entity
@Table(name="VendorType")
@NamedQuery(name="Tipo.findAll", query="SELECT f FROM Tipo f")

public class Tipo implements Serializable {
	
	private static final long serialVersionUID = 1L;

//	@Id
//	@Column(unique=true, nullable=false)
//	private int id_vendorType;


	//bi-directional one-to-one association to Fornitore
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private int id_vendorType;
	
	
	@Column(length=30)
	private String tipoFornitore;

	//bi-directional many-to-one association to Doctype4vendor
//	@OneToMany(mappedBy="vendorType")
//	private List<Doctype4vendor> doctypeForVendors;

	@OneToMany(mappedBy = "tipoFornitore_id_fk", cascade = CascadeType.ALL)
	@JsonBackReference
	private List<Fornitore> fornitore;
//	@JoinColumn(name="id_vendorType", 
//	referencedColumnName="fk_vendorType_id")
	
	public Tipo() {}

	public int getId_vendorType() {
		return id_vendorType;
	}

	public void setId_vendorType(int id_vendorType) {
		this.id_vendorType = id_vendorType;
	}

	public String getTipoFornitore() {
		return tipoFornitore;
	}

	public void setTipoFornitore(String tipoFornitore) {
		this.tipoFornitore = tipoFornitore;
	}

	public List<Fornitore> getFornitore() {
		return fornitore;
	}

	public void setFornitore(List<Fornitore> fornitore) {
		this.fornitore = fornitore;
	}
	
	

	

}