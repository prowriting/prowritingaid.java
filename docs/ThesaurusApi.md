# ThesaurusApi

All URIs are relative to *https://api.prowritingaid.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post**](ThesaurusApi.md#post) | **POST** /api/thesaurus | Returns the thesaurus entries for a specific word


<a name="post"></a>
# **post**
> ThesaurusResponse post(request)


Returns the thesaurus entries for a specific word

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ThesaurusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: licenseCode
ApiKeyAuth licenseCode = (ApiKeyAuth) defaultClient.getAuthentication("licenseCode");
licenseCode.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//licenseCode.setApiKeyPrefix("Token");

ThesaurusApi apiInstance = new ThesaurusApi();
ThesaurusRequest request = new ThesaurusRequest(); // ThesaurusRequest | 
try {
    ThesaurusResponse result = apiInstance.post(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ThesaurusApi#post");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**ThesaurusRequest**](ThesaurusRequest.md)|  |

### Return type

[**ThesaurusResponse**](ThesaurusResponse.md)

### Authorization

[licenseCode](../README.md#licenseCode)

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

