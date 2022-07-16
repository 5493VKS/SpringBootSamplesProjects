package com.webappJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.webappJPA.model.Alien;

public interface Aliendao extends JpaRepository<Alien, Integer>{
//public interface Aliendao extends CrudRepository<Alien, Integer>{

	public List<Alien> findByTech(String tech);
	public List<Alien> findByEidGreaterThan(int eid);
	@Query(" From Alien where tech=?1 order by ename desc")
	public List<Alien> findByEidSorted(String tech);
}
