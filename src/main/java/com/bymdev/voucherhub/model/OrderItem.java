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
import com.bymdev.voucherhub.model.SimpleMetadata;
import com.bymdev.voucherhub.model.SimpleProductDTO;
import com.bymdev.voucherhub.model.UserDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrderItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T14:17:27.430+03:00")
public class OrderItem {
  @SerializedName("aliasVoucherIds")
  private java.util.List<String> aliasVoucherIds = null;

  @SerializedName("contractHolderId")
  private String contractHolderId = null;

  @SerializedName("contractHolderName")
  private String contractHolderName = null;

  @SerializedName("customerCompany")
  private String customerCompany = null;

  @SerializedName("customerEmail")
  private String customerEmail = null;

  @SerializedName("customerName")
  private String customerName = null;

  @SerializedName("customerUid")
  private String customerUid = null;

  @SerializedName("expireDate")
  private String expireDate = null;

  @SerializedName("expiryDateBeforeValidtion")
  private String expiryDateBeforeValidtion = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("initVoucherId")
  private String initVoucherId = null;

  @SerializedName("isCanceled")
  private Boolean isCanceled = null;

  @SerializedName("isValidated")
  private Boolean isValidated = null;

  @SerializedName("metadata")
  private SimpleMetadata metadata = null;

  @SerializedName("originatorVoucherId")
  private String originatorVoucherId = null;

  @SerializedName("pricePaid")
  private Double pricePaid = null;

  @SerializedName("product")
  private SimpleProductDTO product = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("tourDate")
  private String tourDate = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("updatedBy")
  private UserDTO updatedBy = null;

  @SerializedName("validationId")
  private String validationId = null;

  @SerializedName("vendorVoucherId")
  private String vendorVoucherId = null;

  @SerializedName("voucherId")
  private String voucherId = null;

  public OrderItem aliasVoucherIds(java.util.List<String> aliasVoucherIds) {
    this.aliasVoucherIds = aliasVoucherIds;
    return this;
  }

  public OrderItem addAliasVoucherIdsItem(String aliasVoucherIdsItem) {
    if (this.aliasVoucherIds == null) {
      this.aliasVoucherIds = new java.util.ArrayList<>();
    }
    this.aliasVoucherIds.add(aliasVoucherIdsItem);
    return this;
  }

   /**
   * Get aliasVoucherIds
   * @return aliasVoucherIds
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getAliasVoucherIds() {
    return aliasVoucherIds;
  }

  public void setAliasVoucherIds(java.util.List<String> aliasVoucherIds) {
    this.aliasVoucherIds = aliasVoucherIds;
  }

  public OrderItem contractHolderId(String contractHolderId) {
    this.contractHolderId = contractHolderId;
    return this;
  }

   /**
   * Get contractHolderId
   * @return contractHolderId
  **/
  @ApiModelProperty(value = "")
  public String getContractHolderId() {
    return contractHolderId;
  }

  public void setContractHolderId(String contractHolderId) {
    this.contractHolderId = contractHolderId;
  }

  public OrderItem contractHolderName(String contractHolderName) {
    this.contractHolderName = contractHolderName;
    return this;
  }

   /**
   * Get contractHolderName
   * @return contractHolderName
  **/
  @ApiModelProperty(value = "")
  public String getContractHolderName() {
    return contractHolderName;
  }

  public void setContractHolderName(String contractHolderName) {
    this.contractHolderName = contractHolderName;
  }

  public OrderItem customerCompany(String customerCompany) {
    this.customerCompany = customerCompany;
    return this;
  }

   /**
   * Get customerCompany
   * @return customerCompany
  **/
  @ApiModelProperty(value = "")
  public String getCustomerCompany() {
    return customerCompany;
  }

  public void setCustomerCompany(String customerCompany) {
    this.customerCompany = customerCompany;
  }

