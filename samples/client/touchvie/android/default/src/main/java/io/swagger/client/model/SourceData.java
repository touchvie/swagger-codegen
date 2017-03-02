package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Information regarding the source of any API item
 **/
@ApiModel(description = "Information regarding the source of any API item")
public class SourceData  {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("disclaimer")
  private String disclaimer = null;
  @SerializedName("image")
  private String image = null;

  /**
   * Name of the source
   **/
  @ApiModelProperty(required = true, value = "Name of the source")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * URL of the source
   **/
  @ApiModelProperty(required = true, value = "URL of the source")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Disclaimer text of the source
   **/
  @ApiModelProperty(value = "Disclaimer text of the source")
  public String getDisclaimer() {
    return disclaimer;
  }
  public void setDisclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
  }

  /**
   * URL of the source icon
   **/
  @ApiModelProperty(value = "URL of the source icon")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceData sourceData = (SourceData) o;
    return (this.name == null ? sourceData.name == null : this.name.equals(sourceData.name)) &&
        (this.url == null ? sourceData.url == null : this.url.equals(sourceData.url)) &&
        (this.disclaimer == null ? sourceData.disclaimer == null : this.disclaimer.equals(sourceData.disclaimer)) &&
        (this.image == null ? sourceData.image == null : this.image.equals(sourceData.image));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (url == null ? 0: url.hashCode());
    result = 31 * result + (disclaimer == null ? 0: disclaimer.hashCode());
    result = 31 * result + (image == null ? 0: image.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceData {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  disclaimer: ").append(disclaimer).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
