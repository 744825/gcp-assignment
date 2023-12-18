package com.gcp.assignment.entities;




import org.springframework.validation.annotation.Validated;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "This model is to create a Contact Details")
@Entity(name="ContactDetailsEntity")
@Table(name="contact_detail")
@Validated
@Data
@NoArgsConstructor
public class ContactDetailsEntity {

	@ApiModelProperty(notes = "Auto generated unique id", required = true)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name = "ID")
	private Long id;
	
    @ApiModelProperty(notes = "Partnet key", required = true)
	@Column(name = "PARTNERKEY", length = 50, nullable = true)
	private Long partnerKey;
	
    @ApiModelProperty(notes = "Partner Email", required = true)
	@Column(name = "EMAIL", length = 50, nullable = true)
	@Size(min = 6,message = "Email should be six lettte long")
	private String email;
	
    @ApiModelProperty(notes = "Partner Mobile", required = true)
	@Column(name = "MOBILE", length = 10, nullable = true)
	@Size(min = 10,max = 10,message = "mobile should be 10 digits")
	private String mobile;
	
	
	@Column(name = "TELEPHONE", length = 11, nullable = true)
	@Size(min = 11,max = 12,message = "telephone should be 11-12 long")
	private String telephone;
	

	
}