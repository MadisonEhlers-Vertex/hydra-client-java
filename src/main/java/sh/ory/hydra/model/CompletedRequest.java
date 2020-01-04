/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CompletedRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-04T16:07:21.623668+01:00[Europe/Berlin]")
public class CompletedRequest {
  public static final String SERIALIZED_NAME_REDIRECT_TO = "redirect_to";
  @SerializedName(SERIALIZED_NAME_REDIRECT_TO)
  private String redirectTo;


  public CompletedRequest redirectTo(String redirectTo) {
    
    this.redirectTo = redirectTo;
    return this;
  }

   /**
   * RedirectURL is the URL which you should redirect the user to once the authentication process is completed.
   * @return redirectTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RedirectURL is the URL which you should redirect the user to once the authentication process is completed.")

  public String getRedirectTo() {
    return redirectTo;
  }


  public void setRedirectTo(String redirectTo) {
    this.redirectTo = redirectTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompletedRequest completedRequest = (CompletedRequest) o;
    return Objects.equals(this.redirectTo, completedRequest.redirectTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletedRequest {\n");
    sb.append("    redirectTo: ").append(toIndentedString(redirectTo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

