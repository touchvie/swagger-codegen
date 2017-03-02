package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ChannelStatus  {
  
  @SerializedName("channel_id")
  private String channelId = null;
  @SerializedName("ready")
  private Boolean ready = null;

  /**
   * Provided channel ID
   **/
  @ApiModelProperty(value = "Provided channel ID")
  public String getChannelId() {
    return channelId;
  }
  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  /**
   * True if channel is broadcasting synchronizable content, False otherwise
   **/
  @ApiModelProperty(value = "True if channel is broadcasting synchronizable content, False otherwise")
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
    ChannelStatus channelStatus = (ChannelStatus) o;
    return (this.channelId == null ? channelStatus.channelId == null : this.channelId.equals(channelStatus.channelId)) &&
        (this.ready == null ? channelStatus.ready == null : this.ready.equals(channelStatus.ready));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (channelId == null ? 0: channelId.hashCode());
    result = 31 * result + (ready == null ? 0: ready.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelStatus {\n");
    
    sb.append("  channelId: ").append(channelId).append("\n");
    sb.append("  ready: ").append(ready).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
