package com.springBootJPAExample1.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springBootJPAExample1.Entity.User;


@Repository
@Transactional
public class UserDaoService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Long insert(User user) {
		
		entityManager.persist(user);
		
		return user.getId();
	}

}
