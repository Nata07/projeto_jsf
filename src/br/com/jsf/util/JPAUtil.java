package br.com.jsf.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	// <persistence-unit name="financas">
	EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("projeto_jsf");
	public EntityManager getEntityManager(){
		return entityManagerFactory.createEntityManager();
	}

}