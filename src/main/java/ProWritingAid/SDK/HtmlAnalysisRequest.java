/*
 * ProWritingAid API V2
 * Official ProWritingAid API Version 2
 *
 * OpenAPI spec version: v2
 * Contact: hello@prowritingaid.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ProWritingAid.SDK;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ## Available Reports  Below is a list of the currently available reports from ProWritingAid. If you would like a different report, or require extra information, such as tokenization, sentence split, parts of speech, etc. then please [get in touch](https://prowritingaid.com/en/Home/Contact).    Report Name | Status | Description  ------------ | ------------- | -------------  acronym | Live | Shows all the acronyms in your writing and highlights where they haven&#39;t been defined, or have been defined after the first occurrence, or have been defined multiple times.. |  alliteration | Live | Highlights alliterations in your writing. Alliterations are a linguistic tool used by some writers for effect.. |  allrepeats | Development | Highlights words and phrases that you&#39;ve used repeatedly in your text. |  allsentences | Live | Shows a visual representation of the sentences lengths of your writing. Try and vary the sentence lengths to maintain the interest of the reader.. |  bully | Development | Highlights bullying and vulgar language in your text.. |  cliche | Live | Scours your work for cliches and highlights them. Nobody likes to read a cliche so best to avoid them. Redundant expressions can also be removed as they say the same thing twice.. |  closerepeat | Development | Highlights any words and phrases that you have repeated within a short space of writing. Try and think of something else to say.. |  complex | Live | Highlights complex words in your writing. Words are broken down by number of syllables.. |  consistency | Live | Highlights inconsistency in your text. Picking up inconsistencies in your text can be one of the hardest editing tasks.. |  core | Development | Core findings. |  coreplus | Development | Core findings. |  corporate | Live | Highlights uses of corporate wording that can be simplified to clarify your document.. |  dialog | Live | Highlights the dialogue tags in your text. Editors prefer minimal use of all dialogue tags (except for &#39;said&#39;).. |  diction | Live | Provides a list of possible diction problems and suggestions on how you might revise them.. |  dva | Live | Highlights diction problems, vague and abstract words in your text.. |  eloquence | Live | Designed to help you develop your use of stylistic writing techniques such as alliteration, epistrophe, and hendiadys. The items in this report are not suggestions, just aids to help you along the way.. |  grammar | Live | Checks your text for grammar errors and potential word mis-use.. |  grammarplus | Live | Checks your text for grammar errors and potential word mis-use.. |  homonym | Live | Helps you check for incorrect word usage. Homonyms are words which sound alike yet are spelled differently. For example: there, their and they&#39;re or raw and roar.. |  house | Development | A blank report for you to create your own patterns in. Ideal for a house style. Go to the settings screen to set-up your own patterns. . |  initial | Live | Highlights the initial pronouns in your text. Repetitive use of initial pronouns can lead to boring text, e.g. He did this. He did that. He did another thing.. |  nlp | Development | Our NLP Predicate Words report allows you to easily identify the key modality or representation system of a piece of text. If you are analyzing a document written by someone else then this will give you an idea of their preferred representational system. This may help you tailor your writing in order to build rapport. If you don&#39;t know the modality of your reader then try to use a balance of words from each modality. This will broaden the appeal of your writing.. |  overused | Live | Compares the frequency of commonly overused words in your text to published writing to give you an indication of where you may be over-using words.. |  overusedonly | Live | Compares the frequency of commonly overused words in your text to published writing to give you an indication of where you may be over-using words.. |  overview | Live | Gives you an overview of the key metrics for your document.. |  pacing | Live | Identifies the slower paced parts of your manuscript, such as introspection and backstory so you can spread them out. Try not to have too many slower paced paragraphs in a row as this can get boring.. |  paragraph_readability | Live | Shows you the relative readability of each paragraph in your text.. |  passive | Live | Highlights areas where your writing style might be improved, such as use of passive and hidden verbs.. |  phrases | Live | Provides a summary of all the phrases that you have repeated in your writing. Try and cut down on repeats.. |  plagiarism | Live | Identifies parts of your text that occur in other documents. Scans millions of web-pages, books, and academic papers.. |  plength | Live | A visual representation of the paragraph lengths of your writing. Avoid writing more than five or six sentences in a paragraph. Also try to avoid too many short paragraphs.. |  preadability | Live | Provides a series of readability measures for your text so you can determine if it is suitable for your intended audience.. |  readability | Live | Provides a series of readability measures for your text so you can determine if it is suitable for your intended audience.. |  sentiment | Live | Shows a histogram of the sentiment in your story so you can monitor large swings.. |  sentimentwords | Development | Highlights words that have a sentiment bias in your text, and grades them.. |  seo | Development | Shows how yout text can be optimized to appear higher in Google rankings.. |  slength | Live | Shows a visual representation of the sentences lengths of your writing. Try and vary the sentence lengths to maintain the interest of the reader.. |  ssentences | Live | Shows sticky sentences in your writing. Sticky sentences slow your reader down; try to avoid them.. |  ssentences_noglue | Live | Shows sticky sentences in your writing. Sticky sentences slow your reader down; try to avoid them.. |  structure | Live | Highlights the key structure of a document such as sentences and paragraphs.. |  thesaurus | Beta | Shows possible replacements for nouns, verbs, adjectives and adverbs.. |  time | Live | Highlights any temporal references in your text so you can check for inconsistency and view the time-line of your text.. |  topics | Live | Suggested topics that are related to the subject matter of your text.. |  transition | Live | Highlights the transitions in your report. Transitions help organize ideas. Writing that is short on transitions is often hard to follow. Non-fiction writing that has under 1 transition per 4 sentences tends to be less understandable.. |  vague | Live | Provides a list of words that may be considered vague or abstract. Consider strengthening them.. |  wordcloud | Live | Shows you a word cloud of the most commonly occuring words in your text.. |  wordsandphrases | Deprecated | Highlights any words and phrases that you have repeated within a short space of writing. Try and think of something else to say.. |  wordsphrases | Live | Highlights any words and phrases that you have repeated within a short space of writing. Try and think of something else to say.. |
 */
