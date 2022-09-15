/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.48
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-15T13:47:36.645961205Z[Etc/UTC]")
public class SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody {
  public static final String SERIALIZED_NAME_CSRF_TOKEN = "csrf_token";
  @SerializedName(SERIALIZED_NAME_CSRF_TOKEN)
  private String csrfToken;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_WEBAUTHN_REGISTER = "webauthn_register";
  @SerializedName(SERIALIZED_NAME_WEBAUTHN_REGISTER)
  private String webauthnRegister;

  public static final String SERIALIZED_NAME_WEBAUTHN_REGISTER_DISPLAYNAME = "webauthn_register_displayname";
  @SerializedName(SERIALIZED_NAME_WEBAUTHN_REGISTER_DISPLAYNAME)
  private String webauthnRegisterDisplayname;

  public SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody() { 
  }

  public SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody csrfToken(String csrfToken) {
    
    this.csrfToken = csrfToken;
    return this;
  }

   /**
   * CSRFToken is the anti-CSRF token
   * @return csrfToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CSRFToken is the anti-CSRF token")

  public String getCsrfToken() {
    return csrfToken;
  }


  public void setCsrfToken(String csrfToken) {
    this.csrfToken = csrfToken;
  }


  public SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method  Should be set to \&quot;webauthn\&quot; when trying to add, update, or remove a webAuthn pairing.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method  Should be set to \"webauthn\" when trying to add, update, or remove a webAuthn pairing.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * The identity&#39;s traits
   * @return traits
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The identity's traits")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody webauthnRegister(String webauthnRegister) {
    
    this.webauthnRegister = webauthnRegister;
    return this;
  }

   /**
   * Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.
   * @return webauthnRegister
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Register a WebAuthn Security Key  It is expected that the JSON returned by the WebAuthn registration process is included here.")

  public String getWebauthnRegister() {
    return webauthnRegister;
  }


  public void setWebauthnRegister(String webauthnRegister) {
    this.webauthnRegister = webauthnRegister;
  }


  public SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody webauthnRegisterDisplayname(String webauthnRegisterDisplayname) {
    
    this.webauthnRegisterDisplayname = webauthnRegisterDisplayname;
    return this;
  }

   /**
   * Name of the WebAuthn Security Key to be Added  A human-readable name for the security key which will be added.
   * @return webauthnRegisterDisplayname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the WebAuthn Security Key to be Added  A human-readable name for the security key which will be added.")

  public String getWebauthnRegisterDisplayname() {
    return webauthnRegisterDisplayname;
  }


  public void setWebauthnRegisterDisplayname(String webauthnRegisterDisplayname) {
    this.webauthnRegisterDisplayname = webauthnRegisterDisplayname;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody submitSelfServiceRegistrationFlowWithWebAuthnMethodBody = (SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody) o;
    return Objects.equals(this.csrfToken, submitSelfServiceRegistrationFlowWithWebAuthnMethodBody.csrfToken) &&
        Objects.equals(this.method, submitSelfServiceRegistrationFlowWithWebAuthnMethodBody.method) &&
        Objects.equals(this.traits, submitSelfServiceRegistrationFlowWithWebAuthnMethodBody.traits) &&
        Objects.equals(this.webauthnRegister, submitSelfServiceRegistrationFlowWithWebAuthnMethodBody.webauthnRegister) &&
        Objects.equals(this.webauthnRegisterDisplayname, submitSelfServiceRegistrationFlowWithWebAuthnMethodBody.webauthnRegisterDisplayname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csrfToken, method, traits, webauthnRegister, webauthnRegisterDisplayname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody {\n");
    sb.append("    csrfToken: ").append(toIndentedString(csrfToken)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    webauthnRegister: ").append(toIndentedString(webauthnRegister)).append("\n");
    sb.append("    webauthnRegisterDisplayname: ").append(toIndentedString(webauthnRegisterDisplayname)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("csrf_token");
    openapiFields.add("method");
    openapiFields.add("traits");
    openapiFields.add("webauthn_register");
    openapiFields.add("webauthn_register_displayname");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("traits");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody is not found in the empty JSON string", SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("csrf_token") != null && !jsonObj.get("csrf_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `csrf_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("csrf_token").toString()));
      }
      if (jsonObj.get("method") != null && !jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if (jsonObj.get("webauthn_register") != null && !jsonObj.get("webauthn_register").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webauthn_register` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webauthn_register").toString()));
      }
      if (jsonObj.get("webauthn_register_displayname") != null && !jsonObj.get("webauthn_register_displayname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webauthn_register_displayname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webauthn_register_displayname").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody>() {
           @Override
           public void write(JsonWriter out, SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody
  * @throws IOException if the JSON string is invalid with respect to SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody
  */
  public static SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody.class);
  }

 /**
  * Convert an instance of SubmitSelfServiceRegistrationFlowWithWebAuthnMethodBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

