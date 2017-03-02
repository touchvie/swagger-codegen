package io.swagger.client.model;

import io.swagger.client.model.SourceData;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class LinkData  {
  
  @SerializedName("url")
  private String url = null;
  @SerializedName("source")
  private SourceData source = null;

  /**
   * URL of the external resource
   **/
  @ApiModelProperty(required = true, value = "URL of the external resource")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
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
    LinkData linkData = (LinkData) o;
    return (this.url == null ? linkData.url == null : this.url.equals(linkData.url)) &&
        (this.source == null ? linkData.source == null : this.source.equals(linkData.source));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (url == null ? 0: url.hashCode());
    result = 31 * result + (source == null ? 0: source.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkData {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  source: ").append(source).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
