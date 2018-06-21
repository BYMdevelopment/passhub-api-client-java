# OrderRecordResourceApi

All URIs are relative to *https://localhost:8090*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrderRecord**](OrderRecordResourceApi.md#createOrderRecord) | **POST** /api/v1/orderRecords | createOrderRecord
[**getAllOrderRecords**](OrderRecordResourceApi.md#getAllOrderRecords) | **GET** /api/v2/orderRecords | getAllOrderRecords
[**getOrderRecord**](OrderRecordResourceApi.md#getOrderRecord) | **GET** /api/v1/orderRecords/{id} | getOrderRecord
[**mergeVouchers**](OrderRecordResourceApi.md#mergeVouchers) | **POST** /api/v1/orderRecords/mergeVouchers | mergeVouchers
[**updateOrderRecord**](OrderRecordResourceApi.md#updateOrderRecord) | **PUT** /api/v1/orderRecords | updateOrderRecord


<a name="createOrderRecord"></a>
# **createOrderRecord**
> OrderRecordDTO createOrderRecord(orderRecordDto)

createOrderRecord

1) Cellphone number must be in E.164 format;&lt;br/&gt;2) «PricePaid» is a price for 1 product;&lt;br/&gt;3) Required permissions: CAN_CREATE_ORDER.

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.OrderRecordResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

OrderRecordResourceApi apiInstance = new OrderRecordResourceApi();
OrderRecordDTO orderRecordDto = new OrderRecordDTO(); // OrderRecordDTO | the OrderRecord Dto
try {
    OrderRecordDTO result = apiInstance.createOrderRecord(orderRecordDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderRecordResourceApi#createOrderRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRecordDto** | [**OrderRecordDTO**](OrderRecordDTO.md)| the OrderRecord Dto |

### Return type

[**OrderRecordDTO**](OrderRecordDTO.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllOrderRecords"></a>
# **getAllOrderRecords**
> java.util.List&lt;OrderRecordExtendDTO&gt; getAllOrderRecords(query, from, till, timeZone, deliveryMethod, deliveryStatus, size, page, sortBy, sortOrder)

getAllOrderRecords

Required permissions: CAN_GET_ORDERS

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.OrderRecordResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

OrderRecordResourceApi apiInstance = new OrderRecordResourceApi();
String query = "query_example"; // String | query text
String from = "from_example"; // String | Begin the of date range, format: YYYY-MM-DD (e.g. 2016-01-25)
String till = "till_example"; // String | End the of date range, format: YYYY-MM-DD (e.g. 2016-01-25)
String timeZone = "timeZone_example"; // String | A timezone for date/time representation. Example: America/Chicago or EST. If zone is not set, then UTC timezone will be used.
String deliveryMethod = "deliveryMethod_example"; // String | delivery method
String deliveryStatus = "deliveryStatus_example"; // String | status of delivery
Integer size = 56; // Integer | quantity of listed records on page
Integer page = 56; // Integer | listing starts from page value
String sortBy = "sortBy_example"; // String | sort by
String sortOrder = "sortOrder_example"; // String | sort order
try {
    java.util.List<OrderRecordExtendDTO> result = apiInstance.getAllOrderRecords(query, from, till, timeZone, deliveryMethod, deliveryStatus, size, page, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderRecordResourceApi#getAllOrderRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| query text | [optional]
 **from** | **String**| Begin the of date range, format: YYYY-MM-DD (e.g. 2016-01-25) | [optional]
 **till** | **String**| End the of date range, format: YYYY-MM-DD (e.g. 2016-01-25) | [optional]
 **timeZone** | **String**| A timezone for date/time representation. Example: America/Chicago or EST. If zone is not set, then UTC timezone will be used. | [optional]
 **deliveryMethod** | **String**| delivery method | [optional] [enum: ALL, DIGITAL, SHIPPING]
 **deliveryStatus** | **String**| status of delivery | [optional] [enum: ALL, ASSIGN_REQUIRED, SHIPMENT_CREATION, LABEL_PRINTING, PICKUP_REQUIRED, PROCESSED]
 **size** | **Integer**| quantity of listed records on page | [optional]
 **page** | **Integer**| listing starts from page value | [optional]
 **sortBy** | **String**| sort by | [optional] [enum: ID, AMOUNT, ORDER_ID, ORIGINATOR, ORIGINATOR_ORDER_ID, VENDOR_ORDER_ID, CREATED_BY, NAME, DELIVERY_STATUS, DELIVERY_METHOD]
 **sortOrder** | **String**| sort order | [optional] [enum: ASC, DESC]

### Return type

[**java.util.List&lt;OrderRecordExtendDTO&gt;**](OrderRecordExtendDTO.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOrderRecord"></a>
# **getOrderRecord**
> OrderRecordExtendDTO getOrderRecord(id)

getOrderRecord

Required permissions: CAN_GET_ORDERS

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.OrderRecordResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

OrderRecordResourceApi apiInstance = new OrderRecordResourceApi();
Long id = 789L; // Long | the internal id of order
try {
    OrderRecordExtendDTO result = apiInstance.getOrderRecord(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderRecordResourceApi#getOrderRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| the internal id of order |

### Return type

[**OrderRecordExtendDTO**](OrderRecordExtendDTO.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mergeVouchers"></a>
# **mergeVouchers**
> GenericStatusDTO mergeVouchers(orderId, newVoucherId)

mergeVouchers

Replaces voucher IDs of order items with new voucher ID in the specified order. All groups are merged to one &#39;MergedGroup&#39;.&lt;br/&gt;Required permissions: CAN_EDIT_ORDER

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.OrderRecordResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

OrderRecordResourceApi apiInstance = new OrderRecordResourceApi();
Long orderId = 789L; // Long | the internal id of order
String newVoucherId = "newVoucherId_example"; // String | newVoucherId
try {
    GenericStatusDTO result = apiInstance.mergeVouchers(orderId, newVoucherId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderRecordResourceApi#mergeVouchers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Long**| the internal id of order |
 **newVoucherId** | **String**| newVoucherId |

### Return type

[**GenericStatusDTO**](GenericStatusDTO.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateOrderRecord"></a>
# **updateOrderRecord**
> OrderRecordDTO updateOrderRecord(orderRecordDto)

updateOrderRecord

1) Cellphone number must be in E.164 format;&lt;br/&gt;2) «PricePaid» is a price for 1 product;&lt;br/&gt;3) Required permissions: CAN_EDIT_ORDER.

### Example
```java
// Import classes:
//import com.bymdev.voucherhub.ApiClient;
//import com.bymdev.voucherhub.ApiException;
//import com.bymdev.voucherhub.Configuration;
//import com.bymdev.voucherhub.auth.*;
//import com.bymdev.voucherhub.api.OrderRecordResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: X-Api-Key
ApiKeyAuth X-Api-Key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
X-Api-Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//X-Api-Key.setApiKeyPrefix("Token");

OrderRecordResourceApi apiInstance = new OrderRecordResourceApi();
OrderRecordDTO orderRecordDto = new OrderRecordDTO(); // OrderRecordDTO | the OrderRecord Dto
try {
    OrderRecordDTO result = apiInstance.updateOrderRecord(orderRecordDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderRecordResourceApi#updateOrderRecord");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderRecordDto** | [**OrderRecordDTO**](OrderRecordDTO.md)| the OrderRecord Dto |

### Return type

[**OrderRecordDTO**](OrderRecordDTO.md)

### Authorization

[X-Api-Key](../README.md#X-Api-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

