package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Card static data container. It&#39;s content depends on the &#39;type&#39; parameter value and is represented by the schema of the same name
 **/
@ApiModel(description = "Card static data container. It's content depends on the 'type' parameter value and is represented by the schema of the same name")
public class CardContainer  {
  
  public enum TypeOfContainerEnum {
     text,  listing,  rating,  map,  link,  awards,  catalog,  seasons,  image, 
  };
  @SerializedName("typeOfContainer")
  private TypeOfContainerEnum typeOfContainer = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardContainer cardContainer = (CardContainer) o;
    return (this.typeOfContainer == null ? cardContainer.typeOfContainer == null : this.typeOfContainer.equals(cardContainer.typeOfContainer));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (typeOfContainer == null ? 0: typeOfContainer.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardContainer {\n");
    
    sb.append("  typeOfContainer: ").append(typeOfContainer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
