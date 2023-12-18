/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.gcp.assignment.api;

import com.gcp.assignment.model.ContactDetails;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-18T22:22:59.470491500+05:30[Asia/Calcutta]")
@Validated
public interface ContactDetailsApi {

    @Operation(summary = "Add a new contact details to the application", description = "Add a new contact details to the application", tags={ "contact-details" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ContactDetails.class))),
        
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/contact-details/create",
        produces = { "application/json" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<ContactDetails> addContactDetails(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new contact details in the application", required=true, schema=@Schema()) @Valid @RequestBody ContactDetails body);


    @Operation(summary = "Deletes a contact details", description = "delete a contact details", tags={ "contact-details" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful deletion"),
        
        @ApiResponse(responseCode = "400", description = "Invalid value") })
    @RequestMapping(value = "/contact-details/delete/{partnerKey}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteContactDetails(@Parameter(in = ParameterIn.PATH, description = "ID of address details to return", required=true, schema=@Schema()) @PathVariable("partnerKey") Long partnerKey);


    @Operation(summary = "Find contact details by ID", description = "Returns a single contact details", tags={ "contact-details" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ContactDetails.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "contact details not found") })
    @RequestMapping(value = "/contact-details/get/{partnerKey}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<ContactDetails> getContactDetailsById(@Parameter(in = ParameterIn.PATH, description = "ID of contact details to return", required=true, schema=@Schema()) @PathVariable("partnerKey") Long partnerKey);


    @Operation(summary = "Update an existing contact details", description = "Update an existing contact details by Id", tags={ "contact-details" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ContactDetails.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "address details not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/contact-details/update/{partnerKey}",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<ContactDetails> updateContactDetails(@Parameter(in = ParameterIn.PATH, description = "ID of contact details to return", required=true, schema=@Schema()) @PathVariable("partnerKey") Long partnerKey, @Parameter(in = ParameterIn.DEFAULT, description = "Update an existent contact details in the application", required=true, schema=@Schema()) @Valid @RequestBody ContactDetails body);

}

