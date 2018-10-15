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
import ProWritingAid.SDK.EntryMeaning;
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
 * ThesaurusResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-15T12:42:14.072+01:00")
public class ThesaurusResponse {
  @SerializedName("Word")
  private String word = null;

  @SerializedName("Meanings")
  private List<EntryMeaning> meanings = null;

  public ThesaurusResponse word(String word) {
    this.word = word;
    return this;
  }

   /**
   * The word that was searched
   * @return word
  **/
  @ApiModelProperty(value = "The word that was searched")
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public ThesaurusResponse meanings(List<EntryMeaning> meanings) {
    this.meanings = meanings;
    return this;
  }

  public ThesaurusResponse addMeaningsItem(EntryMeaning meaningsItem) {
    if (this.meanings == null) {
      this.meanings = new ArrayList<EntryMeaning>();
    }
    this.meanings.add(meaningsItem);
    return this;
  }

   /**
   * List of context-specific meanings
   * @return meanings
  **/
  @ApiModelProperty(value = "List of context-specific meanings")
  public List<EntryMeaning> getMeanings() {
    return meanings;
  }

  public void setMeanings(List<EntryMeaning> meanings) {
    this.meanings = meanings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThesaurusResponse thesaurusResponse = (ThesaurusResponse) o;
    return Objects.equals(this.word, thesaurusResponse.word) &&
        Objects.equals(this.meanings, thesaurusResponse.meanings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, meanings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThesaurusResponse {\n");
    
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    meanings: ").append(toIndentedString(meanings)).append("\n");
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
