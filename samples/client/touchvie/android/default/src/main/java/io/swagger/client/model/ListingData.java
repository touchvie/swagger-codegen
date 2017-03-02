package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ListingData  {
  
  @SerializedName("text")
  private String text = null;
  @SerializedName("value")
  private String value = null;

  /**
   * Item label
   **/
  @ApiModelProperty(required = true, value = "Item label")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Item value
   **/
  @ApiModelProperty(required = true, value = "Item value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListingData listingData = (ListingData) o;
    return (this.text == null ? listingData.text == null : this.text.equals(listingData.text)) &&
        (this.value == null ? listingData.value == null : this.value.equals(listingData.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (text == null ? 0: text.hashCode());
    result = 31 * result + (value == null ? 0: value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListingData {\n");
    
    sb.append("  text: ").append(text).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
