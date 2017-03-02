package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Award nominee or winner info
 **/
@ApiModel(description = "Award nominee or winner info")
public class AwardData  {
  
  @SerializedName("title")
  private String title = null;
  @SerializedName("value")
  private String value = null;

  /**
   * Name of the prize
   **/
  @ApiModelProperty(required = true, value = "Name of the prize")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Name of the nominee / winner
   **/
  @ApiModelProperty(required = true, value = "Name of the nominee / winner")
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
    AwardData awardData = (AwardData) o;
    return (this.title == null ? awardData.title == null : this.title.equals(awardData.title)) &&
        (this.value == null ? awardData.value == null : this.value.equals(awardData.value));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (title == null ? 0: title.hashCode());
    result = 31 * result + (value == null ? 0: value.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwardData {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
