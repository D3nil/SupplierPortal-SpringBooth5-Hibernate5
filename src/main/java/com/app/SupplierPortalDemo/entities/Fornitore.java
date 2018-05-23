package com.app.SupplierPortalDemo.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	private String e_mail;

	@Column(name="fax_no", length=30)
	private String fax_no;

	@Column(length=30)
	private String name;

	@Column(length=30)
	private String name2;

	@Column(name="phone_no", length=30)
	private String phoneNo;

	@Column(name="post_code", length=30)
	private String post_code;

	@Column(name="qualification_notes")
	private int qualification_notes;

	@Column(name="vat_registration_no",length=30)
	private String vat_registration_no;
	
	@ManyToOne
	@JoinColumn(name="tipoFornitore_id_fk")
	  private Tipo tipoFornitore_id_fk;

	//bi-directional one-to-one association to Password
	@OneToOne(mappedBy="fornitore")	
	private Password password;
	

	public Fornitore() {}


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


	public String getE_mail() {
		return e_mail;
	}


	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}


	public String getFax_no() {
		return fax_no;
	}


	public void setFax_no(String fax_no) {
		this.fax_no = fax_no;
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


	public String getPost_code() {
		return post_code;
	}


	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}


	public int getQualification_notes() {
		return qualification_notes;
	}


	public void setQualification_notes(int qualification_notes) {
		this.qualification_notes = qualification_notes;
	}


	public String getVat_registration_no() {
		return vat_registration_no;
	}


	public void setVat_registration_no(String vat_registration_no) {
		this.vat_registration_no = vat_registration_no;
	}


	public Tipo getTipoFornitore_id_fk() {
		return tipoFornitore_id_fk;
	}


	public void setTipoFornitore_id_fk(Tipo tipoFornitore_id_fk) {
		this.tipoFornitore_id_fk = tipoFornitore_id_fk;
	}


	public Password getPassword() {
		return password;
	}


	public void setPassword(Password password) {
		this.password = password;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fornitore [id_bodyrentalvendor=");
		builder.append(id_bodyrentalvendor);
		builder.append(", address=");
		builder.append(address);
		builder.append(", address2=");
		builder.append(address2);
		builder.append(", blockedQualification=");
		builder.append(blockedQualification);
		builder.append(", city=");
		builder.append(city);
		builder.append(", company=");
		builder.append(company);
		builder.append(", companyNameNo=");
		builder.append(companyNameNo);
		builder.append(", countryRegionCode=");
		builder.append(countryRegionCode);
		builder.append(", e_mail=");
		builder.append(e_mail);
		builder.append(", fax_no=");
		builder.append(fax_no);
		builder.append(", name=");
		builder.append(name);
		builder.append(", name2=");
		builder.append(name2);
		builder.append(", phoneNo=");
		builder.append(phoneNo);
		builder.append(", post_code=");
		builder.append(post_code);
		builder.append(", qualification_notes=");
		builder.append(qualification_notes);
		builder.append(", vat_registration_no=");
		builder.append(vat_registration_no);
		builder.append(", tipoFornitore_id_fk=");
		builder.append(tipoFornitore_id_fk);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}


}