# ProWritingAid.SDK

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/pro_writing_aid_java-2.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import ProWritingAid.*;
import ProWritingAid.auth.*;
import ProWritingAid.SDK.*;

import java.util.Arrays;

public class GrammarApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: licenseCode
        ApiKeyAuth licenseCode = (ApiKeyAuth) defaultClient.getAuthentication("licenseCode");
        licenseCode.setApiKey("YOUR API KEY");

        TextApi apiInstance = new TextApi();
        try {
            TextAnalysisRequest request = new TextAnalysisRequest();
            request.setText("I place my cane firmly on the ground and, slowly, with its aid, " +
                    "I lower myself from the hammock. Now the rains have gone my joints " +
                    "don't hurt so badly. Today won't be too bad, I think. I'm prone to " +
                    "be over optimistic. Could this be my last day. At this time the jungle " +
                    "is strangely subdued. She poke around in the ashes. Every day the " +
                    "weariness is even worst than beofre. I don't know yett. \n" +
                    "Whne? What a weka statement. Jaroslav Drabny is a Czech football goalkeeper. " +
                    "Bhuvnehwar Kumar is a Czech football goalkeeper. I just saw Siyabonga Siyo. " +
                    "I just saw Siyabonga Seyo. I read this article on RaelSport.");
            request.setReports(Arrays.asList("grammar"));
            request.setStyle(TextAnalysisRequest.StyleEnum.GENERAL);
            request.setLanguage(TextAnalysisRequest.LanguageEnum.EN);

            AsyncResponseTextAnalysisResponse result = apiInstance.post(request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContextualThesaurusApi#post");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.prowritingaid.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ContextualThesaurusApi* | [**get**](docs/ContextualThesaurusApi.md#get) | **GET** /api/async/contextualthesaurus/result/{taskId} | Tries to get the result of a request using the task id of the request
*ContextualThesaurusApi* | [**post**](docs/ContextualThesaurusApi.md#post) | **POST** /api/async/contextualthesaurus | Analyses text and returns contextual thesaurus entries
*HtmlApi* | [**get**](docs/HtmlApi.md#get) | **GET** /api/async/html/result/{taskId} | Tries to get the result of a request using the task id of the request
*HtmlApi* | [**post**](docs/HtmlApi.md#post) | **POST** /api/async/html | Analyses HTML and adds suggestion tags to it
*SummaryApi* | [**get**](docs/SummaryApi.md#get) | **GET** /api/async/summary/result/{taskId} | Tries to get the result of a request using the task id of the request
*SummaryApi* | [**post**](docs/SummaryApi.md#post) | **POST** /api/async/summary | Gets the summary analysis of a document
*TextApi* | [**get**](docs/TextApi.md#get) | **GET** /api/async/text/result/{taskId} | Tries to get the result of a request using the task id of the request
*TextApi* | [**post**](docs/TextApi.md#post) | **POST** /api/async/text | Analyses text and returns tags for it
*ThesaurusApi* | [**post**](docs/ThesaurusApi.md#post) | **POST** /api/thesaurus | Returns the thesaurus entries for a specific word
*WordCloudApi* | [**get**](docs/WordCloudApi.md#get) | **GET** /api/async/wordcloud/result/{taskId} | Tries to get the result of a request using the task id of the request
*WordCloudApi* | [**post**](docs/WordCloudApi.md#post) | **POST** /api/async/wordcloud | Analyses text and returns a word cloud (as an image)


## Documentation for Models

 - [AnalysisSettings](docs/AnalysisSettings.md)
 - [AnalysisSummary](docs/AnalysisSummary.md)
 - [AnalysisSummaryGraph](docs/AnalysisSummaryGraph.md)
 - [AnalysisSummaryGraphItem](docs/AnalysisSummaryGraphItem.md)
 - [AnalysisSummaryItem](docs/AnalysisSummaryItem.md)
 - [AnalysisSummarySubItem](docs/AnalysisSummarySubItem.md)
 - [AsyncResponseContextualThesaurusResponse](docs/AsyncResponseContextualThesaurusResponse.md)
 - [AsyncResponseHtmlAnalysisResponse](docs/AsyncResponseHtmlAnalysisResponse.md)
 - [AsyncResponseSummaryAnalysisResponse](docs/AsyncResponseSummaryAnalysisResponse.md)
 - [AsyncResponseTextAnalysisResponse](docs/AsyncResponseTextAnalysisResponse.md)
 - [AsyncResponseWordCloudResponse](docs/AsyncResponseWordCloudResponse.md)
 - [ContextualThesaurusRequest](docs/ContextualThesaurusRequest.md)
 - [ContextualThesaurusResponse](docs/ContextualThesaurusResponse.md)
 - [DocTag](docs/DocTag.md)
 - [EntryMeaning](docs/EntryMeaning.md)
 - [HtmlAnalysisRequest](docs/HtmlAnalysisRequest.md)
 - [HtmlAnalysisResponse](docs/HtmlAnalysisResponse.md)
 - [SuggestionCategory](docs/SuggestionCategory.md)
 - [SummaryAnalysisRequest](docs/SummaryAnalysisRequest.md)
 - [SummaryAnalysisResponse](docs/SummaryAnalysisResponse.md)
 - [TextAnalysisRequest](docs/TextAnalysisRequest.md)
 - [TextAnalysisResponse](docs/TextAnalysisResponse.md)
 - [ThesaurusRequest](docs/ThesaurusRequest.md)
 - [ThesaurusResponse](docs/ThesaurusResponse.md)
 - [WordCloudRequest](docs/WordCloudRequest.md)
 - [WordCloudResponse](docs/WordCloudResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### licenseCode

- **Type**: API key
- **API key parameter name**: licenseCode
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hello@prowritingaid.com

