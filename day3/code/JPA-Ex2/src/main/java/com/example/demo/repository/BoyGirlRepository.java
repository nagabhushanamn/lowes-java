package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Boy;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Girl;

@Repository
@Transactional
public class BoyGirlRepository {

	@PersistenceContext
	private EntityManager em;

	public void saveBoy(Boy boy) {
		em.persist(boy);
	}

	public void saveGirl(Girl girl) {
		em.persist(girl);
	}

	public Boy findOneBoy(int i) {
		return em.find(Boy.class, i);
	}

	public Girl findOneGirl(int i) {
		return em.find(Girl.class, i);
	}

}
