package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class MapData  {
  
  @SerializedName("latitude")
  private Float latitude = null;
  @SerializedName("longitude")
  private Float longitude = null;
  @SerializedName("zoom")
  private Integer zoom = null;

  /**
   * Value of the location latitude, in decimal format degrees
   **/
  @ApiModelProperty(required = true, value = "Value of the location latitude, in decimal format degrees")
  public Float getLatitude() {
    return latitude;
  }
  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  /**
   * Value of the location longitude, in decimal format degrees
   **/
  @ApiModelProperty(required = true, value = "Value of the location longitude, in decimal format degrees")
  public Float getLongitude() {
    return longitude;
  }
  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  /**
   * Zoom value, defines the height coordinate over the given location
   **/
  @ApiModelProperty(required = true, value = "Zoom value, defines the height coordinate over the given location")
  public Integer getZoom() {
    return zoom;
  }
  public void setZoom(Integer zoom) {
    this.zoom = zoom;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MapData mapData = (MapData) o;
    return (this.latitude == null ? mapData.latitude == null : this.latitude.equals(mapData.latitude)) &&
        (this.longitude == null ? mapData.longitude == null : this.longitude.equals(mapData.longitude)) &&
        (this.zoom == null ? mapData.zoom == null : this.zoom.equals(mapData.zoom));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (latitude == null ? 0: latitude.hashCode());
    result = 31 * result + (longitude == null ? 0: longitude.hashCode());
    result = 31 * result + (zoom == null ? 0: zoom.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapData {\n");
    
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  zoom: ").append(zoom).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
