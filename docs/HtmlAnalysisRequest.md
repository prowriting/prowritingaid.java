
# HtmlAnalysisRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**html** | **String** | Html to be processed | 
**reports** | **List&lt;String&gt;** | List of reports - EXAMPLE: [\&quot;grammar\&quot;,\&quot;overused\&quot;] | 
**style** | [**StyleEnum**](#StyleEnum) | Document&#39;s writing style | 
**language** | [**LanguageEnum**](#LanguageEnum) | Document&#39;s language. Set correct UK/US language to get region-specific suggestions | 


<a name="StyleEnum"></a>
## Enum: StyleEnum
Name | Value
---- | -----
NOTSET | &quot;NotSet&quot;
GENERAL | &quot;General&quot;
ACADEMIC | &quot;Academic&quot;
BUSINESS | &quot;Business&quot;
TECHNICAL | &quot;Technical&quot;
CREATIVE | &quot;Creative&quot;
CASUAL | &quot;Casual&quot;
WEB | &quot;Web&quot;


<a name="LanguageEnum"></a>
## Enum: LanguageEnum
Name | Value
---- | -----
EN_US | &quot;en_US&quot;
EN_UK | &quot;en_UK&quot;
EN | &quot;en&quot;
ES | &quot;es&quot;



