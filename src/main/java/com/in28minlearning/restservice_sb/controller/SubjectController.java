package com.in28minlearning.restservice_sb.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minlearning.restservice_sb.bean.Subject;
import com.in28minlearning.restservice_sb.service.SubjectService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SubjectController {

	@Autowired
	private SubjectService subsrc;

	@GetMapping(path = "/getsub/{sub}/subjects")
	public List<Subject> getAllSubjects(String sub){

		return subsrc.getSubjects();

	}  

	@DeleteMapping(path = "/deletesub/{sub}/subjects/{id}")
	public ResponseEntity<Void> deleteSubjects(@PathVariable String sub, @PathVariable int id){

		Subject subject = subsrc.deleteSubject(id);

		if(subject != null) {
			return ResponseEntity.noContent().build();		
		}

		return ResponseEntity.notFound().build();

	}
	
	@GetMapping(path = "/retrivesub/{sub}/subjects/{id}")
	public Subject retriveSubject(@PathVariable String sub, @PathVariable int id){
		Subject subject = subsrc.findSubject(id);		
		return subject;
	}
	
	@PutMapping(path = "/putsub/{sub}/subjects/{id}")
	public ResponseEntity<Subject> saveSubjects(@PathVariable String sub, @PathVariable int id, @RequestBody Subject subject){

		Subject updatedSub = subsrc.save(subject);
		
		return new ResponseEntity<Subject>(updatedSub,HttpStatus.OK);

	}
	
	@PostMapping(path = "/postsub/{sub}/subjects")
	public ResponseEntity<Void> insertSubjects(@PathVariable String sub,@RequestBody Subject subject){

		Subject createdSub = subsrc.save(subject);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdSub.getId()).toUri();
		return ResponseEntity.created(uri).build();
	

	}
	
	@PostMapping(path = "/createsub/{sub}/subjects")
	public ResponseEntity<Void> createSubjects(@PathVariable String sub, @RequestBody Subject subject){

		Subject createdSub = subsrc.insert(subject);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdSub.getId()).toUri();
		return ResponseEntity.created(uri).build();
	

	}

}
