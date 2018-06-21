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
import com.bymdev.voucherhub.model.ValidationItemStatusDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ValidationResultEntry
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T18:51:48.018+03:00")
public class ValidationResultEntry {
  @SerializedName("customerName")
  private String customerName = null;

  /**
   * Gets or Sets customerType
   */
  @JsonAdapter(CustomerTypeEnum.Adapter.class)
  public enum CustomerTypeEnum {
    ADULT("ADULT"),
    
    CHILD("CHILD"),
    
    SENIOR("SENIOR");

    private String value;

    CustomerTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CustomerTypeEnum fromValue(String text) {
      for (CustomerTypeEnum b : CustomerTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CustomerTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CustomerTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CustomerTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CustomerTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("customerType")
  private CustomerTypeEnum customerType = null;

  @SerializedName("customerUid")
  private String customerUid = null;

  @SerializedName("productName")
  private String productName = null;

  @SerializedName("productSku")
  private String productSku = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("status")
  private ValidationItemStatusDTO status = null;

  public ValidationResultEntry customerName(String customerName) {
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

  public ValidationResultEntry customerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
    return this;
  }

   /**
   * Get customerType
   * @return customerType
  **/
  @ApiModelProperty(value = "")
  public CustomerTypeEnum getCustomerType() {
    return customerType;
  }

  public void setCustomerType(CustomerTypeEnum customerType) {
    this.customerType = customerType;
  }

  public ValidationResultEntry customerUid(String customerUid) {
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

  public ValidationResultEntry productName(String productName) {
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @ApiModelProperty(value = "")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ValidationResultEntry productSku(String productSku) {
    this.productSku = productSku;
    return this;
  }

   /**
   * Get productSku
   * @return productSku
  **/
  @ApiModelProperty(value = "")
  public String getProductSku() {
    return productSku;
  }

  public void setProductSku(String productSku) {
    this.productSku = productSku;
  }

  public ValidationResultEntry quantity(Integer quantity) {
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

  public ValidationResultEntry status(ValidationItemStatusDTO status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public ValidationItemStatusDTO getStatus() {
    return status;
  }

  public void setStatus(ValidationItemStatusDTO status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResultEntry validationResultEntry = (ValidationResultEntry) o;
    return Objects.equals(this.customerName, validationResultEntry.customerName) &&
        Objects.equals(this.customerType, validationResultEntry.customerType) &&
        Objects.equals(this.customerUid, validationResultEntry.customerUid) &&
        Objects.equals(this.productName, validationResultEntry.productName) &&
        Objects.equals(this.productSku, validationResultEntry.productSku) &&
        Objects.equals(this.quantity, validationResultEntry.quantity) &&
        Objects.equals(this.status, validationResultEntry.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerName, customerType, customerUid, productName, productSku, quantity, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResultEntry {\n");
    
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    customerUid: ").append(toIndentedString(customerUid)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productSku: ").append(toIndentedString(productSku)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

