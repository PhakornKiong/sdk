/*
 * Ory Identities API
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.13.2
 * Contact: office@ory.sh
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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.kratos.JSON;

/**
 * Indicates that a session was issued, and the application should use this token for authenticated requests
 */
@ApiModel(description = "Indicates that a session was issued, and the application should use this token for authenticated requests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-16T18:55:11.991932+08:00[Asia/Singapore]")
public class ContinueWithSetOrySessionToken {
  /**
   * Action will always be &#x60;set_ory_session_token&#x60; set_ory_session_token ContinueWithActionSetOrySessionToken show_verification_ui ContinueWithActionShowVerificationUI
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    SET_ORY_SESSION_TOKEN("set_ory_session_token"),
    
    SHOW_VERIFICATION_UI("show_verification_ui");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_ORY_SESSION_TOKEN = "ory_session_token";
  @SerializedName(SERIALIZED_NAME_ORY_SESSION_TOKEN)
  private String orySessionToken;

  public ContinueWithSetOrySessionToken() {
  }

  public ContinueWithSetOrySessionToken action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Action will always be &#x60;set_ory_session_token&#x60; set_ory_session_token ContinueWithActionSetOrySessionToken show_verification_ui ContinueWithActionShowVerificationUI
   * @return action
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Action will always be `set_ory_session_token` set_ory_session_token ContinueWithActionSetOrySessionToken show_verification_ui ContinueWithActionShowVerificationUI")

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public ContinueWithSetOrySessionToken orySessionToken(String orySessionToken) {
    
    this.orySessionToken = orySessionToken;
    return this;
  }

   /**
   * Token is the token of the session
   * @return orySessionToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Token is the token of the session")

  public String getOrySessionToken() {
    return orySessionToken;
  }


  public void setOrySessionToken(String orySessionToken) {
    this.orySessionToken = orySessionToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContinueWithSetOrySessionToken continueWithSetOrySessionToken = (ContinueWithSetOrySessionToken) o;
    return Objects.equals(this.action, continueWithSetOrySessionToken.action) &&
        Objects.equals(this.orySessionToken, continueWithSetOrySessionToken.orySessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, orySessionToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContinueWithSetOrySessionToken {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    orySessionToken: ").append(toIndentedString(orySessionToken)).append("\n");
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
    openapiFields.add("action");
    openapiFields.add("ory_session_token");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action");
    openapiRequiredFields.add("ory_session_token");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContinueWithSetOrySessionToken
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContinueWithSetOrySessionToken.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContinueWithSetOrySessionToken is not found in the empty JSON string", ContinueWithSetOrySessionToken.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContinueWithSetOrySessionToken.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContinueWithSetOrySessionToken` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContinueWithSetOrySessionToken.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if (!jsonObj.get("ory_session_token").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ory_session_token` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ory_session_token").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContinueWithSetOrySessionToken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContinueWithSetOrySessionToken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContinueWithSetOrySessionToken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContinueWithSetOrySessionToken.class));

       return (TypeAdapter<T>) new TypeAdapter<ContinueWithSetOrySessionToken>() {
           @Override
           public void write(JsonWriter out, ContinueWithSetOrySessionToken value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContinueWithSetOrySessionToken read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContinueWithSetOrySessionToken given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContinueWithSetOrySessionToken
  * @throws IOException if the JSON string is invalid with respect to ContinueWithSetOrySessionToken
  */
  public static ContinueWithSetOrySessionToken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContinueWithSetOrySessionToken.class);
  }

 /**
  * Convert an instance of ContinueWithSetOrySessionToken to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

