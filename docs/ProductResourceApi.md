# ProductResourceApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findProductsByVendor**](ProductResourceApi.md#findProductsByVendor) | **GET** /api/v1/products/vendor/{vendorId} | findProductsByVendor
[**getAllProducts**](ProductResourceApi.md#getAllProducts) | **GET** /api/v2/products | getAllProducts


<a name="findProductsByVendor"></a>
# **findProductsByVendor**
> java.util.List&lt;ProductDTO&gt; findProductsByVendor(vendorId)

findProductsByVendor

Required permissions: CAN_GET_PRODUCTS_BY_VENDOR

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.ProductResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

ProductResourceApi apiInstance = new ProductResourceApi();
Long vendorId = 789L; // Long | the internal vendor id
try {
    java.util.List<ProductDTO> result = apiInstance.findProductsByVendor(vendorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductResourceApi#findProductsByVendor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vendorId** | **Long**| the internal vendor id |

### Return type

[**java.util.List&lt;ProductDTO&gt;**](ProductDTO.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllProducts"></a>
# **getAllProducts**
> java.util.List&lt;ProductDTO&gt; getAllProducts(query, size, page, sortBy, sortOrder, type, tagFilter, tagFilterMode)

getAllProducts

Required permissions: CAN_GET_PRODUCTS

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.ProductResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

ProductResourceApi apiInstance = new ProductResourceApi();
String query = "query_example"; // String | query text
Integer size = 56; // Integer | quantity of listed records on page
Integer page = 56; // Integer | listing starts from page value
String sortBy = "sortBy_example"; // String | sort by
String sortOrder = "sortOrder_example"; // String | sort order
String type = "type_example"; // String | product type
java.util.List<String> tagFilter = Arrays.asList("tagFilter_example"); // java.util.List<String> | tagFilter
String tagFilterMode = "tagFilterMode_example"; // String | tagFilterMode
try {
    java.util.List<ProductDTO> result = apiInstance.getAllProducts(query, size, page, sortBy, sortOrder, type, tagFilter, tagFilterMode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductResourceApi#getAllProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query text | [optional]
 **size** | **Integer**| quantity of listed records on page | [optional]
 **page** | **Integer**| listing starts from page value | [optional]
 **sortBy** | **String**| sort by | [optional] [enum: ID, NAME, PRICE, RETAIL_PRICE, RECHARGE, VENDOR]
 **sortOrder** | **String**| sort order | [optional] [enum: ASC, DESC]
 **type** | **String**| product type | [optional] [enum: BASIC_SINGLE, BASIC_VALID_HOURS, PASS_LIMITED, PASS_UNLIMITED, PASS_CALENDAR, FLEXPASS, PASS_CURRENCY]
 **tagFilter** | [**java.util.List&lt;String&gt;**](String.md)| tagFilter | [optional]
 **tagFilterMode** | **String**| tagFilterMode | [optional] [enum: AND, OR]

### Return type

[**java.util.List&lt;ProductDTO&gt;**](ProductDTO.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

