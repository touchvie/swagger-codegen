package io.swagger.client.model;

import io.swagger.client.model.SourceData;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Linked image URL and additional information
 **/
@ApiModel(description = "Linked image URL and additional information")
public class ImageData  {
  
  @SerializedName("thumb")
  private String thumb = null;
  @SerializedName("full")
  private String full = null;
  @SerializedName("anchor_x")
  private BigDecimal anchorX = null;
  @SerializedName("anchor_y")
  private BigDecimal anchorY = null;
  @SerializedName("source")
  private SourceData source = null;

  /**
   * Image thumbnail URL
   **/
  @ApiModelProperty(required = true, value = "Image thumbnail URL")
  public String getThumb() {
    return thumb;
  }
  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  /**
   * Full size image URL
   **/
  @ApiModelProperty(required = true, value = "Full size image URL")
  public String getFull() {
    return full;
  }
  public void setFull(String full) {
    this.full = full;
  }

  /**
   * Image anchor X axis (percent)
   * minimum: 0.0
   * maximum: 100.0
   **/
  @ApiModelProperty(required = true, value = "Image anchor X axis (percent)")
  public BigDecimal getAnchorX() {
    return anchorX;
  }
  public void setAnchorX(BigDecimal anchorX) {
    this.anchorX = anchorX;
  }

  /**
   * Image anchor Y axis (percent)
   * minimum: 0.0
   * maximum: 100.0
   **/
  @ApiModelProperty(required = true, value = "Image anchor Y axis (percent)")
  public BigDecimal getAnchorY() {
    return anchorY;
  }
  public void setAnchorY(BigDecimal anchorY) {
    this.anchorY = anchorY;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SourceData getSource() {
    return source;
  }
  public void setSource(SourceData source) {
    this.source = source;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageData imageData = (ImageData) o;
    return (this.thumb == null ? imageData.thumb == null : this.thumb.equals(imageData.thumb)) &&
        (this.full == null ? imageData.full == null : this.full.equals(imageData.full)) &&
        (this.anchorX == null ? imageData.anchorX == null : this.anchorX.equals(imageData.anchorX)) &&
        (this.anchorY == null ? imageData.anchorY == null : this.anchorY.equals(imageData.anchorY)) &&
        (this.source == null ? imageData.source == null : this.source.equals(imageData.source));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (thumb == null ? 0: thumb.hashCode());
    result = 31 * result + (full == null ? 0: full.hashCode());
    result = 31 * result + (anchorX == null ? 0: anchorX.hashCode());
    result = 31 * result + (anchorY == null ? 0: anchorY.hashCode());
    result = 31 * result + (source == null ? 0: source.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageData {\n");
    
    sb.append("  thumb: ").append(thumb).append("\n");
    sb.append("  full: ").append(full).append("\n");
    sb.append("  anchorX: ").append(anchorX).append("\n");
    sb.append("  anchorY: ").append(anchorY).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
