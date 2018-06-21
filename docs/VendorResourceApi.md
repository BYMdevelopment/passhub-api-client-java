# VendorResourceApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllVendors**](VendorResourceApi.md#getAllVendors) | **GET** /api/v2/vendors | getAllVendors


<a name="getAllVendors"></a>
# **getAllVendors**
> java.util.List&lt;VendorDetailDTO&gt; getAllVendors(query, size, page, sortBy, sortOrder)

getAllVendors

Required permissions: CAN_GET_VENDORS

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.VendorResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

VendorResourceApi apiInstance = new VendorResourceApi();
String query = "query_example"; // String | query text
Integer size = 56; // Integer | quantity of listed records on page
Integer page = 56; // Integer | listing starts from page value
String sortBy = "sortBy_example"; // String | sort by
String sortOrder = "sortOrder_example"; // String | sort order
try {
    java.util.List<VendorDetailDTO> result = apiInstance.getAllVendors(query, size, page, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VendorResourceApi#getAllVendors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query text | [optional]
 **size** | **Integer**| quantity of listed records on page | [optional]
 **page** | **Integer**| listing starts from page value | [optional]
 **sortBy** | **String**| sort by | [optional] [enum: ID, NAME]
 **sortOrder** | **String**| sort order | [optional] [enum: ASC, DESC]

### Return type

[**java.util.List&lt;VendorDetailDTO&gt;**](VendorDetailDTO.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

