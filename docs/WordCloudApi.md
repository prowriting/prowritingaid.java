# WordCloudApi

All URIs are relative to *https://api.prowritingaid.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get**](WordCloudApi.md#get) | **GET** /api/async/wordcloud/result/{taskId} | Tries to get the result of a request using the task id of the request
[**post**](WordCloudApi.md#post) | **POST** /api/async/wordcloud | Analyses text and returns a word cloud (as an image)


<a name="get"></a>
# **get**
> AsyncResponseWordCloudResponse get(taskId)


Tries to get the result of a request using the task id of the request

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WordCloudApi;


WordCloudApi apiInstance = new WordCloudApi();
String taskId = "taskId_example"; // String | 
try {
    AsyncResponseWordCloudResponse result = apiInstance.get(taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordCloudApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **String**|  |

### Return type

[**AsyncResponseWordCloudResponse**](AsyncResponseWordCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/json

<a name="post"></a>
# **post**
> AsyncResponseWordCloudResponse post(requestp)


Analyses text and returns a word cloud (as an image)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WordCloudApi;


WordCloudApi apiInstance = new WordCloudApi();
WordCloudRequest requestp = new WordCloudRequest(); // WordCloudRequest | 
try {
    AsyncResponseWordCloudResponse result = apiInstance.post(requestp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WordCloudApi#post");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestp** | [**WordCloudRequest**](WordCloudRequest.md)|  |

### Return type

[**AsyncResponseWordCloudResponse**](AsyncResponseWordCloudResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/x-www-form-urlencoded
 - **Accept**: application/json, text/json

