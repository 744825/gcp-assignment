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

	public ContactDetailsEntity getContactDetailsByPartnerKey(Long partnerKey) throws ContactDetailsNotFoundException {
		Optional<ContactDetailsEntity> optionalContactDetailsEntity = ContactDetailsRepository.findByPartnerKey(partnerKey);
		if(!optionalContactDetailsEntity.isEmpty()) {
			return optionalContactDetailsEntity.get();
		}else {
			throw new ContactDetailsNotFoundException("ContactDetails not found with the partnerKey...");
		}
		
	}

		public ContactDetailsEntity updteContactDetails(Long partnerKey,ContactDetailsEntity ContactDetailsEntity) throws ContactDetailsNotFoundException {
		Optional<ContactDetailsEntity> optionalContactDetailsEntity = ContactDetailsRepository.findByPartnerKey(partnerKey);
		if(!optionalContactDetailsEntity.isEmpty()) {
			return ContactDetailsRepository.save(ContactDetailsEntity);
		}else {
			throw new ContactDetailsNotFoundException("ContactDetails not found with the partnerKey...");
		}
		
	}

	@Transactional
	public void deleteContactDetailsEntity(Long partnerKey) throws ContactDetailsNotFoundException{
		Optional<ContactDetailsEntity> optionalContactDetailsEntity = ContactDetailsRepository.findByPartnerKey(partnerKey);
		if(!optionalContactDetailsEntity.isEmpty()) {
			ContactDetailsRepository.deleteByPartnerKey(partnerKey);
		}else {
			throw new ContactDetailsNotFoundException("Contact Details not found with the id, please provide correct id...");
		}
		
	}



}