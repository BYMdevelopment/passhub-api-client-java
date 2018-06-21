
# SimpleProductDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowRecharge** | **Boolean** |  |  [optional]
**countryCode** | **String** |  |  [optional]
**customerType** | [**CustomerTypeEnum**](#CustomerTypeEnum) |  |  [optional]
**description** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**includes** | [**java.util.List&lt;SimpleProductConnectionDTO&gt;**](SimpleProductConnectionDTO.md) |  |  [optional]
**locationCode** | **String** |  |  [optional]
**locationName** | **String** |  |  [optional]
**maxValidationsInPass** | **Integer** |  |  [optional]
**modifiedBy** | [**UserDTO**](UserDTO.md) |  |  [optional]
**modifiedDate** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**packageProductId** | **String** |  |  [optional]
**price** | **Double** |  |  [optional]
**printType** | [**PrintTypeEnum**](#PrintTypeEnum) |  |  [optional]
**productId** | **String** |  |  [optional]
**rechargePrice** | **Double** |  |  [optional]
**retailPrice** | **Double** |  |  [optional]
**sku** | **String** |  |  [optional]
**subProductId** | **String** |  |  [optional]
**tags** | **java.util.List&lt;String&gt;** |  |  [optional]
**timezone** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**validValue** | **Integer** |  |  [optional]
**validationRules** | [**java.util.List&lt;Rule&gt;**](Rule.md) |  |  [optional]
**validationTag** | **String** |  |  [optional]
**vendor** | [**VendorDTO**](VendorDTO.md) |  |  [optional]
**vendorAccountId** | **String** |  |  [optional]
**vendorSku** | **String** |  |  [optional]
**voucherPattern** | [**VoucherPattern**](VoucherPattern.md) |  |  [optional]
**voucherType** | [**VoucherTypeEnum**](#VoucherTypeEnum) |  |  [optional]


<a name="CustomerTypeEnum"></a>
## Enum: CustomerTypeEnum
Name | Value
---- | -----
ADULT | &quot;ADULT&quot;
CHILD | &quot;CHILD&quot;
SENIOR | &quot;SENIOR&quot;


<a name="PrintTypeEnum"></a>
## Enum: PrintTypeEnum
Name | Value
---- | -----
AUTO_PRINT | &quot;AUTO_PRINT&quot;
NOT_PRINTABLE | &quot;NOT_PRINTABLE&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BASIC_SINGLE | &quot;BASIC_SINGLE&quot;
BASIC_VALID_HOURS | &quot;BASIC_VALID_HOURS&quot;
PASS_LIMITED | &quot;PASS_LIMITED&quot;
PASS_UNLIMITED | &quot;PASS_UNLIMITED&quot;
PASS_CALENDAR | &quot;PASS_CALENDAR&quot;
FLEXPASS | &quot;FLEXPASS&quot;
PASS_CURRENCY | &quot;PASS_CURRENCY&quot;


<a name="VoucherTypeEnum"></a>
## Enum: VoucherTypeEnum
Name | Value
---- | -----
DEFAULT | &quot;DEFAULT&quot;
CUSTOM | &quot;CUSTOM&quot;



