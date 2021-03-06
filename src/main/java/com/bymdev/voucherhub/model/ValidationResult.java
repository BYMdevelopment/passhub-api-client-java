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
import com.bymdev.voucherhub.model.ProductSuggestion;
import com.bymdev.voucherhub.model.RechargePrompt;
import com.bymdev.voucherhub.model.SuggestedOrder;
import com.bymdev.voucherhub.model.UniversalAttribute;
import com.bymdev.voucherhub.model.ValidationResultEntry;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ValidationResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-21T18:51:48.018+03:00")
public class ValidationResult {
  @SerializedName("canSkipExpiryCheck")
  private Boolean canSkipExpiryCheck = null;

  @SerializedName("contractHolderId")
  private String contractHolderId = null;

  @SerializedName("contractHolderName")
  private String contractHolderName = null;

  /**
   * Gets or Sets errorCode
   */
  @JsonAdapter(ErrorCodeEnum.Adapter.class)
  public enum ErrorCodeEnum {
    VALIDATION_ID_NOT_FOUND("VALIDATION_ID_NOT_FOUND"),
    
    REQUESTED_PRODUCT_NOT_FOUND("REQUESTED_PRODUCT_NOT_FOUND"),
    
    REQUESTED_PRODUCT_USED("REQUESTED_PRODUCT_USED"),
    
    VALIDATION_FAILED("VALIDATION_FAILED"),
    
    INSUFFICIENT_CURRENCY_AMOUNT("INSUFFICIENT_CURRENCY_AMOUNT"),
    
    NOT_VALIDATABLE_PRODUCT("NOT_VALIDATABLE_PRODUCT"),
    
    MAX_NUMBER_OF_USES_REACHED("MAX_NUMBER_OF_USES_REACHED"),
    
    VOUCHER_EXPIRED("VOUCHER_EXPIRED"),
    
    VALIDATION_BLOCKED_DATES("VALIDATION_BLOCKED_DATES"),
    
    VALIDATION_BLOCKED_TIME("VALIDATION_BLOCKED_TIME"),
    
    VALIDATION_BLOCKED_DAYS("VALIDATION_BLOCKED_DAYS"),
    
    SYSTEMS_SYNC_FAILED("SYSTEMS_SYNC_FAILED"),
    
    VALIDATIONS_PER_DAY_EXCEEDED("VALIDATIONS_PER_DAY_EXCEEDED"),
    
    WAITING_PERIOD_NOT_EXPIRED("WAITING_PERIOD_NOT_EXPIRED");

    private String value;

    ErrorCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ErrorCodeEnum fromValue(String text) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ErrorCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ErrorCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ErrorCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ErrorCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("errorCode")
  private ErrorCodeEnum errorCode = null;

  @SerializedName("extra")
  private java.util.Map<String, String> extra = null;

  @SerializedName("meta")
  private java.util.List<UniversalAttribute> meta = null;

  /**
   * Gets or Sets printStatus
   */
  @JsonAdapter(PrintStatusEnum.Adapter.class)
  public enum PrintStatusEnum {
    NOT_PRINTABLE("NOT_PRINTABLE"),
    
    PRINTED("PRINTED"),
    
    NEED_PRINTING("NEED_PRINTING");

    private String value;

    PrintStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PrintStatusEnum fromValue(String text) {
      for (PrintStatusEnum b : PrintStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PrintStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PrintStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PrintStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PrintStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("printStatus")
  private PrintStatusEnum printStatus = null;

  @SerializedName("recharge")
  private RechargePrompt recharge = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    
    CLARIFY("CLARIFY"),
    
    FAILURE("FAILURE"),
    
    CLARIFY_ORDER("CLARIFY_ORDER"),
    
    CLARIFY_ITEM("CLARIFY_ITEM");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("suggestedOrderItems")
  private java.util.List<SuggestedOrder> suggestedOrderItems = null;

  @SerializedName("suggestedProducts")
  private java.util.List<ProductSuggestion> suggestedProducts = null;

  @SerializedName("transactionTag")
  private String transactionTag = null;

  @SerializedName("validation")
  private java.util.List<ValidationResultEntry> validation = null;

  @SerializedName("validationDate")
  private String validationDate = null;

  @SerializedName("voucherId")
  private String voucherId = null;

  @SerializedName("waitingPeriodPending")
  private Integer waitingPeriodPending = null;

  public ValidationResult canSkipExpiryCheck(Boolean canSkipExpiryCheck) {
    this.canSkipExpiryCheck = canSkipExpiryCheck;
    return this;
  }

   /**
   * Get canSkipExpiryCheck
   * @return canSkipExpiryCheck
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanSkipExpiryCheck() {
    return canSkipExpiryCheck;
  }

  public void setCanSkipExpiryCheck(Boolean canSkipExpiryCheck) {
    this.canSkipExpiryCheck = canSkipExpiryCheck;
  }

  public ValidationResult contractHolderId(String contractHolderId) {
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

  public ValidationResult contractHolderName(String contractHolderName) {
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

  public ValidationResult errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")
  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }

  public ValidationResult extra(java.util.Map<String, String> extra) {
    this.extra = extra;
    return this;
  }

  public ValidationResult putExtraItem(String key, String extraItem) {
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

  public ValidationResult meta(java.util.List<UniversalAttribute> meta) {
    this.meta = meta;
    return this;
  }

  public ValidationResult addMetaItem(UniversalAttribute metaItem) {
    if (this.meta == null) {
      this.meta = new java.util.ArrayList<>();
    }
    this.meta.add(metaItem);
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UniversalAttribute> getMeta() {
    return meta;
  }

  public void setMeta(java.util.List<UniversalAttribute> meta) {
    this.meta = meta;
  }

  public ValidationResult printStatus(PrintStatusEnum printStatus) {
    this.printStatus = printStatus;
    return this;
  }

   /**
   * Get printStatus
   * @return printStatus
  **/
  @ApiModelProperty(value = "")
  public PrintStatusEnum getPrintStatus() {
    return printStatus;
  }

  public void setPrintStatus(PrintStatusEnum printStatus) {
    this.printStatus = printStatus;
  }

  public ValidationResult recharge(RechargePrompt recharge) {
    this.recharge = recharge;
    return this;
  }

   /**
   * Get recharge
   * @return recharge
  **/
  @ApiModelProperty(value = "")
  public RechargePrompt getRecharge() {
    return recharge;
  }

  public void setRecharge(RechargePrompt recharge) {
    this.recharge = recharge;
  }

  public ValidationResult status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ValidationResult suggestedOrderItems(java.util.List<SuggestedOrder> suggestedOrderItems) {
    this.suggestedOrderItems = suggestedOrderItems;
    return this;
  }

  public ValidationResult addSuggestedOrderItemsItem(SuggestedOrder suggestedOrderItemsItem) {
    if (this.suggestedOrderItems == null) {
      this.suggestedOrderItems = new java.util.ArrayList<>();
    }
    this.suggestedOrderItems.add(suggestedOrderItemsItem);
    return this;
  }

   /**
   * Get suggestedOrderItems
   * @return suggestedOrderItems
  **/
  @ApiModelProperty(value = "")
  public java.util.List<SuggestedOrder> getSuggestedOrderItems() {
    return suggestedOrderItems;
  }

  public void setSuggestedOrderItems(java.util.List<SuggestedOrder> suggestedOrderItems) {
    this.suggestedOrderItems = suggestedOrderItems;
  }

  public ValidationResult suggestedProducts(java.util.List<ProductSuggestion> suggestedProducts) {
    this.suggestedProducts = suggestedProducts;
    return this;
  }

  public ValidationResult addSuggestedProductsItem(ProductSuggestion suggestedProductsItem) {
    if (this.suggestedProducts == null) {
      this.suggestedProducts = new java.util.ArrayList<>();
    }
    this.suggestedProducts.add(suggestedProductsItem);
    return this;
  }

   /**
   * Get suggestedProducts
   * @return suggestedProducts
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ProductSuggestion> getSuggestedProducts() {
    return suggestedProducts;
  }

  public void setSuggestedProducts(java.util.List<ProductSuggestion> suggestedProducts) {
    this.suggestedProducts = suggestedProducts;
  }

  public ValidationResult transactionTag(String transactionTag) {
    this.transactionTag = transactionTag;
    return this;
  }

   /**
   * Get transactionTag
   * @return transactionTag
  **/
  @ApiModelProperty(value = "")
  public String getTransactionTag() {
    return transactionTag;
  }

  public void setTransactionTag(String transactionTag) {
    this.transactionTag = transactionTag;
  }

  public ValidationResult validation(java.util.List<ValidationResultEntry> validation) {
    this.validation = validation;
    return this;
  }

  public ValidationResult addValidationItem(ValidationResultEntry validationItem) {
    if (this.validation == null) {
      this.validation = new java.util.ArrayList<>();
    }
    this.validation.add(validationItem);
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ValidationResultEntry> getValidation() {
    return validation;
  }

  public void setValidation(java.util.List<ValidationResultEntry> validation) {
    this.validation = validation;
  }

  public ValidationResult validationDate(String validationDate) {
    this.validationDate = validationDate;
    return this;
  }

   /**
   * Get validationDate
   * @return validationDate
  **/
  @ApiModelProperty(value = "")
  public String getValidationDate() {
    return validationDate;
  }

  public void setValidationDate(String validationDate) {
    this.validationDate = validationDate;
  }

  public ValidationResult voucherId(String voucherId) {
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

  public ValidationResult waitingPeriodPending(Integer waitingPeriodPending) {
    this.waitingPeriodPending = waitingPeriodPending;
    return this;
  }

   /**
   * Get waitingPeriodPending
   * @return waitingPeriodPending
  **/
  @ApiModelProperty(value = "")
  public Integer getWaitingPeriodPending() {
    return waitingPeriodPending;
  }

  public void setWaitingPeriodPending(Integer waitingPeriodPending) {
    this.waitingPeriodPending = waitingPeriodPending;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResult validationResult = (ValidationResult) o;
    return Objects.equals(this.canSkipExpiryCheck, validationResult.canSkipExpiryCheck) &&
        Objects.equals(this.contractHolderId, validationResult.contractHolderId) &&
        Objects.equals(this.contractHolderName, validationResult.contractHolderName) &&
        Objects.equals(this.errorCode, validationResult.errorCode) &&
        Objects.equals(this.extra, validationResult.extra) &&
        Objects.equals(this.meta, validationResult.meta) &&
        Objects.equals(this.printStatus, validationResult.printStatus) &&
        Objects.equals(this.recharge, validationResult.recharge) &&
        Objects.equals(this.status, validationResult.status) &&
        Objects.equals(this.suggestedOrderItems, validationResult.suggestedOrderItems) &&
        Objects.equals(this.suggestedProducts, validationResult.suggestedProducts) &&
        Objects.equals(this.transactionTag, validationResult.transactionTag) &&
        Objects.equals(this.validation, validationResult.validation) &&
        Objects.equals(this.validationDate, validationResult.validationDate) &&
        Objects.equals(this.voucherId, validationResult.voucherId) &&
        Objects.equals(this.waitingPeriodPending, validationResult.waitingPeriodPending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canSkipExpiryCheck, contractHolderId, contractHolderName, errorCode, extra, meta, printStatus, recharge, status, suggestedOrderItems, suggestedProducts, transactionTag, validation, validationDate, voucherId, waitingPeriodPending);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResult {\n");
    
    sb.append("    canSkipExpiryCheck: ").append(toIndentedString(canSkipExpiryCheck)).append("\n");
    sb.append("    contractHolderId: ").append(toIndentedString(contractHolderId)).append("\n");
    sb.append("    contractHolderName: ").append(toIndentedString(contractHolderName)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    printStatus: ").append(toIndentedString(printStatus)).append("\n");
    sb.append("    recharge: ").append(toIndentedString(recharge)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    suggestedOrderItems: ").append(toIndentedString(suggestedOrderItems)).append("\n");
    sb.append("    suggestedProducts: ").append(toIndentedString(suggestedProducts)).append("\n");
    sb.append("    transactionTag: ").append(toIndentedString(transactionTag)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    validationDate: ").append(toIndentedString(validationDate)).append("\n");
    sb.append("    voucherId: ").append(toIndentedString(voucherId)).append("\n");
    sb.append("    waitingPeriodPending: ").append(toIndentedString(waitingPeriodPending)).append("\n");
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

