/**
 * 
 */
package com.app.SupplierPortalDemo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.SupplierPortalDemo.entities.Fornitore;

/**
 * @author Denilson
 */
@Repository
public interface FornitoreRepository extends JpaRepository<Fornitore, Integer>
{
	}

