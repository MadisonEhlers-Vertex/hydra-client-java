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
import sh.ory.hydra.model.AttributeTypeAndValue;

/**
 * Name Name Name Name Name Name represents an X.509 distinguished name. This only includes the common elements of a DN. When parsing, all elements are stored in Names and non-standard elements can be extracted from there. When marshaling, elements in ExtraNames are appended and override other values with the same OID.
 */
@ApiModel(description = "Name Name Name Name Name Name represents an X.509 distinguished name. This only includes the common elements of a DN. When parsing, all elements are stored in Names and non-standard elements can be extracted from there. When marshaling, elements in ExtraNames are appended and override other values with the same OID.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-08T11:33:47.803525Z[GMT]")
public class Name {
  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private List<String> country = null;

  public static final String SERIALIZED_NAME_EXTRA_NAMES = "ExtraNames";
  @SerializedName(SERIALIZED_NAME_EXTRA_NAMES)
  private List<AttributeTypeAndValue> extraNames = null;

  public static final String SERIALIZED_NAME_LOCALITY = "Locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private List<String> locality = null;

  public static final String SERIALIZED_NAME_NAMES = "Names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<AttributeTypeAndValue> names = null;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "StreetAddress";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private List<String> streetAddress = null;


  public Name country(List<String> country) {
    
    this.country = country;
    return this;
  }

  public Name addCountryItem(String countryItem) {
    if (this.country == null) {
      this.country = new ArrayList<String>();
    }
    this.country.add(countryItem);
    return this;
  }

   /**
   * country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "country")

  public List<String> getCountry() {
    return country;
  }


  public void setCountry(List<String> country) {
    this.country = country;
  }


  public Name extraNames(List<AttributeTypeAndValue> extraNames) {
    
    this.extraNames = extraNames;
    return this;
  }

  public Name addExtraNamesItem(AttributeTypeAndValue extraNamesItem) {
    if (this.extraNames == null) {
      this.extraNames = new ArrayList<AttributeTypeAndValue>();
    }
    this.extraNames.add(extraNamesItem);
    return this;
  }

   /**
   * extra names
   * @return extraNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "extra names")

  public List<AttributeTypeAndValue> getExtraNames() {
    return extraNames;
  }


  public void setExtraNames(List<AttributeTypeAndValue> extraNames) {
    this.extraNames = extraNames;
  }


  public Name locality(List<String> locality) {
    
    this.locality = locality;
    return this;
  }

  public Name addLocalityItem(String localityItem) {
    if (this.locality == null) {
      this.locality = new ArrayList<String>();
    }
    this.locality.add(localityItem);
    return this;
  }

   /**
   * locality
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "locality")

  public List<String> getLocality() {
    return locality;
  }


  public void setLocality(List<String> locality) {
    this.locality = locality;
  }


  public Name names(List<AttributeTypeAndValue> names) {
    
    this.names = names;
    return this;
  }

  public Name addNamesItem(AttributeTypeAndValue namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<AttributeTypeAndValue>();
    }
    this.names.add(namesItem);
    return this;
  }

   /**
   * names
   * @return names
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "names")

  public List<AttributeTypeAndValue> getNames() {
    return names;
  }


  public void setNames(List<AttributeTypeAndValue> names) {
    this.names = names;
  }


  public Name serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * serial number
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "serial number")

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public Name streetAddress(List<String> streetAddress) {
    
    this.streetAddress = streetAddress;
    return this;
  }

  public Name addStreetAddressItem(String streetAddressItem) {
    if (this.streetAddress == null) {
      this.streetAddress = new ArrayList<String>();
    }
    this.streetAddress.add(streetAddressItem);
    return this;
  }

   /**
   * street address
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "street address")

  public List<String> getStreetAddress() {
    return streetAddress;
  }


  public void setStreetAddress(List<String> streetAddress) {
    this.streetAddress = streetAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Name name = (Name) o;
    return Objects.equals(this.country, name.country) &&
        Objects.equals(this.extraNames, name.extraNames) &&
        Objects.equals(this.locality, name.locality) &&
        Objects.equals(this.names, name.names) &&
        Objects.equals(this.serialNumber, name.serialNumber) &&
        Objects.equals(this.streetAddress, name.streetAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, extraNames, locality, names, serialNumber, streetAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    extraNames: ").append(toIndentedString(extraNames)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
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
