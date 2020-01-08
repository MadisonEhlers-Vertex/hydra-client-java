/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: latest
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
import java.util.ArrayList;
import java.util.List;

/**
 * IPNet
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-08T11:33:47.803525Z[GMT]")
public class IPNet {
  public static final String SERIALIZED_NAME_I_P = "IP";
  @SerializedName(SERIALIZED_NAME_I_P)
  private List<Integer> IP = null;

  public static final String SERIALIZED_NAME_MASK = "Mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private List<Integer> mask = null;


  public IPNet IP(List<Integer> IP) {
    
    this.IP = IP;
    return this;
  }

  public IPNet addIPItem(Integer IPItem) {
    if (this.IP == null) {
      this.IP = new ArrayList<Integer>();
    }
    this.IP.add(IPItem);
    return this;
  }

   /**
   * Note that in this documentation, referring to an IP address as an IPv4 address or an IPv6 address is a semantic property of the address, not just the length of the byte slice: a 16-byte slice can still be an IPv4 address.
   * @return IP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Note that in this documentation, referring to an IP address as an IPv4 address or an IPv6 address is a semantic property of the address, not just the length of the byte slice: a 16-byte slice can still be an IPv4 address.")

  public List<Integer> getIP() {
    return IP;
  }


  public void setIP(List<Integer> IP) {
    this.IP = IP;
  }


  public IPNet mask(List<Integer> mask) {
    
    this.mask = mask;
    return this;
  }

  public IPNet addMaskItem(Integer maskItem) {
    if (this.mask == null) {
      this.mask = new ArrayList<Integer>();
    }
    this.mask.add(maskItem);
    return this;
  }

   /**
   * Get mask
   * @return mask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getMask() {
    return mask;
  }


  public void setMask(List<Integer> mask) {
    this.mask = mask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPNet ipNet = (IPNet) o;
    return Objects.equals(this.IP, ipNet.IP) &&
        Objects.equals(this.mask, ipNet.mask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IP, mask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPNet {\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
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

