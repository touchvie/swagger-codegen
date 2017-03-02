package io.swagger.client.model;

import io.swagger.client.model.Card;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class DupleData  {
  
  @SerializedName("rel_type")
  private String relType = null;
  @SerializedName("from")
  private Card from = null;
  @SerializedName("to")
  private Card to = null;

  /**
   * Indicates the relationship between the pair of cards (from > rel_type > to)
   **/
  @ApiModelProperty(required = true, value = "Indicates the relationship between the pair of cards (from > rel_type > to)")
  public String getRelType() {
    return relType;
  }
  public void setRelType(String relType) {
    this.relType = relType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Card getFrom() {
    return from;
  }
  public void setFrom(Card from) {
    this.from = from;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Card getTo() {
    return to;
  }
  public void setTo(Card to) {
    this.to = to;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DupleData dupleData = (DupleData) o;
    return (this.relType == null ? dupleData.relType == null : this.relType.equals(dupleData.relType)) &&
        (this.from == null ? dupleData.from == null : this.from.equals(dupleData.from)) &&
        (this.to == null ? dupleData.to == null : this.to.equals(dupleData.to));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (relType == null ? 0: relType.hashCode());
    result = 31 * result + (from == null ? 0: from.hashCode());
    result = 31 * result + (to == null ? 0: to.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DupleData {\n");
    
    sb.append("  relType: ").append(relType).append("\n");
    sb.append("  from: ").append(from).append("\n");
    sb.append("  to: ").append(to).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
