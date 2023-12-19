package com.gcp.assignment.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-12-19T21:19:53.818136800+05:30[Asia/Calcutta]")


public class ContactDetails   {
  @JsonProperty("partnerKey")
  private Long partnerKey = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("mobile")
  private String mobile = null;

  @JsonProperty("telephone")
  private String telephone = null;

  public ContactDetails partnerKey(Long partnerKey) {
    this.partnerKey = partnerKey;
    return this;
  }

  /**
   * Get partnerKey
   * @return partnerKey
   **/
  @Schema(example = "1", description = "")
  
    public Long getPartnerKey() {
    return partnerKey;
  }

  public void setPartnerKey(Long partnerKey) {
    this.partnerKey = partnerKey;
  }

  public ContactDetails email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(example = "abc@tcs.com", description = "")
  
    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ContactDetails mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Get mobile
   * @return mobile
   **/
  @Schema(example = "9057340573", description = "")
  
    public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public ContactDetails telephone(String telephone) {
    this.telephone = telephone;
    return this;
  }

  /**
   * Get telephone
   * @return telephone
   **/
  @Schema(example = "03327340573", description = "")
  
    public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactDetails contactDetails = (ContactDetails) o;
    return Objects.equals(this.partnerKey, contactDetails.partnerKey) &&
        Objects.equals(this.email, contactDetails.email) &&
        Objects.equals(this.mobile, contactDetails.mobile) &&
        Objects.equals(this.telephone, contactDetails.telephone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerKey, email, mobile, telephone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDetails {\n");
    
    sb.append("    partnerKey: ").append(toIndentedString(partnerKey)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
