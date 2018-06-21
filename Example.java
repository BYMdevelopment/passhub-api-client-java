import com.bymdev.voucherhub.ApiClient;
import com.bymdev.voucherhub.ApiException;
import com.bymdev.voucherhub.Configuration;
import com.bymdev.voucherhub.api.ProductResourceApi;
import com.bymdev.voucherhub.auth.ApiKeyAuth;
import com.bymdev.voucherhub.model.ProductDTO;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: X-Api-Key
        ApiKeyAuth key = (ApiKeyAuth) defaultClient.getAuthentication("X-Api-Key");
        key.setApiKey("9f8bef0b-f706-450a-9bbd-588525aa16af");
        defaultClient.setVerifyingSsl(false);
        defaultClient.setBasePath("https://dev.sightseeingpass.com/");

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
