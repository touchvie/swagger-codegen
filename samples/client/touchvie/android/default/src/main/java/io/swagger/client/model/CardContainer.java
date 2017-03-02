package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Card static data container. It&#39;s content depends on the &#39;type&#39; parameter value and is represented by the schema of the same name
 **/
@ApiModel(description = "Card static data container. It's content depends on the 'type' parameter value and is represented by the schema of the same name")
public class CardContainer  {
  
  public enum TypeEnum {
     text,  listing,  rating,  map,  link,  awards,  catalog,  seasons,  image, 
  };
  @SerializedName("type")
  private TypeEnum type = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardContainer cardContainer = (CardContainer) o;
    return (this.type == null ? cardContainer.type == null : this.type.equals(cardContainer.type));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (type == null ? 0: type.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardContainer {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
