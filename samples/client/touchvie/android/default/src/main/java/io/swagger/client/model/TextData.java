package io.swagger.client.model;

import io.swagger.client.model.SourceData;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class TextData  {
  
  @SerializedName("text")
  private String text = null;
  @SerializedName("source")
  private SourceData source = null;

  /**
   * Informational text
   **/
  @ApiModelProperty(required = true, value = "Informational text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SourceData getSource() {
    return source;
  }
  public void setSource(SourceData source) {
    this.source = source;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextData textData = (TextData) o;
    return (this.text == null ? textData.text == null : this.text.equals(textData.text)) &&
        (this.source == null ? textData.source == null : this.source.equals(textData.source));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (text == null ? 0: text.hashCode());
    result = 31 * result + (source == null ? 0: source.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextData {\n");
    
    sb.append("  text: ").append(text).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