@ApiModel(description = "## Available Reports  Below is a list of the currently available reports from ProWritingAid. If you would like a different report, or require extra information, such as tokenization, sentence split, parts of speech, etc. then please [get in touch](https://prowritingaid.com/en/Home/Contact).    Report Name | Status | Description  ------------ | ------------- | -------------  acronym | Live | Shows all the acronyms in your writing and highlights where they haven't been defined, or have been defined after the first occurrence, or have been defined multiple times.. |  alliteration | Live | Highlights alliterations in your writing. Alliterations are a linguistic tool used by some writers for effect.. |  allrepeats | Development | Highlights words and phrases that you've used repeatedly in your text. |  allsentences | Live | Shows a visual representation of the sentences lengths of your writing. Try and vary the sentence lengths to maintain the interest of the reader.. |  bully | Development | Highlights bullying and vulgar language in your text.. |  cliche | Live | Scours your work for cliches and highlights them. Nobody likes to read a cliche so best to avoid them. Redundant expressions can also be removed as they say the same thing twice.. |  closerepeat | Development | Highlights any words and phrases that you have repeated within a short space of writing. Try and think of something else to say.. |  complex | Live | Highlights complex words in your writing. Words are broken down by number of syllables.. |  consistency | Live | Highlights inconsistency in your text. Picking up inconsistencies in your text can be one of the hardest editing tasks.. |  core | Development | Core findings. |  coreplus | Development | Core findings. |  corporate | Live | Highlights uses of corporate wording that can be simplified to clarify your document.. |  dialog | Live | Highlights the dialogue tags in your text. Editors prefer minimal use of all dialogue tags (except for 'said').. |  diction | Live | Provides a list of possible diction problems and suggestions on how you might revise them.. |  dva | Live | Highlights diction problems, vague and abstract words in your text.. |  eloquence | Live | Designed to help you develop your use of stylistic writing techniques such as alliteration, epistrophe, and hendiadys. The items in this report are not suggestions, just aids to help you along the way.. |  grammar | Live | Checks your text for grammar errors and potential word mis-use.. |  grammarplus | Live | Checks your text for grammar errors and potential word mis-use.. |  homonym | Live | Helps you check for incorrect word usage. Homonyms are words which sound alike yet are spelled differently. For example: there, their and they're or raw and roar.. |  house | Development | A blank report for you to create your own patterns in. Ideal for a house style. Go to the settings screen to set-up your own patterns. . |  initial | Live | Highlights the initial pronouns in your text. Repetitive use of initial pronouns can lead to boring text, e.g. He did this. He did that. He did another thing.. |  nlp | Development | Our NLP Predicate Words report allows you to easily identify the key modality or representation system of a piece of text. If you are analyzing a document written by someone else then this will give you an idea of their preferred representational system. This may help you tailor your writing in order to build rapport. If you don't know the modality of your reader then try to use a balance of words from each modality. This will broaden the appeal of your writing.. |  overused | Live | Compares the frequency of commonly overused words in your text to published writing to give you an indication of where you may be over-using words.. |  overusedonly | Live | Compares the frequency of commonly overused words in your text to published writing to give you an indication of where you may be over-using words.. |  overview | Live | Gives you an overview of the key metrics for your document.. |  pacing | Live | Identifies the slower paced parts of your manuscript, such as introspection and backstory so you can spread them out. Try not to have too many slower paced paragraphs in a row as this can get boring.. |  paragraph_readability | Live | Shows you the relative readability of each paragraph in your text.. |  passive | Live | Highlights areas where your writing style might be improved, such as use of passive and hidden verbs.. |  phrases | Live | Provides a summary of all the phrases that you have repeated in your writing. Try and cut down on repeats.. |  plagiarism | Live | Identifies parts of your text that occur in other documents. Scans millions of web-pages, books, and academic papers.. |  plength | Live | A visual representation of the paragraph lengths of your writing. Avoid writing more than five or six sentences in a paragraph. Also try to avoid too many short paragraphs.. |  preadability | Live | Provides a series of readability measures for your text so you can determine if it is suitable for your intended audience.. |  readability | Live | Provides a series of readability measures for your text so you can determine if it is suitable for your intended audience.. |  sentiment | Live | Shows a histogram of the sentiment in your story so you can monitor large swings.. |  sentimentwords | Development | Highlights words that have a sentiment bias in your text, and grades them.. |  seo | Development | Shows how yout text can be optimized to appear higher in Google rankings.. |  slength | Live | Shows a visual representation of the sentences lengths of your writing. Try and vary the sentence lengths to maintain the interest of the reader.. |  ssentences | Live | Shows sticky sentences in your writing. Sticky sentences slow your reader down; try to avoid them.. |  ssentences_noglue | Live | Shows sticky sentences in your writing. Sticky sentences slow your reader down; try to avoid them.. |  structure | Live | Highlights the key structure of a document such as sentences and paragraphs.. |  thesaurus | Beta | Shows possible replacements for nouns, verbs, adjectives and adverbs.. |  time | Live | Highlights any temporal references in your text so you can check for inconsistency and view the time-line of your text.. |  topics | Live | Suggested topics that are related to the subject matter of your text.. |  transition | Live | Highlights the transitions in your report. Transitions help organize ideas. Writing that is short on transitions is often hard to follow. Non-fiction writing that has under 1 transition per 4 sentences tends to be less understandable.. |  vague | Live | Provides a list of words that may be considered vague or abstract. Consider strengthening them.. |  wordcloud | Live | Shows you a word cloud of the most commonly occuring words in your text.. |  wordsandphrases | Deprecated | Highlights any words and phrases that you have repeated within a short space of writing. Try and think of something else to say.. |  wordsphrases | Live | Highlights any words and phrases that you have repeated within a short space of writing. Try and think of something else to say.. |")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-15T12:42:14.072+01:00")
public class HtmlAnalysisRequest {
  @SerializedName("Html")
  private String html = null;

