package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SeasonsChapters  {
  
  @SerializedName("chapter_index")
  private Integer chapterIndex = null;
  @SerializedName("card_id")
  private String cardId = null;

  /**
   * Index of the chapter inside this season
   **/
  @ApiModelProperty(required = true, value = "Index of the chapter inside this season")
  public Integer getChapterIndex() {
    return chapterIndex;
  }
  public void setChapterIndex(Integer chapterIndex) {
    this.chapterIndex = chapterIndex;
  }

  /**
   * ID of the chapter card
   **/
  @ApiModelProperty(required = true, value = "ID of the chapter card")
  public String getCardId() {
    return cardId;
  }
  public void setCardId(String cardId) {
    this.cardId = cardId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeasonsChapters seasonsChapters = (SeasonsChapters) o;
    return (this.chapterIndex == null ? seasonsChapters.chapterIndex == null : this.chapterIndex.equals(seasonsChapters.chapterIndex)) &&
        (this.cardId == null ? seasonsChapters.cardId == null : this.cardId.equals(seasonsChapters.cardId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (chapterIndex == null ? 0: chapterIndex.hashCode());
    result = 31 * result + (cardId == null ? 0: cardId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeasonsChapters {\n");
    
    sb.append("  chapterIndex: ").append(chapterIndex).append("\n");
    sb.append("  cardId: ").append(cardId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
