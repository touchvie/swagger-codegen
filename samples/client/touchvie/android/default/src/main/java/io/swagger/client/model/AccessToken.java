package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AccessToken  {
  
  @SerializedName("access_token")
  private String accessToken = null;
  public enum TokenTypeEnum {
     bearer, 
  };
  @SerializedName("token_type")
  private TokenTypeEnum tokenType = null;
  @SerializedName("refresh_token")
  private String refreshToken = null;
  @SerializedName("expires_in")
  private Integer expiresIn = null;
  public enum ScopeEnum {
     device, 
  };
  @SerializedName("scope")
  private ScopeEnum scope = null;

  /**
   * Auth token, must be included on every API request
   **/
  @ApiModelProperty(value = "Auth token, must be included on every API request")
  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * Token type
   **/
  @ApiModelProperty(value = "Token type")
  public TokenTypeEnum getTokenType() {
    return tokenType;
  }
  public void setTokenType(TokenTypeEnum tokenType) {
    this.tokenType = tokenType;
  }

  /**
   * Allows to issue new access tokens without resending client credentials
   **/
  @ApiModelProperty(value = "Allows to issue new access tokens without resending client credentials")
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  /**
   * Expiration time (in seconds).
   **/
  @ApiModelProperty(value = "Expiration time (in seconds).")
  public Integer getExpiresIn() {
    return expiresIn;
  }
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  /**
   * Granted auth scope
   **/
  @ApiModelProperty(value = "Granted auth scope")
  public ScopeEnum getScope() {
    return scope;
  }
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessToken accessToken = (AccessToken) o;
    return (this.accessToken == null ? accessToken.accessToken == null : this.accessToken.equals(accessToken.accessToken)) &&
        (this.tokenType == null ? accessToken.tokenType == null : this.tokenType.equals(accessToken.tokenType)) &&
        (this.refreshToken == null ? accessToken.refreshToken == null : this.refreshToken.equals(accessToken.refreshToken)) &&
        (this.expiresIn == null ? accessToken.expiresIn == null : this.expiresIn.equals(accessToken.expiresIn)) &&
        (this.scope == null ? accessToken.scope == null : this.scope.equals(accessToken.scope));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (accessToken == null ? 0: accessToken.hashCode());
    result = 31 * result + (tokenType == null ? 0: tokenType.hashCode());
    result = 31 * result + (refreshToken == null ? 0: refreshToken.hashCode());
    result = 31 * result + (expiresIn == null ? 0: expiresIn.hashCode());
    result = 31 * result + (scope == null ? 0: scope.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessToken {\n");
    
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("  tokenType: ").append(tokenType).append("\n");
    sb.append("  refreshToken: ").append(refreshToken).append("\n");
    sb.append("  expiresIn: ").append(expiresIn).append("\n");
    sb.append("  scope: ").append(scope).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
