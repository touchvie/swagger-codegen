package io.swagger.client.model;

import io.swagger.client.model.CardContainer;
import io.swagger.client.model.TextData;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * CardContainer composed by a block of text with an optional source attribution
 **/
@ApiModel(description = "CardContainer composed by a block of text with an optional source attribution")
public class Text extends CardContainer {
  
  public enum TypeEnum {
     text,  listing,  rating,  map,  link,  awards,  catalog,  seasons,  image, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  public enum ContentTypeEnum {
     overview,  curiosity,  description,  biography,  reference,  quote, 
  };
  @SerializedName("content_type")
  private ContentTypeEnum contentType = null;
  @SerializedName("data")
  private List<TextData> data = null;

  /**
   * Card container format type, determines the format of the 'data' field
   **/
  @ApiModelProperty(required = true, value = "Card container format type, determines the format of the 'data' field")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Text container content type
   **/
  @ApiModelProperty(required = true, value = "Text container content type")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<TextData> getData() {
    return data;
  }
  public void setData(List<TextData> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Text text = (Text) o;
    return (this.type == null ? text.type == null : this.type.equals(text.type)) &&
        (this.contentType == null ? text.contentType == null : this.contentType.equals(text.contentType)) &&
        (this.data == null ? text.data == null : this.data.equals(text.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (type == null ? 0: type.hashCode());
    result = 31 * result + (contentType == null ? 0: contentType.hashCode());
    result = 31 * result + (data == null ? 0: data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Text {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
