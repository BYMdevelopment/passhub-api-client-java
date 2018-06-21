
# ValidationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canSkipExpiryCheck** | **Boolean** |  |  [optional]
**contractHolderId** | **String** |  |  [optional]
**contractHolderName** | **String** |  |  [optional]
**errorCode** | [**ErrorCodeEnum**](#ErrorCodeEnum) |  |  [optional]
**extra** | **java.util.Map&lt;String, String&gt;** |  |  [optional]
**meta** | [**java.util.List&lt;UniversalAttribute&gt;**](UniversalAttribute.md) |  |  [optional]
**printStatus** | [**PrintStatusEnum**](#PrintStatusEnum) |  |  [optional]
**recharge** | [**RechargePrompt**](RechargePrompt.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**suggestedOrderItems** | [**java.util.List&lt;SuggestedOrder&gt;**](SuggestedOrder.md) |  |  [optional]
**suggestedProducts** | [**java.util.List&lt;ProductSuggestion&gt;**](ProductSuggestion.md) |  |  [optional]
**transactionTag** | **String** |  |  [optional]
**validation** | [**java.util.List&lt;ValidationResultEntry&gt;**](ValidationResultEntry.md) |  |  [optional]
**validationDate** | **String** |  |  [optional]
**voucherId** | **String** |  |  [optional]
**waitingPeriodPending** | **Integer** |  |  [optional]


<a name="ErrorCodeEnum"></a>
## Enum: ErrorCodeEnum
Name | Value
---- | -----
VALIDATION_ID_NOT_FOUND | &quot;VALIDATION_ID_NOT_FOUND&quot;
REQUESTED_PRODUCT_NOT_FOUND | &quot;REQUESTED_PRODUCT_NOT_FOUND&quot;
REQUESTED_PRODUCT_USED | &quot;REQUESTED_PRODUCT_USED&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
INSUFFICIENT_CURRENCY_AMOUNT | &quot;INSUFFICIENT_CURRENCY_AMOUNT&quot;
NOT_VALIDATABLE_PRODUCT | &quot;NOT_VALIDATABLE_PRODUCT&quot;
MAX_NUMBER_OF_USES_REACHED | &quot;MAX_NUMBER_OF_USES_REACHED&quot;
VOUCHER_EXPIRED | &quot;VOUCHER_EXPIRED&quot;
VALIDATION_BLOCKED_DATES | &quot;VALIDATION_BLOCKED_DATES&quot;
VALIDATION_BLOCKED_TIME | &quot;VALIDATION_BLOCKED_TIME&quot;
VALIDATION_BLOCKED_DAYS | &quot;VALIDATION_BLOCKED_DAYS&quot;
SYSTEMS_SYNC_FAILED | &quot;SYSTEMS_SYNC_FAILED&quot;
VALIDATIONS_PER_DAY_EXCEEDED | &quot;VALIDATIONS_PER_DAY_EXCEEDED&quot;
WAITING_PERIOD_NOT_EXPIRED | &quot;WAITING_PERIOD_NOT_EXPIRED&quot;


<a name="PrintStatusEnum"></a>
## Enum: PrintStatusEnum
Name | Value
---- | -----
NOT_PRINTABLE | &quot;NOT_PRINTABLE&quot;
PRINTED | &quot;PRINTED&quot;
NEED_PRINTING | &quot;NEED_PRINTING&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
CLARIFY | &quot;CLARIFY&quot;
FAILURE | &quot;FAILURE&quot;
CLARIFY_ORDER | &quot;CLARIFY_ORDER&quot;
CLARIFY_ITEM | &quot;CLARIFY_ITEM&quot;



