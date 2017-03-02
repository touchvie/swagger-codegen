package io.swagger.client.model;

import io.swagger.client.model.AwardData;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AwardsData  {
  
  @SerializedName("title")
  private String title = null;
  @SerializedName("nominee")
  private List<AwardData> nominee = null;
  @SerializedName("winner")
  private List<AwardData> winner = null;

  /**
   * Award name
   **/
  @ApiModelProperty(required = true, value = "Award name")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AwardData> getNominee() {
    return nominee;
  }
  public void setNominee(List<AwardData> nominee) {
    this.nominee = nominee;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AwardData> getWinner() {
    return winner;
  }
  public void setWinner(List<AwardData> winner) {
    this.winner = winner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AwardsData awardsData = (AwardsData) o;
    return (this.title == null ? awardsData.title == null : this.title.equals(awardsData.title)) &&
        (this.nominee == null ? awardsData.nominee == null : this.nominee.equals(awardsData.nominee)) &&
        (this.winner == null ? awardsData.winner == null : this.winner.equals(awardsData.winner));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (title == null ? 0: title.hashCode());
    result = 31 * result + (nominee == null ? 0: nominee.hashCode());
    result = 31 * result + (winner == null ? 0: winner.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwardsData {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  nominee: ").append(nominee).append("\n");
    sb.append("  winner: ").append(winner).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
