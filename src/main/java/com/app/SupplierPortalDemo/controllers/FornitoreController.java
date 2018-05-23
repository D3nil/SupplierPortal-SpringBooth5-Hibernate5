/**
 * 
 */
package com.app.SupplierPortalDemo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.app.SupplierPortalDemo.entities.Fornitore;
import com.app.SupplierPortalDemo.services.FornitoreService;
import com.google.gson.Gson;


/**
 * @author Denilson
 */

@RestController
//@RequestMapping(value="/suppliers" ,produces="application/json")
public class FornitoreController {
	@Autowired
	private FornitoreService fornitore_service;	
	
	@GetMapping(value="/all", produces="application/json" )
	@ResponseBody
	public List<Fornitore>  getAllSuppliers() 	
	{	
		List<Fornitore> f =fornitore_service.getall();
		 //String json= new Gson().toJson(f);
		 return f;
	}
	
	@PostMapping(value= "/add", consumes="application/json")
	public Fornitore addSupplier(@RequestBody Fornitore fornitore)
	{
		return fornitore_service.addFornitore(fornitore);
	}
	
	
	@GetMapping(value="/view")
	public List<Fornitore>  getAllSupplierss() 	
	{	
		List<Fornitore> f =fornitore_service.getall();
		//String json= new Gson().toJson(f);
		return f;
	}
	
	 @GetMapping("/asd")
	    public ModelAndView findAll(){
	        ModelAndView md = new ModelAndView("firstLogin");
	        md.addObject("fornitori", fornitore_service.getall());
	        return md;
	    }
}
