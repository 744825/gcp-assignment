
package com.gcp.assignment.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcp.assignment.entities.ContactDetailsEntity;

@Repository
public interface ContactDetailsRepository extends JpaRepository<ContactDetailsEntity, Long>{
	List<ContactDetailsEntity> findByEmail(String email);
    List<ContactDetailsEntity> findByMobile(String mobile);
	Optional<ContactDetailsEntity> findByPartnerKey(Long partnerKey);
	Long deleteByPartnerKey(Long partnerKey);
}

