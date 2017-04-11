package io.swagger.client.model;

import io.swagger.client.model.DupleData;
import io.swagger.client.model.RelationModule;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * List of related pairs of cards, each pair having a relationship type between both cards
 **/
@ApiModel(description = "List of related pairs of cards, each pair having a relationship type between both cards")
public class Duple extends RelationModule {
  
  public enum TypeOfRelationEnum {
     single,  duple, 
  };
  @SerializedName("typeOfRelation")
  private TypeOfRelationEnum typeOfRelation = null;
  public enum ContentTypeEnum {
     casting,  filmography,  played_by,  worn_by,  featured_in, 
  };
  @SerializedName("content_type")
  private ContentTypeEnum contentType = null;
  @SerializedName("data")
  private List<DupleData> data = null;

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
   * Duple module content type, defines what kind of relations are contained in the module
   **/
  @ApiModelProperty(required = true, value = "Duple module content type, defines what kind of relations are contained in the module")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<DupleData> getData() {
    return data;
  }
  public void setData(List<DupleData> data) {
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
    Duple duple = (Duple) o;
    return (this.typeOfRelation == null ? duple.typeOfRelation == null : this.typeOfRelation.equals(duple.typeOfRelation)) &&
        (this.contentType == null ? duple.contentType == null : this.contentType.equals(duple.contentType)) &&
        (this.data == null ? duple.data == null : this.data.equals(duple.data));
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
    sb.append("class Duple {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  typeOfRelation: ").append(typeOfRelation).append("\n");
    sb.append("  contentType: ").append(contentType).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
