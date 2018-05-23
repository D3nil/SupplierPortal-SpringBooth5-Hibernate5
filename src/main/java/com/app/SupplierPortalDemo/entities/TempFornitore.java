/**
 * 
 */
package com.app.SupplierPortalDemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Denilson
 */
@Entity
@Table(name = "fornitore_da_qualificare")
public class TempFornitore 
{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id_qualificationvendor;
	
	@Column(length = 30)
	private String R_D_Sociale;	
	@Column(length = 80)
	private String sede_Legale;	
//	@Column(length = 30)
//	private String cap_SL;	
//	@Column(length = 30)
//	private String citta_SL;	
//	@Column(length = 30)
//	private String prov_SL;	
	
	@Column(length = 80)
	private String sede_Operativa;	
//	@Column(length = 30)
//	private String cap_SO;	
//	@Column(length = 30)
//	private String citta_SO;	
//	@Column(length = 30)
//	private String prov_SO;
	
	@Column(length = 30)
	private String telefono;	
	@Column(length = 30)
	private String fax;	
	@Column(length = 30)
	private String e_mail;	
	@Column(length = 30)
	private String data_inizio;	
	@Column(length = 30)
	private	String cod_fisc;	
	@Column(length = 30)
	private String p_iva;
		
	

}
