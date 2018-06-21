
# DeliveryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**Address**](Address.md) |  |  [optional]
**carrier** | [**CarrierEnum**](#CarrierEnum) |  |  [optional]
**cost** | **Double** |  |  [optional]
**errorCode** | **String** |  |  [optional]
**errorMessage** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**trackingNumber** | **String** |  |  [optional]


<a name="CarrierEnum"></a>
## Enum: CarrierEnum
Name | Value
---- | -----
FEDEX | &quot;FEDEX&quot;


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
FEDEX_GROUND | &quot;FEDEX_GROUND&quot;
FEDEX_2_DAY | &quot;FEDEX_2_DAY&quot;
FEDEX_2_DAY_AM | &quot;FEDEX_2_DAY_AM&quot;
FEDEX_EXPRESS_SAVER | &quot;FEDEX_EXPRESS_SAVER&quot;
STANDARD_OVERNIGHT | &quot;STANDARD_OVERNIGHT&quot;
FIRST_OVERNIGHT | &quot;FIRST_OVERNIGHT&quot;
PRIORITY_OVERNIGHT | &quot;PRIORITY_OVERNIGHT&quot;
INTERNATIONAL_ECONOMY | &quot;INTERNATIONAL_ECONOMY&quot;
INTERNATIONAL_FIRST | &quot;INTERNATIONAL_FIRST&quot;
INTERNATIONAL_PRIORITY | &quot;INTERNATIONAL_PRIORITY&quot;
GROUND_HOME_DELIVERY | &quot;GROUND_HOME_DELIVERY&quot;
SMART_POST | &quot;SMART_POST&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ASSIGN_REQUIRED | &quot;ASSIGN_REQUIRED&quot;
SHIPMENT_CREATION | &quot;SHIPMENT_CREATION&quot;
LABEL_PRINTING | &quot;LABEL_PRINTING&quot;
PICKUP_REQUIRED | &quot;PICKUP_REQUIRED&quot;
PROCESSED | &quot;PROCESSED&quot;



