package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Dive interactive capabilities of this catalog item
 **/
@ApiModel(description = "Dive interactive capabilities of this catalog item")
public class CatalogSync  {
  
  @SerializedName("is_synchronizable")
  private Boolean isSynchronizable = null;

  /**
   * Indicates if this catalog item can be synchronized
   **/
  @ApiModelProperty(required = true, value = "Indicates if this catalog item can be synchronized")
  public Boolean getIsSynchronizable() {
    return isSynchronizable;
  }
  public void setIsSynchronizable(Boolean isSynchronizable) {
    this.isSynchronizable = isSynchronizable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogSync catalogSync = (CatalogSync) o;
    return (this.isSynchronizable == null ? catalogSync.isSynchronizable == null : this.isSynchronizable.equals(catalogSync.isSynchronizable));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (isSynchronizable == null ? 0: isSynchronizable.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogSync {\n");
    
    sb.append("  isSynchronizable: ").append(isSynchronizable).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
