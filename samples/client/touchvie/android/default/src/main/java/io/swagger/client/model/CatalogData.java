package io.swagger.client.model;

import io.swagger.client.model.CatalogSync;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CatalogData  {
  
  @SerializedName("background_image")
  private String backgroundImage = null;
  @SerializedName("director")
  private String director = null;
  @SerializedName("genres")
  private List<String> genres = null;
  @SerializedName("original_title")
  private String originalTitle = null;
  @SerializedName("runtime")
  private Integer runtime = null;
  @SerializedName("year")
  private Integer year = null;
  @SerializedName("chapter_index")
  private Integer chapterIndex = null;
  @SerializedName("season_index")
  private Integer seasonIndex = null;
  @SerializedName("sync")
  private CatalogSync sync = null;

  /**
   * URL of an additional background image for this catalog element
   **/
  @ApiModelProperty(value = "URL of an additional background image for this catalog element")
  public String getBackgroundImage() {
    return backgroundImage;
  }
  public void setBackgroundImage(String backgroundImage) {
    this.backgroundImage = backgroundImage;
  }

  /**
   * Name of the director
   **/
  @ApiModelProperty(required = true, value = "Name of the director")
  public String getDirector() {
    return director;
  }
  public void setDirector(String director) {
    this.director = director;
  }

  /**
   * List of genres of this catalog entry
   **/
  @ApiModelProperty(required = true, value = "List of genres of this catalog entry")
  public List<String> getGenres() {
    return genres;
  }
  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  /**
   * Original language title
   **/
  @ApiModelProperty(required = true, value = "Original language title")
  public String getOriginalTitle() {
    return originalTitle;
  }
  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }

  /**
   * Length of the movie or chapter, or average length of serie chapters, in minutes
   **/
  @ApiModelProperty(required = true, value = "Length of the movie or chapter, or average length of serie chapters, in minutes")
  public Integer getRuntime() {
    return runtime;
  }
  public void setRuntime(Integer runtime) {
    this.runtime = runtime;
  }

  /**
   * Year of production
   **/
  @ApiModelProperty(required = true, value = "Year of production")
  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }

  /**
   * Index of the chapter inside its season (only for content_type=chapter)
   **/
  @ApiModelProperty(value = "Index of the chapter inside its season (only for content_type=chapter)")
  public Integer getChapterIndex() {
    return chapterIndex;
  }
  public void setChapterIndex(Integer chapterIndex) {
    this.chapterIndex = chapterIndex;
  }

  /**
   * Index of the season where the chapter belongs (only for content_type=chapter)
   **/
  @ApiModelProperty(value = "Index of the season where the chapter belongs (only for content_type=chapter)")
  public Integer getSeasonIndex() {
    return seasonIndex;
  }
  public void setSeasonIndex(Integer seasonIndex) {
    this.seasonIndex = seasonIndex;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public CatalogSync getSync() {
    return sync;
  }
  public void setSync(CatalogSync sync) {
    this.sync = sync;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogData catalogData = (CatalogData) o;
    return (this.backgroundImage == null ? catalogData.backgroundImage == null : this.backgroundImage.equals(catalogData.backgroundImage)) &&
        (this.director == null ? catalogData.director == null : this.director.equals(catalogData.director)) &&
        (this.genres == null ? catalogData.genres == null : this.genres.equals(catalogData.genres)) &&
        (this.originalTitle == null ? catalogData.originalTitle == null : this.originalTitle.equals(catalogData.originalTitle)) &&
        (this.runtime == null ? catalogData.runtime == null : this.runtime.equals(catalogData.runtime)) &&
        (this.year == null ? catalogData.year == null : this.year.equals(catalogData.year)) &&
        (this.chapterIndex == null ? catalogData.chapterIndex == null : this.chapterIndex.equals(catalogData.chapterIndex)) &&
        (this.seasonIndex == null ? catalogData.seasonIndex == null : this.seasonIndex.equals(catalogData.seasonIndex)) &&
        (this.sync == null ? catalogData.sync == null : this.sync.equals(catalogData.sync));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (backgroundImage == null ? 0: backgroundImage.hashCode());
    result = 31 * result + (director == null ? 0: director.hashCode());
    result = 31 * result + (genres == null ? 0: genres.hashCode());
    result = 31 * result + (originalTitle == null ? 0: originalTitle.hashCode());
    result = 31 * result + (runtime == null ? 0: runtime.hashCode());
    result = 31 * result + (year == null ? 0: year.hashCode());
    result = 31 * result + (chapterIndex == null ? 0: chapterIndex.hashCode());
    result = 31 * result + (seasonIndex == null ? 0: seasonIndex.hashCode());
    result = 31 * result + (sync == null ? 0: sync.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogData {\n");
    
    sb.append("  backgroundImage: ").append(backgroundImage).append("\n");
    sb.append("  director: ").append(director).append("\n");
    sb.append("  genres: ").append(genres).append("\n");
    sb.append("  originalTitle: ").append(originalTitle).append("\n");
    sb.append("  runtime: ").append(runtime).append("\n");
    sb.append("  year: ").append(year).append("\n");
    sb.append("  chapterIndex: ").append(chapterIndex).append("\n");
    sb.append("  seasonIndex: ").append(seasonIndex).append("\n");
    sb.append("  sync: ").append(sync).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
