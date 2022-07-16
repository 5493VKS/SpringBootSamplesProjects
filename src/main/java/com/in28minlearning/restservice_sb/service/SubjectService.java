package com.in28minlearning.restservice_sb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.in28minlearning.restservice_sb.bean.Subject;

@Service
public class SubjectService {

	private static List<Subject> subs = new ArrayList<>();

	static int inc;

	static {
		subs.add(new Subject(++inc,"Java","Programming Language",200.2));
		subs.add(new Subject(++inc,"Spring boot","RAD framework",400.4));
		subs.add(new Subject(++inc,"Web service","Service over the network",500.2));
		subs.add(new Subject(++inc,"PL_SQL","SQL procedure language",250.2));		
	}

	public List<Subject> getSubjects(){

		return subs;
	}

	public Subject deleteSubject(int id) {

		Subject sub = findSubject(id);
		if(sub == null) return null;

		if(subs.remove(sub)) {
			return sub;
		}

		return null;

	}
	public Subject findSubject(int id) {

		for(Subject sub : subs) {
			if(sub.getId() == id) {
				return sub;
			}
		}
		return null;
	}

	public Subject save(Subject sub) {

		if(sub.getId() == -1 || sub.getId() == 0) {
			sub.setId(++inc);
			subs.add(sub);			
		}else {
			deleteSubject(sub.getId());
			subs.add(sub);
		}
		return sub;
	}

	public Subject insert(Subject sub) {
		
		System.out.println("subject insert: "+sub);
		sub.setId(++inc);
		subs.add(sub);
		return sub;
	}

}
