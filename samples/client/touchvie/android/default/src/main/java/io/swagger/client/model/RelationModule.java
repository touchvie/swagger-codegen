package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Relation modules provide lists of cards related to the current one. It&#39;s contents depend on the module &#39;type&#39; attribute
 **/
@ApiModel(description = "Relation modules provide lists of cards related to the current one. It's contents depend on the module 'type' attribute")
public class RelationModule  {
  
  public enum TypeOfRelationEnum {
     single,  duple, 
  };
  @SerializedName("typeOfRelation")
  private TypeOfRelationEnum typeOfRelation = null;

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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationModule relationModule = (RelationModule) o;
    return (this.typeOfRelation == null ? relationModule.typeOfRelation == null : this.typeOfRelation.equals(relationModule.typeOfRelation));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (typeOfRelation == null ? 0: typeOfRelation.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationModule {\n");
    
    sb.append("  typeOfRelation: ").append(typeOfRelation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
