package com.gcp.assignment.controller;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.gcp.assignment.api.ContactDetailsApi;
import com.gcp.assignment.entities.ContactDetailsEntity;
import com.gcp.assignment.exception.ContactDetailsNotFoundException;
//import com.gcp.assignment.exception.ContactDetailsNotFoundException;
import com.gcp.assignment.model.ContactDetails;
import com.gcp.assignment.services.ContactDetailsService;

@RestController
//@RequestMapping(value = "/Contact-details/")
public class ContactDetailsController implements ContactDetailsApi{

	@Autowired
	private ContactDetailsService ContactDetailsService;
	
	@GetMapping(path = "/k")
	public String helloWorld() {
		return "Hello World";
	}

	@Override
	//return type changed in yaml confirm with souvik, was integer before
	public ResponseEntity<ContactDetails> addContactDetails(ContactDetails body) {
		ContactDetailsEntity ContactDetails = new ContactDetailsEntity();
		BeanUtils.copyProperties(body,ContactDetails);
		ContactDetails =  ContactDetailsService.createContactDetailsEntity(ContactDetails);
		ContactDetails ContactDetailsDTO = new ContactDetails();
		BeanUtils.copyProperties(ContactDetails, ContactDetailsDTO);
		return new ResponseEntity<ContactDetails>(ContactDetailsDTO,HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Void> deleteContactDetails(Long partnerKey) {
		try{
			ContactDetailsService.deleteContactDetailsEntity(partnerKey);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}catch (ContactDetailsNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
		}
	}

	@Override
	public ResponseEntity<ContactDetails> getContactDetailsById(Long partnerKey) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getContactDetailsById'");
	}

	@Override
	public ResponseEntity<ContactDetails> updateContactDetails(Long partnerKey, ContactDetails body) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'updateContactDetails'");
	}


}