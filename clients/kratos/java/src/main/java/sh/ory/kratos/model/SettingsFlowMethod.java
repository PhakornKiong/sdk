/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.5.3-alpha.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.model;

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
import sh.ory.kratos.model.SettingsFlowMethodConfig;

/**
 * SettingsFlowMethod
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-10-27T14:03:16.114598Z[GMT]")
public class SettingsFlowMethod {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private SettingsFlowMethodConfig config;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;


  public SettingsFlowMethod config(SettingsFlowMethodConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(required = true, value = "")

  public SettingsFlowMethodConfig getConfig() {
    return config;
  }


  public void setConfig(SettingsFlowMethodConfig config) {
    this.config = config;
  }


  public SettingsFlowMethod method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method is the name of this flow method.
   * @return method
  **/
  @ApiModelProperty(required = true, value = "Method is the name of this flow method.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsFlowMethod settingsFlowMethod = (SettingsFlowMethod) o;
    return Objects.equals(this.config, settingsFlowMethod.config) &&
        Objects.equals(this.method, settingsFlowMethod.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsFlowMethod {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
