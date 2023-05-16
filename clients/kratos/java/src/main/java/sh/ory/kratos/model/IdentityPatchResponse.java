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
 * Response for a single identity patch
 */
@ApiModel(description = "Response for a single identity patch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-16T18:55:11.991932+08:00[Asia/Singapore]")
public class IdentityPatchResponse {
  /**
   * The action for this specific patch create ActionCreate  Create this identity.
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    CREATE("create");

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

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_PATCH_ID = "patch_id";
  @SerializedName(SERIALIZED_NAME_PATCH_ID)
  private String patchId;

  public IdentityPatchResponse() {
  }

  public IdentityPatchResponse action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * The action for this specific patch create ActionCreate  Create this identity.
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The action for this specific patch create ActionCreate  Create this identity.")

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public IdentityPatchResponse identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * The identity ID payload of this patch
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identity ID payload of this patch")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public IdentityPatchResponse patchId(String patchId) {
    
    this.patchId = patchId;
    return this;
  }

   /**
   * The ID of this patch response, if an ID was specified in the patch.
   * @return patchId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of this patch response, if an ID was specified in the patch.")

  public String getPatchId() {
    return patchId;
  }


  public void setPatchId(String patchId) {
    this.patchId = patchId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityPatchResponse identityPatchResponse = (IdentityPatchResponse) o;
    return Objects.equals(this.action, identityPatchResponse.action) &&
        Objects.equals(this.identity, identityPatchResponse.identity) &&
        Objects.equals(this.patchId, identityPatchResponse.patchId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, identity, patchId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityPatchResponse {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    patchId: ").append(toIndentedString(patchId)).append("\n");
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
    openapiFields.add("identity");
    openapiFields.add("patch_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IdentityPatchResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IdentityPatchResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IdentityPatchResponse is not found in the empty JSON string", IdentityPatchResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IdentityPatchResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IdentityPatchResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("identity") != null && !jsonObj.get("identity").isJsonNull()) && !jsonObj.get("identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity").toString()));
      }
      if ((jsonObj.get("patch_id") != null && !jsonObj.get("patch_id").isJsonNull()) && !jsonObj.get("patch_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `patch_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("patch_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IdentityPatchResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IdentityPatchResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IdentityPatchResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IdentityPatchResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<IdentityPatchResponse>() {
           @Override
           public void write(JsonWriter out, IdentityPatchResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IdentityPatchResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IdentityPatchResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IdentityPatchResponse
  * @throws IOException if the JSON string is invalid with respect to IdentityPatchResponse
  */
  public static IdentityPatchResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IdentityPatchResponse.class);
  }

 /**
  * Convert an instance of IdentityPatchResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