  public OrderItem customerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
    return this;
  }

   /**
   * Get customerEmail
   * @return customerEmail
  **/
  @ApiModelProperty(value = "")
  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public OrderItem customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public OrderItem customerUid(String customerUid) {
    this.customerUid = customerUid;
    return this;
  }

   /**
   * Get customerUid
   * @return customerUid
  **/
  @ApiModelProperty(value = "")
  public String getCustomerUid() {
    return customerUid;
  }

  public void setCustomerUid(String customerUid) {
    this.customerUid = customerUid;
  }

  public OrderItem expireDate(String expireDate) {
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Get expireDate
   * @return expireDate
  **/
  @ApiModelProperty(value = "")
  public String getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }

  public OrderItem expiryDateBeforeValidtion(String expiryDateBeforeValidtion) {
    this.expiryDateBeforeValidtion = expiryDateBeforeValidtion;
    return this;
  }

   /**
   * Get expiryDateBeforeValidtion
   * @return expiryDateBeforeValidtion
  **/
  @ApiModelProperty(value = "")
  public String getExpiryDateBeforeValidtion() {
    return expiryDateBeforeValidtion;
  }

  public void setExpiryDateBeforeValidtion(String expiryDateBeforeValidtion) {
    this.expiryDateBeforeValidtion = expiryDateBeforeValidtion;
  }

  public OrderItem groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @ApiModelProperty(value = "")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public OrderItem id(Long id) {
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

  public OrderItem initVoucherId(String initVoucherId) {
    this.initVoucherId = initVoucherId;
    return this;
  }

   /**
   * Get initVoucherId
   * @return initVoucherId
  **/
  @ApiModelProperty(value = "")
  public String getInitVoucherId() {
    return initVoucherId;
  }

  public void setInitVoucherId(String initVoucherId) {
    this.initVoucherId = initVoucherId;
  }

  public OrderItem isCanceled(Boolean isCanceled) {
    this.isCanceled = isCanceled;
    return this;
  }

   /**
   * Get isCanceled
   * @return isCanceled
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsCanceled() {
    return isCanceled;
  }

  public void setIsCanceled(Boolean isCanceled) {
    this.isCanceled = isCanceled;
  }

  public OrderItem isValidated(Boolean isValidated) {
    this.isValidated = isValidated;
    return this;
  }

   /**
   * Get isValidated
   * @return isValidated
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsValidated() {
    return isValidated;
  }

  public void setIsValidated(Boolean isValidated) {
    this.isValidated = isValidated;
  }

  public OrderItem metadata(SimpleMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public SimpleMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(SimpleMetadata metadata) {
    this.metadata = metadata;
  }

  public OrderItem originatorVoucherId(String originatorVoucherId) {
    this.originatorVoucherId = originatorVoucherId;
    return this;
  }

   /**
   * Get originatorVoucherId
   * @return originatorVoucherId
  **/
  @ApiModelProperty(value = "")
  public String getOriginatorVoucherId() {
    return originatorVoucherId;
  }

  public void setOriginatorVoucherId(String originatorVoucherId) {
    this.originatorVoucherId = originatorVoucherId;
  }

  public OrderItem pricePaid(Double pricePaid) {
    this.pricePaid = pricePaid;
    return this;
  }

   /**
   * Get pricePaid
   * @return pricePaid
  **/
  @ApiModelProperty(value = "")
  public Double getPricePaid() {
    return pricePaid;
  }

  public void setPricePaid(Double pricePaid) {
    this.pricePaid = pricePaid;
  }

  public OrderItem product(SimpleProductDTO product) {
    this.product = product;
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")
  public SimpleProductDTO getProduct() {
    return product;
  }

  public void setProduct(SimpleProductDTO product) {
    this.product = product;
  }

  public OrderItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderItem sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public OrderItem tourDate(String tourDate) {
    this.tourDate = tourDate;
    return this;
  }

   /**
   * Get tourDate
   * @return tourDate
  **/
  @ApiModelProperty(value = "")
  public String getTourDate() {
    return tourDate;
  }

  public void setTourDate(String tourDate) {
    this.tourDate = tourDate;
  }

  public OrderItem updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(value = "")
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public OrderItem updatedBy(UserDTO updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * @return updatedBy
  **/
  @ApiModelProperty(value = "")
  public UserDTO getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(UserDTO updatedBy) {
    this.updatedBy = updatedBy;
  }

  public OrderItem validationId(String validationId) {
    this.validationId = validationId;
    return this;
  }

   /**
   * Get validationId
   * @return validationId
  **/
  @ApiModelProperty(value = "")
  public String getValidationId() {
    return validationId;
  }

  public void setValidationId(String validationId) {
    this.validationId = validationId;
  }

  public OrderItem vendorVoucherId(String vendorVoucherId) {
    this.vendorVoucherId = vendorVoucherId;
    return this;
  }

   /**
   * Get vendorVoucherId
   * @return vendorVoucherId
  **/
  @ApiModelProperty(value = "")
  public String getVendorVoucherId() {
    return vendorVoucherId;
  }

  public void setVendorVoucherId(String vendorVoucherId) {
    this.vendorVoucherId = vendorVoucherId;
  }

  public OrderItem voucherId(String voucherId) {
    this.voucherId = voucherId;
    return this;
  }

   /**
   * Get voucherId
   * @return voucherId
  **/
  @ApiModelProperty(value = "")
  public String getVoucherId() {
    return voucherId;
  }

  public void setVoucherId(String voucherId) {
    this.voucherId = voucherId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.aliasVoucherIds, orderItem.aliasVoucherIds) &&
        Objects.equals(this.contractHolderId, orderItem.contractHolderId) &&
        Objects.equals(this.contractHolderName, orderItem.contractHolderName) &&
        Objects.equals(this.customerCompany, orderItem.customerCompany) &&
        Objects.equals(this.customerEmail, orderItem.customerEmail) &&
        Objects.equals(this.customerName, orderItem.customerName) &&
        Objects.equals(this.customerUid, orderItem.customerUid) &&
        Objects.equals(this.expireDate, orderItem.expireDate) &&
        Objects.equals(this.expiryDateBeforeValidtion, orderItem.expiryDateBeforeValidtion) &&
        Objects.equals(this.groupName, orderItem.groupName) &&
        Objects.equals(this.id, orderItem.id) &&
        Objects.equals(this.initVoucherId, orderItem.initVoucherId) &&
        Objects.equals(this.isCanceled, orderItem.isCanceled) &&
        Objects.equals(this.isValidated, orderItem.isValidated) &&
        Objects.equals(this.metadata, orderItem.metadata) &&
        Objects.equals(this.originatorVoucherId, orderItem.originatorVoucherId) &&
        Objects.equals(this.pricePaid, orderItem.pricePaid) &&
        Objects.equals(this.product, orderItem.product) &&
        Objects.equals(this.quantity, orderItem.quantity) &&
        Objects.equals(this.sku, orderItem.sku) &&
        Objects.equals(this.tourDate, orderItem.tourDate) &&
        Objects.equals(this.updated, orderItem.updated) &&
        Objects.equals(this.updatedBy, orderItem.updatedBy) &&
        Objects.equals(this.validationId, orderItem.validationId) &&
        Objects.equals(this.vendorVoucherId, orderItem.vendorVoucherId) &&
        Objects.equals(this.voucherId, orderItem.voucherId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aliasVoucherIds, contractHolderId, contractHolderName, customerCompany, customerEmail, customerName, customerUid, expireDate, expiryDateBeforeValidtion, groupName, id, initVoucherId, isCanceled, isValidated, metadata, originatorVoucherId, pricePaid, product, quantity, sku, tourDate, updated, updatedBy, validationId, vendorVoucherId, voucherId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    aliasVoucherIds: ").append(toIndentedString(aliasVoucherIds)).append("\n");
    sb.append("    contractHolderId: ").append(toIndentedString(contractHolderId)).append("\n");
    sb.append("    contractHolderName: ").append(toIndentedString(contractHolderName)).append("\n");
    sb.append("    customerCompany: ").append(toIndentedString(customerCompany)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerUid: ").append(toIndentedString(customerUid)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    expiryDateBeforeValidtion: ").append(toIndentedString(expiryDateBeforeValidtion)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initVoucherId: ").append(toIndentedString(initVoucherId)).append("\n");
    sb.append("    isCanceled: ").append(toIndentedString(isCanceled)).append("\n");
    sb.append("    isValidated: ").append(toIndentedString(isValidated)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    originatorVoucherId: ").append(toIndentedString(originatorVoucherId)).append("\n");
    sb.append("    pricePaid: ").append(toIndentedString(pricePaid)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    tourDate: ").append(toIndentedString(tourDate)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    validationId: ").append(toIndentedString(validationId)).append("\n");
    sb.append("    vendorVoucherId: ").append(toIndentedString(vendorVoucherId)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
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

