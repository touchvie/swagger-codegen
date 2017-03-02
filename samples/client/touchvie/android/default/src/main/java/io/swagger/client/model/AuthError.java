package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AuthError  {
  
  @SerializedName("error")
  private String error = null;
  @SerializedName("error_description")
  private String errorDescription = null;

  /**
   * Short error identifier
   **/
  @ApiModelProperty(value = "Short error identifier")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  /**
   * Extended error description
   **/
  @ApiModelProperty(value = "Extended error description")
  public String getErrorDescription() {
    return errorDescription;
  }
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthError authError = (AuthError) o;
    return (this.error == null ? authError.error == null : this.error.equals(authError.error)) &&
        (this.errorDescription == null ? authError.errorDescription == null : this.errorDescription.equals(authError.errorDescription));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (error == null ? 0: error.hashCode());
    result = 31 * result + (errorDescription == null ? 0: errorDescription.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthError {\n");
    
    sb.append("  error: ").append(error).append("\n");
    sb.append("  errorDescription: ").append(errorDescription).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
