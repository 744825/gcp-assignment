package com.gcp.assignment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.gcp.assignment.entities.ContactDetailsEntity;
import com.gcp.assignment.exception.ContactDetailsNotFoundException;

import jakarta.transaction.Transactional;

@Service
public class ContactDetailsService {

	@Autowired com.gcp.assignment.repositories.ContactDetailsRepository ContactDetailsRepository;
	
	
	public ContactDetailsEntity createContactDetailsEntity(ContactDetailsEntity ContactDetailsEntity) {
		return ContactDetailsRepository.save(ContactDetailsEntity);
	}
	@Transactional
	public void deleteContactDetailsEntity(Long partnerKey) throws ContactDetailsNotFoundException{
		Optional<ContactDetailsEntity> optionalContactDetailsEntity = ContactDetailsRepository.findByPartnerKey(partnerKey);
		if(!optionalContactDetailsEntity.isEmpty()) {
			ContactDetailsRepository.deleteByPartnerKey(partnerKey);
		}else {
			throw new ContactDetailsNotFoundException("ContactDetailsEntity not found with the id, please provide correct id...");
		}
		
	}


}