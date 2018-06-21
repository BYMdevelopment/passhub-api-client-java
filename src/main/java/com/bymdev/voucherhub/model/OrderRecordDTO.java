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
import com.bymdev.voucherhub.model.DeliveryDTO;
import com.bymdev.voucherhub.model.GroupEntryDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrderRecordDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T14:17:27.430+03:00")
public class OrderRecordDTO {
  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("cellPhoneNumber")
  private String cellPhoneNumber = null;

  @SerializedName("customerEmail")
  private String customerEmail = null;

  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("delivery")
  private DeliveryDTO delivery = null;

  /**
   * Gets or Sets deliveryMethod
   */
  @JsonAdapter(DeliveryMethodEnum.Adapter.class)
  public enum DeliveryMethodEnum {
    DIGITAL("DIGITAL"),
    
    SHIPPING("SHIPPING");

    private String value;

    DeliveryMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeliveryMethodEnum fromValue(String text) {
      for (DeliveryMethodEnum b : DeliveryMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeliveryMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeliveryMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeliveryMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeliveryMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("deliveryMethod")
  private DeliveryMethodEnum deliveryMethod = null;

  @SerializedName("groups")
  private java.util.List<GroupEntryDTO> groups = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("isCanceled")
  private Boolean isCanceled = null;

  @SerializedName("isTest")
  private Boolean isTest = null;

  @SerializedName("orderId")
  private String orderId = null;

  @SerializedName("originatorOrderId")
  private String originatorOrderId = null;

  @SerializedName("originiator")
  private String originiator = null;

  @SerializedName("vendorOrderId")
  private String vendorOrderId = null;

  public OrderRecordDTO amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public OrderRecordDTO cellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
    return this;
  }

   /**
   * Get cellPhoneNumber
   * @return cellPhoneNumber
  **/
  @ApiModelProperty(value = "")
  public String getCellPhoneNumber() {
    return cellPhoneNumber;
  }

  public void setCellPhoneNumber(String cellPhoneNumber) {
    this.cellPhoneNumber = cellPhoneNumber;
  }

  public OrderRecordDTO customerEmail(String customerEmail) {
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

  public OrderRecordDTO customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public OrderRecordDTO delivery(DeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  @ApiModelProperty(value = "")
  public DeliveryDTO getDelivery() {
    return delivery;
  }

  public void setDelivery(DeliveryDTO delivery) {
    this.delivery = delivery;
  }

  public OrderRecordDTO deliveryMethod(DeliveryMethodEnum deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

   /**
   * Get deliveryMethod
   * @return deliveryMethod
  **/
  @ApiModelProperty(value = "")
  public DeliveryMethodEnum getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(DeliveryMethodEnum deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public OrderRecordDTO groups(java.util.List<GroupEntryDTO> groups) {
    this.groups = groups;
    return this;
  }

  public OrderRecordDTO addGroupsItem(GroupEntryDTO groupsItem) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(value = "")
  public java.util.List<GroupEntryDTO> getGroups() {
    return groups;
  }

  public void setGroups(java.util.List<GroupEntryDTO> groups) {
    this.groups = groups;
  }

  public OrderRecordDTO id(Long id) {
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

  public OrderRecordDTO isCanceled(Boolean isCanceled) {
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

  public OrderRecordDTO isTest(Boolean isTest) {
    this.isTest = isTest;
    return this;
  }

   /**
   * Get isTest
   * @return isTest
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsTest() {
    return isTest;
  }

  public void setIsTest(Boolean isTest) {
    this.isTest = isTest;
  }

  public OrderRecordDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderRecordDTO originatorOrderId(String originatorOrderId) {
    this.originatorOrderId = originatorOrderId;
    return this;
  }

   /**
   * Get originatorOrderId
   * @return originatorOrderId
  **/
  @ApiModelProperty(value = "")
  public String getOriginatorOrderId() {
    return originatorOrderId;
  }

  public void setOriginatorOrderId(String originatorOrderId) {
    this.originatorOrderId = originatorOrderId;
  }

  public OrderRecordDTO originiator(String originiator) {
    this.originiator = originiator;
    return this;
  }

   /**
   * Get originiator
   * @return originiator
  **/
  @ApiModelProperty(value = "")
  public String getOriginiator() {
    return originiator;
  }

  public void setOriginiator(String originiator) {
    this.originiator = originiator;
  }

  public OrderRecordDTO vendorOrderId(String vendorOrderId) {
    this.vendorOrderId = vendorOrderId;
    return this;
  }

   /**
   * Get vendorOrderId
   * @return vendorOrderId
  **/
  @ApiModelProperty(value = "")
  public String getVendorOrderId() {
    return vendorOrderId;
  }

  public void setVendorOrderId(String vendorOrderId) {
    this.vendorOrderId = vendorOrderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderRecordDTO orderRecordDTO = (OrderRecordDTO) o;
    return Objects.equals(this.amount, orderRecordDTO.amount) &&
        Objects.equals(this.cellPhoneNumber, orderRecordDTO.cellPhoneNumber) &&
        Objects.equals(this.customerEmail, orderRecordDTO.customerEmail) &&
        Objects.equals(this.customerId, orderRecordDTO.customerId) &&
        Objects.equals(this.delivery, orderRecordDTO.delivery) &&
        Objects.equals(this.deliveryMethod, orderRecordDTO.deliveryMethod) &&
        Objects.equals(this.groups, orderRecordDTO.groups) &&
        Objects.equals(this.id, orderRecordDTO.id) &&
        Objects.equals(this.isCanceled, orderRecordDTO.isCanceled) &&
        Objects.equals(this.isTest, orderRecordDTO.isTest) &&
        Objects.equals(this.orderId, orderRecordDTO.orderId) &&
        Objects.equals(this.originatorOrderId, orderRecordDTO.originatorOrderId) &&
        Objects.equals(this.originiator, orderRecordDTO.originiator) &&
        Objects.equals(this.vendorOrderId, orderRecordDTO.vendorOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, cellPhoneNumber, customerEmail, customerId, delivery, deliveryMethod, groups, id, isCanceled, isTest, orderId, originatorOrderId, originiator, vendorOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderRecordDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cellPhoneNumber: ").append(toIndentedString(cellPhoneNumber)).append("\n");
    sb.append("    customerEmail: ").append(toIndentedString(customerEmail)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isCanceled: ").append(toIndentedString(isCanceled)).append("\n");
    sb.append("    isTest: ").append(toIndentedString(isTest)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    originatorOrderId: ").append(toIndentedString(originatorOrderId)).append("\n");
    sb.append("    originiator: ").append(toIndentedString(originiator)).append("\n");
    sb.append("    vendorOrderId: ").append(toIndentedString(vendorOrderId)).append("\n");
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

