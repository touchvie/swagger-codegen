package io.swagger.client.model;

import io.swagger.client.model.AwardsData;
import io.swagger.client.model.CardContainer;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * CardContainer composed by a list of awards with nominees and winners
 **/
@ApiModel(description = "CardContainer composed by a list of awards with nominees and winners")
public class Awards extends CardContainer {
  
  public enum TypeOfContainerEnum {
     text,  listing,  rating,  map,  link,  awards,  catalog,  seasons,  image, 
  };
  @SerializedName("typeOfContainer")
  private TypeOfContainerEnum typeOfContainer = null;
  public enum ContentTypeEnum {
     awards, 
  };
  @SerializedName("content_type")
  private ContentTypeEnum contentType = null;
  @SerializedName("data")
  private List<AwardsData> data = null;

  /**
   * Card container format type, determines the format of the 'data' field
   **/
  @ApiModelProperty(required = true, value = "Card container format type, determines the format of the 'data' field")
  public TypeOfContainerEnum getTypeOfContainer() {
    return typeOfContainer;
  }
  public void setTypeOfContainer(TypeOfContainerEnum typeOfContainer) {
    this.typeOfContainer = typeOfContainer;
  }

  /**
   * Awards container content type
   **/
  @ApiModelProperty(required = true, value = "Awards container content type")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<AwardsData> getData() {
    return data;
  }
  public void setData(List<AwardsData> data) {
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
    Awards awards = (Awards) o;
    return (this.typeOfContainer == null ? awards.typeOfContainer == null : this.typeOfContainer.equals(awards.typeOfContainer)) &&
        (this.contentType == null ? awards.contentType == null : this.contentType.equals(awards.contentType)) &&
        (this.data == null ? awards.data == null : this.data.equals(awards.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (typeOfContainer == null ? 0: typeOfContainer.hashCode());
    result = 31 * result + (contentType == null ? 0: contentType.hashCode());
    result = 31 * result + (data == null ? 0: data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Awards {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  typeOfContainer: ").append(typeOfContainer).append("\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
