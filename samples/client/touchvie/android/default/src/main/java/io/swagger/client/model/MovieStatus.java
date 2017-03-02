package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class MovieStatus  {
  
  @SerializedName("movie_id")
  private String movieId = null;
  @SerializedName("ready")
  private Boolean ready = null;

  /**
   * Provided client movie ID
   **/
  @ApiModelProperty(value = "Provided client movie ID")
  public String getMovieId() {
    return movieId;
  }
  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  /**
   * True if movie can be synchronized via this API, False otherwise.
   **/
  @ApiModelProperty(value = "True if movie can be synchronized via this API, False otherwise.")
  public Boolean getReady() {
    return ready;
  }
  public void setReady(Boolean ready) {
    this.ready = ready;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieStatus movieStatus = (MovieStatus) o;
    return (this.movieId == null ? movieStatus.movieId == null : this.movieId.equals(movieStatus.movieId)) &&
        (this.ready == null ? movieStatus.ready == null : this.ready.equals(movieStatus.ready));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (movieId == null ? 0: movieId.hashCode());
    result = 31 * result + (ready == null ? 0: ready.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieStatus {\n");
    
    sb.append("  movieId: ").append(movieId).append("\n");
    sb.append("  ready: ").append(ready).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
