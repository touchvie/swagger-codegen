package io.swagger.client.model;

import io.swagger.client.model.Card;
import io.swagger.client.model.RelationModule;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * List of related single cards. The relation type is defined by the module content type
 **/
@ApiModel(description = "List of related single cards. The relation type is defined by the module content type")
public class Single extends RelationModule {
  
  public enum TypeOfRelationEnum {
     single,  duple, 
  };
  @SerializedName("typeOfRelation")
  private TypeOfRelationEnum typeOfRelation = null;
  public enum ContentTypeEnum {
     trivias,  directors,  appears_in,  full_looks,  look_fashion,  fashion_set,  full_home,  home_deco,  tracklist,  sounds_in,  is_part_of,  is_chapter_of,  wears, 
  };
  @SerializedName("content_type")
  private ContentTypeEnum contentType = null;
  @SerializedName("data")
  private List<Card> data = null;

  /**
   * Relation module type, defines the contained data structure
   **/
  @ApiModelProperty(required = true, value = "Relation module type, defines the contained data structure")
  public TypeOfRelationEnum getTypeOfRelation() {
    return typeOfRelation;
  }
  public void setTypeOfRelation(TypeOfRelationEnum typeOfRelation) {
    this.typeOfRelation = typeOfRelation;
  }

  /**
   * Single module content type, defines what kind of relations are contained in the module
   **/
  @ApiModelProperty(required = true, value = "Single module content type, defines what kind of relations are contained in the module")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Card> getData() {
    return data;
  }
  public void setData(List<Card> data) {
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
    Single single = (Single) o;
    return (this.typeOfRelation == null ? single.typeOfRelation == null : this.typeOfRelation.equals(single.typeOfRelation)) &&
        (this.contentType == null ? single.contentType == null : this.contentType.equals(single.contentType)) &&
        (this.data == null ? single.data == null : this.data.equals(single.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (typeOfRelation == null ? 0: typeOfRelation.hashCode());
    result = 31 * result + (contentType == null ? 0: contentType.hashCode());
    result = 31 * result + (data == null ? 0: data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Single {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  typeOfRelation: ").append(typeOfRelation).append("\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
