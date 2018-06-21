
# ProductDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowRecharge** | **Boolean** |  |  [optional]
**customerType** | [**CustomerTypeEnum**](#CustomerTypeEnum) |  |  [optional]
**id** | **Long** |  |  [optional]
**name** | **String** |  |  [optional]
**packageProductId** | **String** |  |  [optional]
**price** | **Double** |  |  [optional]
**productId** | **String** |  |  [optional]
**rechargePrice** | **Double** |  |  [optional]
**retailPrice** | **Double** |  |  [optional]
**sku** | **String** |  |  [optional]
**subProductId** | **String** |  |  [optional]
**tags** | **java.util.List&lt;String&gt;** |  |  [optional]
**timezone** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**validValue** | **Integer** |  |  [optional]
**validationTag** | **String** |  |  [optional]
**vendorAccountId** | **String** |  |  [optional]
**vendorName** | **String** |  |  [optional]
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



