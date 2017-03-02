package io.swagger.client.model;

import io.swagger.client.model.CardContainer;
import io.swagger.client.model.MapData;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * CardContainer composed by a map of a given location
 **/
@ApiModel(description = "CardContainer composed by a map of a given location")
public class Map extends CardContainer {
  
  public enum TypeEnum {
     text,  listing,  rating,  map,  link,  awards,  catalog,  seasons,  image, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  public enum ContentTypeEnum {
     location, 
  };
  @SerializedName("content_type")
  private ContentTypeEnum contentType = null;
  @SerializedName("data")
  private List<MapData> data = null;

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
   * Map container content type
   **/
  @ApiModelProperty(required = true, value = "Map container content type")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<MapData> getData() {
    return data;
  }
  public void setData(List<MapData> data) {
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
    Map map = (Map) o;
    return (this.type == null ? map.type == null : this.type.equals(map.type)) &&
        (this.contentType == null ? map.contentType == null : this.contentType.equals(map.contentType)) &&
        (this.data == null ? map.data == null : this.data.equals(map.data));
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
    sb.append("class Map {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
