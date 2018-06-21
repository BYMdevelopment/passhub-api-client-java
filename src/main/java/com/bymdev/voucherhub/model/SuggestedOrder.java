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
import com.bymdev.voucherhub.model.SuggestedOrderItem;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SuggestedOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T14:17:27.430+03:00")
public class SuggestedOrder {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("items")
  private java.util.List<SuggestedOrderItem> items = null;

  @SerializedName("orderId")
  private String orderId = null;

  @SerializedName("originator")
  private String originator = null;

  public SuggestedOrder id(Long id) {
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

  public SuggestedOrder items(java.util.List<SuggestedOrderItem> items) {
    this.items = items;
    return this;
  }

  public SuggestedOrder addItemsItem(SuggestedOrderItem itemsItem) {
    if (this.items == null) {
      this.items = new java.util.ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SuggestedOrderItem> getItems() {
    return items;
  }

  public void setItems(java.util.List<SuggestedOrderItem> items) {
    this.items = items;
  }

  public SuggestedOrder orderId(String orderId) {
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

  public SuggestedOrder originator(String originator) {
    this.originator = originator;
    return this;
  }

   /**
   * Get originator
   * @return originator
  **/
  @ApiModelProperty(value = "")
  public String getOriginator() {
    return originator;
  }

  public void setOriginator(String originator) {
    this.originator = originator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestedOrder suggestedOrder = (SuggestedOrder) o;
    return Objects.equals(this.id, suggestedOrder.id) &&
        Objects.equals(this.items, suggestedOrder.items) &&
        Objects.equals(this.orderId, suggestedOrder.orderId) &&
        Objects.equals(this.originator, suggestedOrder.originator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, items, orderId, originator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedOrder {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
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