  @SerializedName("Reports")
  private List<String> reports = new ArrayList<String>();

  /**
   * Document&#39;s writing style
   */
  @JsonAdapter(StyleEnum.Adapter.class)
  public enum StyleEnum {
    NOTSET("NotSet"),
    
    GENERAL("General"),
    
    ACADEMIC("Academic"),
    
    BUSINESS("Business"),
    
    TECHNICAL("Technical"),
    
    CREATIVE("Creative"),
    
    CASUAL("Casual"),
    
    WEB("Web");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StyleEnum fromValue(String text) {
      for (StyleEnum b : StyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StyleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StyleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StyleEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StyleEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Style")
  private StyleEnum style = StyleEnum.GENERAL;

  /**
   * Document&#39;s language. Set correct UK/US language to get region-specific suggestions
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    EN_US("en_US"),
    
    EN_UK("en_UK"),
    
    EN_AU("en_AU"),
    
    EN_CA("en_CA"),
    
    EN("en"),
    
    ES("es");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LanguageEnum fromValue(String text) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return LanguageEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Language")
  private LanguageEnum language = LanguageEnum.EN;

  public HtmlAnalysisRequest html(String html) {
    this.html = html;
    return this;
  }

   /**
   * Html to be processed
   * @return html
  **/
  @ApiModelProperty(required = true, value = "Html to be processed")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }

  public HtmlAnalysisRequest reports(List<String> reports) {
    this.reports = reports;
    return this;
  }

  public HtmlAnalysisRequest addReportsItem(String reportsItem) {
    this.reports.add(reportsItem);
    return this;
  }

   /**
   * List of reports - EXAMPLE: [\&quot;grammar\&quot;,\&quot;overused\&quot;]
   * @return reports
  **/
  @ApiModelProperty(required = true, value = "List of reports - EXAMPLE: [\"grammar\",\"overused\"]")
  public List<String> getReports() {
    return reports;
  }

  public void setReports(List<String> reports) {
    this.reports = reports;
  }

  public HtmlAnalysisRequest style(StyleEnum style) {
    this.style = style;
    return this;
  }

   /**
   * Document&#39;s writing style
   * @return style
  **/
  @ApiModelProperty(required = true, value = "Document's writing style")
  public StyleEnum getStyle() {
    return style;
  }

  public void setStyle(StyleEnum style) {
    this.style = style;
  }

  public HtmlAnalysisRequest language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * Document&#39;s language. Set correct UK/US language to get region-specific suggestions
   * @return language
  **/
  @ApiModelProperty(required = true, value = "Document's language. Set correct UK/US language to get region-specific suggestions")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlAnalysisRequest htmlAnalysisRequest = (HtmlAnalysisRequest) o;
    return Objects.equals(this.html, htmlAnalysisRequest.html) &&
        Objects.equals(this.reports, htmlAnalysisRequest.reports) &&
        Objects.equals(this.style, htmlAnalysisRequest.style) &&
        Objects.equals(this.language, htmlAnalysisRequest.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(html, reports, style, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlAnalysisRequest {\n");
    
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

