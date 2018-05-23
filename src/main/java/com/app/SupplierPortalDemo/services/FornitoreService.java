/**
 * 
 */
package com.app.SupplierPortalDemo.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	 @PersistenceContext
	    private EntityManager entityManger;
	
	private static final Logger logger = LoggerFactory.getLogger(FornitoreService.class);
	
	
	public Fornitore addFornitore(Fornitore f) 
	{
	logger.info("Fornitore  saved successfully, fornitore Details => "+f);
	return repo.save(f);
	}
	
	
	public List<Fornitore> getall() 
	{
		List<Fornitore> fornitori;
		fornitori=repo.findAll();
		
		return fornitori;
	}

}
