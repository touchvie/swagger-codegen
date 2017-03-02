package io.swagger.client.model;

import io.swagger.client.model.SourceData;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class RatingData  {
  
  @SerializedName("value")
  private String value = null;
  @SerializedName("source")
  private SourceData source = null;

  /**
   * Rating value
   **/
  @ApiModelProperty(required = true, value = "Rating value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
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
    RatingData ratingData = (RatingData) o;
    return (this.value == null ? ratingData.value == null : this.value.equals(ratingData.value)) &&
        (this.source == null ? ratingData.source == null : this.source.equals(ratingData.source));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (value == null ? 0: value.hashCode());
    result = 31 * result + (source == null ? 0: source.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingData {\n");
    
    sb.append("  value: ").append(value).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
