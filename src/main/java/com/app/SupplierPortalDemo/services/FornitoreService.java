/**
 * 
 */
package com.app.SupplierPortalDemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.SupplierPortalDemo.entities.Fornitore;
import com.app.SupplierPortalDemo.repositories.FornitoreRepository;

/**
 * @author Denilson
 */
@Service
public class FornitoreService {
	@Autowired
	FornitoreRepository repo;
	
	public List<Fornitore> getall() 
	{
		List<Fornitore> fornitori;
		fornitori=repo.findAll();		
		return fornitori;
	}

}
