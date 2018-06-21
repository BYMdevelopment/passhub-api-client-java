
# OrderRecordDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Double** |  |  [optional]
**cellPhoneNumber** | **String** |  |  [optional]
**customerEmail** | **String** |  |  [optional]
**customerId** | **String** |  |  [optional]
**delivery** | [**DeliveryDTO**](DeliveryDTO.md) |  |  [optional]
**deliveryMethod** | [**DeliveryMethodEnum**](#DeliveryMethodEnum) |  |  [optional]
**groups** | [**java.util.List&lt;GroupEntryDTO&gt;**](GroupEntryDTO.md) |  |  [optional]
**id** | **Long** |  |  [optional]
**isCanceled** | **Boolean** |  |  [optional]
**isTest** | **Boolean** |  |  [optional]
**orderId** | **String** |  |  [optional]
**originatorOrderId** | **String** |  |  [optional]
**originiator** | **String** |  |  [optional]
**vendorOrderId** | **String** |  |  [optional]


<a name="DeliveryMethodEnum"></a>
## Enum: DeliveryMethodEnum
Name | Value
---- | -----
DIGITAL | &quot;DIGITAL&quot;
SHIPPING | &quot;SHIPPING&quot;



