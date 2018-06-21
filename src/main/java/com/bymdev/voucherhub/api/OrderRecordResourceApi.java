/*
 * PassHub API
 * PassHub API documentation
 *
 * OpenAPI spec version: 1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.bymdev.voucherhub.api;

import com.bymdev.voucherhub.ApiCallback;
import com.bymdev.voucherhub.ApiClient;
import com.bymdev.voucherhub.ApiException;
import com.bymdev.voucherhub.ApiResponse;
import com.bymdev.voucherhub.Configuration;
import com.bymdev.voucherhub.Pair;
import com.bymdev.voucherhub.ProgressRequestBody;
import com.bymdev.voucherhub.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.bymdev.voucherhub.model.GenericStatusDTO;
import com.bymdev.voucherhub.model.OrderRecordDTO;
import com.bymdev.voucherhub.model.OrderRecordExtendDTO;

import java.lang.reflect.Type;

public class OrderRecordResourceApi {
    private ApiClient apiClient;

    public OrderRecordResourceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrderRecordResourceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createOrderRecord
     * @param orderRecordDto the OrderRecord Dto (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createOrderRecordCall(OrderRecordDTO orderRecordDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = orderRecordDto;

        // create path and map variables
        String localVarPath = "/api/v1/orderRecords";

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();

        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();

        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "X-Api-Key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createOrderRecordValidateBeforeCall(OrderRecordDTO orderRecordDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'orderRecordDto' is set
        if (orderRecordDto == null) {
            throw new ApiException("Missing the required parameter 'orderRecordDto' when calling createOrderRecord(Async)");
        }
        

        com.squareup.okhttp.Call call = createOrderRecordCall(orderRecordDto, progressListener, progressRequestListener);
        return call;

    }

    /**
     * createOrderRecord
     * 1) Cellphone number must be in E.164 format;&lt;br/&gt;2) «PricePaid» is a price for 1 product;&lt;br/&gt;3) Required permissions: CAN_CREATE_ORDER.
     * @param orderRecordDto the OrderRecord Dto (required)
     * @return OrderRecordDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrderRecordDTO createOrderRecord(OrderRecordDTO orderRecordDto) throws ApiException {
        ApiResponse<OrderRecordDTO> resp = createOrderRecordWithHttpInfo(orderRecordDto);
        return resp.getData();
    }

    /**
     * createOrderRecord
     * 1) Cellphone number must be in E.164 format;&lt;br/&gt;2) «PricePaid» is a price for 1 product;&lt;br/&gt;3) Required permissions: CAN_CREATE_ORDER.
     * @param orderRecordDto the OrderRecord Dto (required)
     * @return ApiResponse&lt;OrderRecordDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrderRecordDTO> createOrderRecordWithHttpInfo(OrderRecordDTO orderRecordDto) throws ApiException {
        com.squareup.okhttp.Call call = createOrderRecordValidateBeforeCall(orderRecordDto, null, null);
        Type localVarReturnType = new TypeToken<OrderRecordDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * createOrderRecord (asynchronously)
     * 1) Cellphone number must be in E.164 format;&lt;br/&gt;2) «PricePaid» is a price for 1 product;&lt;br/&gt;3) Required permissions: CAN_CREATE_ORDER.
     * @param orderRecordDto the OrderRecord Dto (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createOrderRecordAsync(OrderRecordDTO orderRecordDto, final ApiCallback<OrderRecordDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createOrderRecordValidateBeforeCall(orderRecordDto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OrderRecordDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAllOrderRecords
     * @param query query text (optional)
     * @param from Begin the of date range, format: YYYY-MM-DD (e.g. 2016-01-25) (optional)
     * @param till End the of date range, format: YYYY-MM-DD (e.g. 2016-01-25) (optional)
     * @param timeZone A timezone for date/time representation. Example: America/Chicago or EST. If zone is not set, then UTC timezone will be used. (optional)
     * @param deliveryMethod delivery method (optional)
     * @param deliveryStatus status of delivery (optional)
     * @param size quantity of listed records on page (optional)
     * @param page listing starts from page value (optional)
     * @param sortBy sort by (optional)
     * @param sortOrder sort order (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllOrderRecordsCall(String query, String from, String till, String timeZone, String deliveryMethod, String deliveryStatus, Integer size, Integer page, String sortBy, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v2/orderRecords";

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));
        if (from != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from", from));
        if (till != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("till", till));
        if (timeZone != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("timeZone", timeZone));
        if (deliveryMethod != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deliveryMethod", deliveryMethod));
        if (deliveryStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("deliveryStatus", deliveryStatus));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (sortBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortBy", sortBy));
        if (sortOrder != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sortOrder", sortOrder));

        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();

        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "X-Api-Key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAllOrderRecordsValidateBeforeCall(String query, String from, String till, String timeZone, String deliveryMethod, String deliveryStatus, Integer size, Integer page, String sortBy, String sortOrder, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getAllOrderRecordsCall(query, from, till, timeZone, deliveryMethod, deliveryStatus, size, page, sortBy, sortOrder, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getAllOrderRecords
     * Required permissions: CAN_GET_ORDERS
     * @param query query text (optional)
     * @param from Begin the of date range, format: YYYY-MM-DD (e.g. 2016-01-25) (optional)
     * @param till End the of date range, format: YYYY-MM-DD (e.g. 2016-01-25) (optional)
     * @param timeZone A timezone for date/time representation. Example: America/Chicago or EST. If zone is not set, then UTC timezone will be used. (optional)
     * @param deliveryMethod delivery method (optional)
     * @param deliveryStatus status of delivery (optional)
     * @param size quantity of listed records on page (optional)
     * @param page listing starts from page value (optional)
     * @param sortBy sort by (optional)
     * @param sortOrder sort order (optional)
     * @return java.util.List&lt;OrderRecordExtendDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public java.util.List<OrderRecordExtendDTO> getAllOrderRecords(String query, String from, String till, String timeZone, String deliveryMethod, String deliveryStatus, Integer size, Integer page, String sortBy, String sortOrder) throws ApiException {
        ApiResponse<java.util.List<OrderRecordExtendDTO>> resp = getAllOrderRecordsWithHttpInfo(query, from, till, timeZone, deliveryMethod, deliveryStatus, size, page, sortBy, sortOrder);
        return resp.getData();
    }

    /**
     * getAllOrderRecords
     * Required permissions: CAN_GET_ORDERS
     * @param query query text (optional)
     * @param from Begin the of date range, format: YYYY-MM-DD (e.g. 2016-01-25) (optional)
     * @param till End the of date range, format: YYYY-MM-DD (e.g. 2016-01-25) (optional)
     * @param timeZone A timezone for date/time representation. Example: America/Chicago or EST. If zone is not set, then UTC timezone will be used. (optional)
     * @param deliveryMethod delivery method (optional)
     * @param deliveryStatus status of delivery (optional)
     * @param size quantity of listed records on page (optional)
     * @param page listing starts from page value (optional)
     * @param sortBy sort by (optional)
     * @param sortOrder sort order (optional)
     * @return ApiResponse&lt;java.util.List&lt;OrderRecordExtendDTO&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<java.util.List<OrderRecordExtendDTO>> getAllOrderRecordsWithHttpInfo(String query, String from, String till, String timeZone, String deliveryMethod, String deliveryStatus, Integer size, Integer page, String sortBy, String sortOrder) throws ApiException {
        com.squareup.okhttp.Call call = getAllOrderRecordsValidateBeforeCall(query, from, till, timeZone, deliveryMethod, deliveryStatus, size, page, sortBy, sortOrder, null, null);
        Type localVarReturnType = new TypeToken<java.util.List<OrderRecordExtendDTO>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getAllOrderRecords (asynchronously)
     * Required permissions: CAN_GET_ORDERS
     * @param query query text (optional)
     * @param from Begin the of date range, format: YYYY-MM-DD (e.g. 2016-01-25) (optional)
     * @param till End the of date range, format: YYYY-MM-DD (e.g. 2016-01-25) (optional)
     * @param timeZone A timezone for date/time representation. Example: America/Chicago or EST. If zone is not set, then UTC timezone will be used. (optional)
     * @param deliveryMethod delivery method (optional)
     * @param deliveryStatus status of delivery (optional)
     * @param size quantity of listed records on page (optional)
     * @param page listing starts from page value (optional)
     * @param sortBy sort by (optional)
     * @param sortOrder sort order (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllOrderRecordsAsync(String query, String from, String till, String timeZone, String deliveryMethod, String deliveryStatus, Integer size, Integer page, String sortBy, String sortOrder, final ApiCallback<java.util.List<OrderRecordExtendDTO>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAllOrderRecordsValidateBeforeCall(query, from, till, timeZone, deliveryMethod, deliveryStatus, size, page, sortBy, sortOrder, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<java.util.List<OrderRecordExtendDTO>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getOrderRecord
     * @param id the internal id of order (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getOrderRecordCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/orderRecords/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();

        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();

        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "X-Api-Key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getOrderRecordValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getOrderRecord(Async)");
        }
        

        com.squareup.okhttp.Call call = getOrderRecordCall(id, progressListener, progressRequestListener);
        return call;

    }

    /**
     * getOrderRecord
     * Required permissions: CAN_GET_ORDERS
     * @param id the internal id of order (required)
     * @return OrderRecordExtendDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrderRecordExtendDTO getOrderRecord(Long id) throws ApiException {
        ApiResponse<OrderRecordExtendDTO> resp = getOrderRecordWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * getOrderRecord
     * Required permissions: CAN_GET_ORDERS
     * @param id the internal id of order (required)
     * @return ApiResponse&lt;OrderRecordExtendDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrderRecordExtendDTO> getOrderRecordWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getOrderRecordValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<OrderRecordExtendDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * getOrderRecord (asynchronously)
     * Required permissions: CAN_GET_ORDERS
     * @param id the internal id of order (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrderRecordAsync(Long id, final ApiCallback<OrderRecordExtendDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getOrderRecordValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OrderRecordExtendDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for mergeVouchers
     * @param orderId the internal id of order (required)
     * @param newVoucherId newVoucherId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call mergeVouchersCall(Long orderId, String newVoucherId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/orderRecords/mergeVouchers";

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
        if (orderId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("orderId", orderId));
        if (newVoucherId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("newVoucherId", newVoucherId));

        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();

        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "X-Api-Key" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call mergeVouchersValidateBeforeCall(Long orderId, String newVoucherId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new ApiException("Missing the required parameter 'orderId' when calling mergeVouchers(Async)");
        }
        
        // verify the required parameter 'newVoucherId' is set
        if (newVoucherId == null) {
            throw new ApiException("Missing the required parameter 'newVoucherId' when calling mergeVouchers(Async)");
        }
        

        com.squareup.okhttp.Call call = mergeVouchersCall(orderId, newVoucherId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * mergeVouchers
     * Replaces voucher IDs of order items with new voucher ID in the specified order. All groups are merged to one &#39;MergedGroup&#39;.&lt;br/&gt;Required permissions: CAN_EDIT_ORDER
     * @param orderId the internal id of order (required)
     * @param newVoucherId newVoucherId (required)
     * @return GenericStatusDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenericStatusDTO mergeVouchers(Long orderId, String newVoucherId) throws ApiException {
        ApiResponse<GenericStatusDTO> resp = mergeVouchersWithHttpInfo(orderId, newVoucherId);
        return resp.getData();
    }

    /**
     * mergeVouchers
     * Replaces voucher IDs of order items with new voucher ID in the specified order. All groups are merged to one &#39;MergedGroup&#39;.&lt;br/&gt;Required permissions: CAN_EDIT_ORDER
     * @param orderId the internal id of order (required)
     * @param newVoucherId newVoucherId (required)
     * @return ApiResponse&lt;GenericStatusDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenericStatusDTO> mergeVouchersWithHttpInfo(Long orderId, String newVoucherId) throws ApiException {
        com.squareup.okhttp.Call call = mergeVouchersValidateBeforeCall(orderId, newVoucherId, null, null);
        Type localVarReturnType = new TypeToken<GenericStatusDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * mergeVouchers (asynchronously)
     * Replaces voucher IDs of order items with new voucher ID in the specified order. All groups are merged to one &#39;MergedGroup&#39;.&lt;br/&gt;Required permissions: CAN_EDIT_ORDER
     * @param orderId the internal id of order (required)
     * @param newVoucherId newVoucherId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call mergeVouchersAsync(Long orderId, String newVoucherId, final ApiCallback<GenericStatusDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = mergeVouchersValidateBeforeCall(orderId, newVoucherId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenericStatusDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateOrderRecord
     * @param orderRecordDto the OrderRecord Dto (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateOrderRecordCall(OrderRecordDTO orderRecordDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = orderRecordDto;

        // create path and map variables
        String localVarPath = "/api/v1/orderRecords";

        java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
        java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();

        java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();

        java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "X-Api-Key" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateOrderRecordValidateBeforeCall(OrderRecordDTO orderRecordDto, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'orderRecordDto' is set
        if (orderRecordDto == null) {
            throw new ApiException("Missing the required parameter 'orderRecordDto' when calling updateOrderRecord(Async)");
        }
        

        com.squareup.okhttp.Call call = updateOrderRecordCall(orderRecordDto, progressListener, progressRequestListener);
        return call;

    }

    /**
     * updateOrderRecord
     * 1) Cellphone number must be in E.164 format;&lt;br/&gt;2) «PricePaid» is a price for 1 product;&lt;br/&gt;3) Required permissions: CAN_EDIT_ORDER.
     * @param orderRecordDto the OrderRecord Dto (required)
     * @return OrderRecordDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrderRecordDTO updateOrderRecord(OrderRecordDTO orderRecordDto) throws ApiException {
        ApiResponse<OrderRecordDTO> resp = updateOrderRecordWithHttpInfo(orderRecordDto);
        return resp.getData();
    }

    /**
     * updateOrderRecord
     * 1) Cellphone number must be in E.164 format;&lt;br/&gt;2) «PricePaid» is a price for 1 product;&lt;br/&gt;3) Required permissions: CAN_EDIT_ORDER.
     * @param orderRecordDto the OrderRecord Dto (required)
     * @return ApiResponse&lt;OrderRecordDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrderRecordDTO> updateOrderRecordWithHttpInfo(OrderRecordDTO orderRecordDto) throws ApiException {
        com.squareup.okhttp.Call call = updateOrderRecordValidateBeforeCall(orderRecordDto, null, null);
        Type localVarReturnType = new TypeToken<OrderRecordDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * updateOrderRecord (asynchronously)
     * 1) Cellphone number must be in E.164 format;&lt;br/&gt;2) «PricePaid» is a price for 1 product;&lt;br/&gt;3) Required permissions: CAN_EDIT_ORDER.
     * @param orderRecordDto the OrderRecord Dto (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateOrderRecordAsync(OrderRecordDTO orderRecordDto, final ApiCallback<OrderRecordDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateOrderRecordValidateBeforeCall(orderRecordDto, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OrderRecordDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
