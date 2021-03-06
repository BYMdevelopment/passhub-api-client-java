/*
 * PassHub API
 * PassHub API documentation
 *
 * OpenAPI spec version: 1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bymdev.voucherhub.model;

import java.util.Objects;
import com.bymdev.voucherhub.model.UserCompactDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VendorDetailDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T18:51:48.018+03:00")
public class VendorDetailDTO {
  @SerializedName("allowManual")
  private Boolean allowManual = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("users")
  private java.util.List<UserCompactDTO> users = null;

  public VendorDetailDTO allowManual(Boolean allowManual) {
    this.allowManual = allowManual;
    return this;
  }

   /**
   * Get allowManual
   * @return allowManual
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllowManual() {
    return allowManual;
  }

  public void setAllowManual(Boolean allowManual) {
    this.allowManual = allowManual;
  }

  public VendorDetailDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public VendorDetailDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VendorDetailDTO users(java.util.List<UserCompactDTO> users) {
    this.users = users;
    return this;
  }

  public VendorDetailDTO addUsersItem(UserCompactDTO usersItem) {
    if (this.users == null) {
      this.users = new java.util.ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * Get users
   * @return users
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UserCompactDTO> getUsers() {
    return users;
  }

  public void setUsers(java.util.List<UserCompactDTO> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorDetailDTO vendorDetailDTO = (VendorDetailDTO) o;
    return Objects.equals(this.allowManual, vendorDetailDTO.allowManual) &&
        Objects.equals(this.id, vendorDetailDTO.id) &&
        Objects.equals(this.name, vendorDetailDTO.name) &&
        Objects.equals(this.users, vendorDetailDTO.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowManual, id, name, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorDetailDTO {\n");
    
    sb.append("    allowManual: ").append(toIndentedString(allowManual)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

