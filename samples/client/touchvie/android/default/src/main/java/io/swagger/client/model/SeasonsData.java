package io.swagger.client.model;

import io.swagger.client.model.ImageData;
import io.swagger.client.model.SeasonsChapters;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SeasonsData  {
  
  @SerializedName("season_index")
  private Integer seasonIndex = null;
  @SerializedName("creators")
  private String creators = null;
  @SerializedName("image")
  private ImageData image = null;
  @SerializedName("year")
  private Integer year = null;
  @SerializedName("chapters")
  private List<SeasonsChapters> chapters = null;

  /**
   * Index of the season
   **/
  @ApiModelProperty(required = true, value = "Index of the season")
  public Integer getSeasonIndex() {
    return seasonIndex;
  }
  public void setSeasonIndex(Integer seasonIndex) {
    this.seasonIndex = seasonIndex;
  }

  /**
   * Comma separated list of season creators
   **/
  @ApiModelProperty(required = true, value = "Comma separated list of season creators")
  public String getCreators() {
    return creators;
  }
  public void setCreators(String creators) {
    this.creators = creators;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public ImageData getImage() {
    return image;
  }
  public void setImage(ImageData image) {
    this.image = image;
  }

  /**
   * Year of production of this season
   **/
  @ApiModelProperty(required = true, value = "Year of production of this season")
  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }

  /**
   * List of season chapters
   **/
  @ApiModelProperty(required = true, value = "List of season chapters")
  public List<SeasonsChapters> getChapters() {
    return chapters;
  }
  public void setChapters(List<SeasonsChapters> chapters) {
    this.chapters = chapters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeasonsData seasonsData = (SeasonsData) o;
    return (this.seasonIndex == null ? seasonsData.seasonIndex == null : this.seasonIndex.equals(seasonsData.seasonIndex)) &&
        (this.creators == null ? seasonsData.creators == null : this.creators.equals(seasonsData.creators)) &&
        (this.image == null ? seasonsData.image == null : this.image.equals(seasonsData.image)) &&
        (this.year == null ? seasonsData.year == null : this.year.equals(seasonsData.year)) &&
        (this.chapters == null ? seasonsData.chapters == null : this.chapters.equals(seasonsData.chapters));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (seasonIndex == null ? 0: seasonIndex.hashCode());
    result = 31 * result + (creators == null ? 0: creators.hashCode());
    result = 31 * result + (image == null ? 0: image.hashCode());
    result = 31 * result + (year == null ? 0: year.hashCode());
    result = 31 * result + (chapters == null ? 0: chapters.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeasonsData {\n");
    
    sb.append("  seasonIndex: ").append(seasonIndex).append("\n");
    sb.append("  creators: ").append(creators).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("  year: ").append(year).append("\n");
    sb.append("  chapters: ").append(chapters).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
