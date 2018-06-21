# VoucherResourceApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelValidation**](VoucherResourceApi.md#cancelValidation) | **POST** /api/v2/voucher/validate/cancel | [V2] Cancel validation for the voucher
[**cancelVoucher**](VoucherResourceApi.md#cancelVoucher) | **POST** /api/v1/voucher/cancel | cancelVoucher
[**convertVoucher**](VoucherResourceApi.md#convertVoucher) | **POST** /api/v1/voucher/convert | convertVoucher
[**validateVoucher**](VoucherResourceApi.md#validateVoucher) | **POST** /api/v2/voucher/validate | [V2] Validates voucher which represents single order item or group of them.


<a name="cancelValidation"></a>
# **cancelValidation**
> GenericStatusDTO cancelValidation(transactionTag, reason, note)

[V2] Cancel validation for the voucher

Required permissions: CAN_CANCEL_VALIDATION

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.VoucherResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

VoucherResourceApi apiInstance = new VoucherResourceApi();
String transactionTag = "transactionTag_example"; // String | the transaction tag of validation
String reason = "reason_example"; // String | the reason of validation
OrderNoteParamDTO note = new OrderNoteParamDTO(); // OrderNoteParamDTO | the validation note dto
try {
    GenericStatusDTO result = apiInstance.cancelValidation(transactionTag, reason, note);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherResourceApi#cancelValidation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionTag** | **String**| the transaction tag of validation |
 **reason** | **String**| the reason of validation | [optional] [enum: GENERAL, REPRINT]
 **note** | [**OrderNoteParamDTO**](OrderNoteParamDTO.md)| the validation note dto | [optional]

### Return type

[**GenericStatusDTO**](GenericStatusDTO.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelVoucher"></a>
# **cancelVoucher**
> GenericStatusDTO cancelVoucher(orderId, voucherId, note)

cancelVoucher

Required permissions: CAN_CANCEL_ORDER

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.VoucherResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

VoucherResourceApi apiInstance = new VoucherResourceApi();
Long orderId = 789L; // Long | the internal id of order
String voucherId = "voucherId_example"; // String | the voucher id
OrderNoteParamDTO note = new OrderNoteParamDTO(); // OrderNoteParamDTO | the voucher note dto
try {
    GenericStatusDTO result = apiInstance.cancelVoucher(orderId, voucherId, note);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherResourceApi#cancelVoucher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| the internal id of order |
 **voucherId** | **String**| the voucher id | [optional]
 **note** | [**OrderNoteParamDTO**](OrderNoteParamDTO.md)| the voucher note dto | [optional]

### Return type

[**GenericStatusDTO**](GenericStatusDTO.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="convertVoucher"></a>
# **convertVoucher**
> JSONObject convertVoucher(oldVoucherId, newVoucherId)

convertVoucher

Required permissions: CAN_CONVERT_VOUCHER

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.VoucherResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

VoucherResourceApi apiInstance = new VoucherResourceApi();
String oldVoucherId = "oldVoucherId_example"; // String | the old voucher id
String newVoucherId = "newVoucherId_example"; // String | the new voucher id
try {
    JSONObject result = apiInstance.convertVoucher(oldVoucherId, newVoucherId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherResourceApi#convertVoucher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **oldVoucherId** | **String**| the old voucher id |
 **newVoucherId** | **String**| the new voucher id |

### Return type

[**JSONObject**](JSONObject.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validateVoucher"></a>
# **validateVoucher**
> ValidationResult validateVoucher(validationId, vendorId, productTag, orderItemIds, skipExpiryCheck, extraParamDTO)

[V2] Validates voucher which represents single order item or group of them.

Required permissions: CAN_VALIDATE;

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.VoucherResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

VoucherResourceApi apiInstance = new VoucherResourceApi();
String validationId = "validationId_example"; // String | the voucher validation id
Long vendorId = 789L; // Long | the internal id of vendor
String productTag = "productTag_example"; // String | the product tag
java.util.List<Long> orderItemIds = Arrays.asList(56L); // java.util.List<Long> | the array of order item ids
Boolean skipExpiryCheck = true; // Boolean | flag to skip expiry check within strategy
ExtraValidationParamDTO extraParamDTO = new ExtraValidationParamDTO(); // ExtraValidationParamDTO | the validation extra params dto
try {
    ValidationResult result = apiInstance.validateVoucher(validationId, vendorId, productTag, orderItemIds, skipExpiryCheck, extraParamDTO);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VoucherResourceApi#validateVoucher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **validationId** | **String**| the voucher validation id |
 **vendorId** | **Long**| the internal id of vendor |
 **productTag** | **String**| the product tag | [optional]
 **orderItemIds** | [**java.util.List&lt;Long&gt;**](Long.md)| the array of order item ids | [optional]
 **skipExpiryCheck** | **Boolean**| flag to skip expiry check within strategy | [optional]
 **extraParamDTO** | [**ExtraValidationParamDTO**](ExtraValidationParamDTO.md)| the validation extra params dto | [optional]

### Return type

[**ValidationResult**](ValidationResult.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

