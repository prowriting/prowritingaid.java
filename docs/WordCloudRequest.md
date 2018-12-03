
# WordCloudRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **String** | The text to be turned into a Word Cloud | 
**orientation** | [**OrientationEnum**](#OrientationEnum) | The orientation of the text | 
**caseMethod** | [**CaseMethodEnum**](#CaseMethodEnum) | The method to be used for casing | 
**paletteName** | **String** | The name of the palette | 
**maximumWordCount** | **Integer** | the maximum number of words to be created | 
**removeCommonWords** | **Boolean** | Should Common words be removed from the cloud | 
**fontName** | **String** | The name of the font to use | 
**width** | **Integer** | The width of the image to produce | 
**height** | **Integer** | The height of the image to produce | 
**onlySentimentWords** | **Boolean** | Only use the sentiment words from the text | 
**style** | [**StyleEnum**](#StyleEnum) | Document&#39;s writing style | 
**language** | [**LanguageEnum**](#LanguageEnum) | Document&#39;s language. Set correct UK/US language to get region-specific suggestions | 


<a name="OrientationEnum"></a>
## Enum: OrientationEnum
Name | Value
---- | -----
HORIZONTAL | &quot;Horizontal&quot;
MOSTLYHORIZONTAL | &quot;MostlyHorizontal&quot;
VERTICAL | &quot;Vertical&quot;
MOSTLYVERTICAL | &quot;MostlyVertical&quot;
HALFANDHALF | &quot;HalfAndHalf&quot;
EVERYWHICHWAY | &quot;EveryWhichWay&quot;


<a name="CaseMethodEnum"></a>
## Enum: CaseMethodEnum
Name | Value
---- | -----
PRESERVECASE | &quot;PreserveCase&quot;
LOWERCASE | &quot;Lowercase&quot;
UPPERCASE | &quot;Uppercase&quot;
INTELLIGENTCASE | &quot;IntelligentCase&quot;


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
EN_AU | &quot;en_AU&quot;
EN_CA | &quot;en_CA&quot;
EN | &quot;en&quot;
ES | &quot;es&quot;



