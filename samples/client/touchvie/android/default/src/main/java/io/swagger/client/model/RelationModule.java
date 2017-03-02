package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Relation modules provide lists of cards related to the current one. It&#39;s contents depend on the module &#39;type&#39; attribute
 **/
@ApiModel(description = "Relation modules provide lists of cards related to the current one. It's contents depend on the module 'type' attribute")
public class RelationModule  {
  
  public enum TypeEnum {
     single,  duple, 
  };
  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Relation module type, defines the contained data structure
   **/
  @ApiModelProperty(required = true, value = "Relation module type, defines the contained data structure")
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
    RelationModule relationModule = (RelationModule) o;
    return (this.type == null ? relationModule.type == null : this.type.equals(relationModule.type));
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
    sb.append("class RelationModule {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
