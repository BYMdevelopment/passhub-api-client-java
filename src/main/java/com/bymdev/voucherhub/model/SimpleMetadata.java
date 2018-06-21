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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SimpleMetadata
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T14:17:27.430+03:00")
public class SimpleMetadata {
  @SerializedName("extra")
  private java.util.Map<String, String> extra = null;

  @SerializedName("passCurrencyAmount")
  private Double passCurrencyAmount = null;

  public SimpleMetadata extra(java.util.Map<String, String> extra) {
    this.extra = extra;
    return this;
  }

  public SimpleMetadata putExtraItem(String key, String extraItem) {
    if (this.extra == null) {
      this.extra = new java.util.HashMap<>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @ApiModelProperty(value = "")
  public java.util.Map<String, String> getExtra() {
    return extra;
  }

  public void setExtra(java.util.Map<String, String> extra) {
    this.extra = extra;
  }

  public SimpleMetadata passCurrencyAmount(Double passCurrencyAmount) {
    this.passCurrencyAmount = passCurrencyAmount;
    return this;
  }

   /**
   * Get passCurrencyAmount
   * @return passCurrencyAmount
  **/
  @ApiModelProperty(value = "")
  public Double getPassCurrencyAmount() {
    return passCurrencyAmount;
  }

  public void setPassCurrencyAmount(Double passCurrencyAmount) {
    this.passCurrencyAmount = passCurrencyAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleMetadata simpleMetadata = (SimpleMetadata) o;
    return Objects.equals(this.extra, simpleMetadata.extra) &&
        Objects.equals(this.passCurrencyAmount, simpleMetadata.passCurrencyAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, passCurrencyAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleMetadata {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    passCurrencyAmount: ").append(toIndentedString(passCurrencyAmount)).append("\n");
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
