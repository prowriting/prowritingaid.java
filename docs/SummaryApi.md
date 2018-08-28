# SummaryApi

All URIs are relative to *https://api.prowritingaid.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](SummaryApi.md#get) | **GET** /api/async/summary/result/{taskId} | Tries to get the result of a request using the task id of the request
[**post**](SummaryApi.md#post) | **POST** /api/async/summary | Gets the summary analysis of a document


<a name="get"></a>
# **get**
> AsyncResponseSummaryAnalysisResponse get(taskId)


Tries to get the result of a request using the task id of the request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SummaryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: licenseCode
ApiKeyAuth licenseCode = (ApiKeyAuth) defaultClient.getAuthentication("licenseCode");
licenseCode.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//licenseCode.setApiKeyPrefix("Token");

SummaryApi apiInstance = new SummaryApi();
String taskId = "taskId_example"; // String | 
try {
    AsyncResponseSummaryAnalysisResponse result = apiInstance.get(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SummaryApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**|  |

### Return type

[**AsyncResponseSummaryAnalysisResponse**](AsyncResponseSummaryAnalysisResponse.md)

### Authorization

[licenseCode](../README.md#licenseCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="post"></a>
# **post**
> AsyncResponseSummaryAnalysisResponse post(requestp)


Gets the summary analysis of a document

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SummaryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: licenseCode
ApiKeyAuth licenseCode = (ApiKeyAuth) defaultClient.getAuthentication("licenseCode");
licenseCode.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//licenseCode.setApiKeyPrefix("Token");

SummaryApi apiInstance = new SummaryApi();
SummaryAnalysisRequest requestp = new SummaryAnalysisRequest(); // SummaryAnalysisRequest | 
try {
    AsyncResponseSummaryAnalysisResponse result = apiInstance.post(requestp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SummaryApi#post");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestp** | [**SummaryAnalysisRequest**](SummaryAnalysisRequest.md)|  |

### Return type

[**AsyncResponseSummaryAnalysisResponse**](AsyncResponseSummaryAnalysisResponse.md)

### Authorization

[licenseCode](../README.md#licenseCode)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

