package com.app.SupplierPortalDemo.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
 * The persistent class for the vw_bodyrentalvendor database table.
 * 
 */
@Entity
@Table(name="vw_bodyrentalvendor")
@NamedQuery(name="Fornitore.findAll", query="SELECT f FROM Fornitore f")
public class Fornitore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_bodyrentalvendor", unique=true, nullable=false)
	private int id_bodyrentalvendor;

	@Column(length=30)
	private String address;

	@Column(length=30)
	private String address2;

	@Column(name="blocked_qualification", length=30)
	private String blockedQualification;

	@Column(length=30)
	private String city;

	@Column(length=30)
	private String company;

	@Column(name="company_name_no", length=30)
	private String companyNameNo;

	@Column(name="country_region_code", length=30)
	private String countryRegionCode;

	@Column(name="e_mail", length=30)
	private String eMail;

	@Column(name="fax_no", length=30)
	private String faxNo;

	@Column(length=30)
	private String name;

	@Column(length=30)
	private String name2;

	@Column(name="phone_no", length=30)
	private String phoneNo;

	@Column(name="post_code", length=30)
	private String postCode;

	@Column(name="qualification_notes")
	private int qualificationNotes;

	@Column(name="vatregistration_no")
	private int vatregistrationNo;

	//bi-directional one-to-one association to Password
	@OneToOne(mappedBy="fornitore")
	
	private Password password;

	public Fornitore() {
	}

	public int getId_bodyrentalvendor() {
		return id_bodyrentalvendor;
	}

	public void setId_bodyrentalvendor(int id_bodyrentalvendor) {
		this.id_bodyrentalvendor = id_bodyrentalvendor;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getBlockedQualification() {
		return blockedQualification;
	}

	public void setBlockedQualification(String blockedQualification) {
		this.blockedQualification = blockedQualification;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyNameNo() {
		return companyNameNo;
	}

	public void setCompanyNameNo(String companyNameNo) {
		this.companyNameNo = companyNameNo;
	}

	public String getCountryRegionCode() {
		return countryRegionCode;
	}

	public void setCountryRegionCode(String countryRegionCode) {
		this.countryRegionCode = countryRegionCode;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getFaxNo() {
		return faxNo;
	}

	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public int getQualificationNotes() {
		return qualificationNotes;
	}

	public void setQualificationNotes(int qualificationNotes) {
		this.qualificationNotes = qualificationNotes;
	}

	public int getVatregistrationNo() {
		return vatregistrationNo;
	}

	public void setVatregistrationNo(int vatregistrationNo) {
		this.vatregistrationNo = vatregistrationNo;
	}

	public Password getPassword() {
		return password;
	}

	public void setPassword(Password password) {
		this.password = password;
	}

	


}