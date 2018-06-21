# passhub-api

Access PassHub with Java. This module offers high level and low level calls to the API.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>tech.sightseeing</groupId>
    <artifactId>passhub-api</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "tech.sightseeing:passhub-api:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/passhub-api-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.bymdev.voucherhub.*;
import com.bymdev.voucherhub.auth.*;
import com.bymdev.voucherhub.model.*;
import com.bymdev.voucherhub.api.ProductResourceApi;

import java.io.File;
import java.util.*;

public class ProductResourceApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: X-Api-Key
        ApiKeyAuth key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
        key.setApiKey("YOUR_API_KEY");
        defaultClient.setVerifyingSsl(false);
        defaultClient.setBasePath("YOUR_HOST");

        ProductResourceApi apiInstance = new ProductResourceApi();
        try {
            // fetch all products for 9/11 Tribute Center
            List<ProductDTO> result = apiInstance.findProductsByVendor(4744L);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductResourceApi#findProductsByVendor");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrderRecordResourceApi* | [**createOrderRecord**](docs/OrderRecordResourceApi.md#createOrderRecord) | **POST** /api/v1/orderRecords | createOrderRecord
*OrderRecordResourceApi* | [**getAllOrderRecords**](docs/OrderRecordResourceApi.md#getAllOrderRecords) | **GET** /api/v2/orderRecords | getAllOrderRecords
*OrderRecordResourceApi* | [**getOrderRecord**](docs/OrderRecordResourceApi.md#getOrderRecord) | **GET** /api/v1/orderRecords/{id} | getOrderRecord
*OrderRecordResourceApi* | [**mergeVouchers**](docs/OrderRecordResourceApi.md#mergeVouchers) | **POST** /api/v1/orderRecords/mergeVouchers | mergeVouchers
*OrderRecordResourceApi* | [**updateOrderRecord**](docs/OrderRecordResourceApi.md#updateOrderRecord) | **PUT** /api/v1/orderRecords | updateOrderRecord
*ProductResourceApi* | [**findProductsByVendor**](docs/ProductResourceApi.md#findProductsByVendor) | **GET** /api/v1/products/vendor/{vendorId} | findProductsByVendor
*ProductResourceApi* | [**getAllProducts**](docs/ProductResourceApi.md#getAllProducts) | **GET** /api/v2/products | getAllProducts
*VendorResourceApi* | [**getAllVendors**](docs/VendorResourceApi.md#getAllVendors) | **GET** /api/v2/vendors | getAllVendors
*VoucherResourceApi* | [**cancelValidation**](docs/VoucherResourceApi.md#cancelValidation) | **POST** /api/v2/voucher/validate/cancel | [V2] Cancel validation for the voucher
*VoucherResourceApi* | [**cancelVoucher**](docs/VoucherResourceApi.md#cancelVoucher) | **POST** /api/v1/voucher/cancel | cancelVoucher
*VoucherResourceApi* | [**convertVoucher**](docs/VoucherResourceApi.md#convertVoucher) | **POST** /api/v1/voucher/convert | convertVoucher
*VoucherResourceApi* | [**validateVoucher**](docs/VoucherResourceApi.md#validateVoucher) | **POST** /api/v2/voucher/validate | [V2] Validates voucher which represents single order item or group of them.


## Documentation for Models

 - [Address](docs/Address.md)
 - [Condition](docs/Condition.md)
 - [DeliveryDTO](docs/DeliveryDTO.md)
 - [ExtraValidationParamDTO](docs/ExtraValidationParamDTO.md)
 - [GenericStatusDTO](docs/GenericStatusDTO.md)
 - [GroupEntryDTO](docs/GroupEntryDTO.md)
 - [MapOfstringAndstring](docs/MapOfstringAndstring.md)
 - [OrderItem](docs/OrderItem.md)
 - [OrderNoteParamDTO](docs/OrderNoteParamDTO.md)
 - [OrderRecordDTO](docs/OrderRecordDTO.md)
 - [OrderRecordExtendDTO](docs/OrderRecordExtendDTO.md)
 - [ProductDTO](docs/ProductDTO.md)
 - [ProductSuggestion](docs/ProductSuggestion.md)
 - [RechargeProductGroup](docs/RechargeProductGroup.md)
 - [RechargePrompt](docs/RechargePrompt.md)
 - [RechargePromptEntry](docs/RechargePromptEntry.md)
 - [Rule](docs/Rule.md)
 - [SimpleConnectedProductDTO](docs/SimpleConnectedProductDTO.md)
 - [SimpleMetadata](docs/SimpleMetadata.md)
 - [SimpleProductConnectionDTO](docs/SimpleProductConnectionDTO.md)
 - [SimpleProductDTO](docs/SimpleProductDTO.md)
 - [SuggestedOrder](docs/SuggestedOrder.md)
 - [SuggestedOrderItem](docs/SuggestedOrderItem.md)
 - [UniversalAttribute](docs/UniversalAttribute.md)
 - [UserCompactDTO](docs/UserCompactDTO.md)
 - [UserDTO](docs/UserDTO.md)
 - [ValidationItemStatusDTO](docs/ValidationItemStatusDTO.md)
 - [ValidationResult](docs/ValidationResult.md)
 - [ValidationResultEntry](docs/ValidationResultEntry.md)
 - [VendorDTO](docs/VendorDTO.md)
 - [VendorDetailDTO](docs/VendorDetailDTO.md)
 - [VoucherPattern](docs/VoucherPattern.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### X-Api-Key

- **Type**: API key
- **API key parameter name**: X-Api-Key
- **Location**: HTTP header
