# ContextualThesaurusApi

All URIs are relative to *https://api.prowritingaid.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](ContextualThesaurusApi.md#get) | **GET** /api/async/contextualthesaurus/result/{taskId} | Tries to get the result of a request using the task id of the request
[**post**](ContextualThesaurusApi.md#post) | **POST** /api/async/contextualthesaurus | Analyses text and returns contextual thesaurus entries


<a name="get"></a>
# **get**
> AsyncResponseContextualThesaurusResponse get(taskId)


Tries to get the result of a request using the task id of the request

### Example
```java
// Import classes:
//import ProWritingAid.ApiClient;
//import ProWritingAid.ApiException;
//import ProWritingAid.Configuration;
//import ProWritingAid.auth.*;
//import ProWritingAid.SDK.ContextualThesaurusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: licenseCode
ApiKeyAuth licenseCode = (ApiKeyAuth) defaultClient.getAuthentication("licenseCode");
licenseCode.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//licenseCode.setApiKeyPrefix("Token");

ContextualThesaurusApi apiInstance = new ContextualThesaurusApi();
String taskId = "taskId_example"; // String | 
try {
    AsyncResponseContextualThesaurusResponse result = apiInstance.get(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextualThesaurusApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**|  |

### Return type

[**AsyncResponseContextualThesaurusResponse**](AsyncResponseContextualThesaurusResponse.md)

### Authorization

[licenseCode](../README.md#licenseCode)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="post"></a>
# **post**
> AsyncResponseContextualThesaurusResponse post(requestp)


Analyses text and returns contextual thesaurus entries

### Example
```java
// Import classes:
//import ProWritingAid.ApiClient;
//import ProWritingAid.ApiException;
//import ProWritingAid.Configuration;
//import ProWritingAid.auth.*;
//import ProWritingAid.SDK.ContextualThesaurusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: licenseCode
ApiKeyAuth licenseCode = (ApiKeyAuth) defaultClient.getAuthentication("licenseCode");
licenseCode.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//licenseCode.setApiKeyPrefix("Token");

ContextualThesaurusApi apiInstance = new ContextualThesaurusApi();
ContextualThesaurusRequest requestp = new ContextualThesaurusRequest(); // ContextualThesaurusRequest | 
try {
    AsyncResponseContextualThesaurusResponse result = apiInstance.post(requestp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContextualThesaurusApi#post");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestp** | [**ContextualThesaurusRequest**](ContextualThesaurusRequest.md)|  |

### Return type

[**AsyncResponseContextualThesaurusResponse**](AsyncResponseContextualThesaurusResponse.md)

### Authorization

[licenseCode](../README.md#licenseCode)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

