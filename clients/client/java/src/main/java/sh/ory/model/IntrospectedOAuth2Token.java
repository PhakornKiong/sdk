/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.25
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import sh.ory.JSON;

/**
 * Introspection contains an access token&#39;s session data as specified by [IETF RFC 7662](https://tools.ietf.org/html/rfc7662)
 */
@ApiModel(description = "Introspection contains an access token's session data as specified by [IETF RFC 7662](https://tools.ietf.org/html/rfc7662)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-24T08:24:45.436303324Z[Etc/UTC]")
public class IntrospectedOAuth2Token {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_AUD = "aud";
  @SerializedName(SERIALIZED_NAME_AUD)
  private List<String> aud = null;

  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_EXP = "exp";
  @SerializedName(SERIALIZED_NAME_EXP)
  private Long exp;

  public static final String SERIALIZED_NAME_EXT = "ext";
  @SerializedName(SERIALIZED_NAME_EXT)
  private Map<String, Object> ext = null;

  public static final String SERIALIZED_NAME_IAT = "iat";
  @SerializedName(SERIALIZED_NAME_IAT)
  private Long iat;

  public static final String SERIALIZED_NAME_ISS = "iss";
  @SerializedName(SERIALIZED_NAME_ISS)
  private String iss;

  public static final String SERIALIZED_NAME_NBF = "nbf";
  @SerializedName(SERIALIZED_NAME_NBF)
  private Long nbf;

  public static final String SERIALIZED_NAME_OBFUSCATED_SUBJECT = "obfuscated_subject";
  @SerializedName(SERIALIZED_NAME_OBFUSCATED_SUBJECT)
  private String obfuscatedSubject;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_SUB = "sub";
  @SerializedName(SERIALIZED_NAME_SUB)
  private String sub;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "token_type";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public static final String SERIALIZED_NAME_TOKEN_USE = "token_use";
  @SerializedName(SERIALIZED_NAME_TOKEN_USE)
  private String tokenUse;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public IntrospectedOAuth2Token() {
  }

  public IntrospectedOAuth2Token active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Active is a boolean indicator of whether or not the presented token is currently active.  The specifics of a token&#39;s \&quot;active\&quot; state will vary depending on the implementation of the authorization server and the information it keeps about its tokens, but a \&quot;true\&quot; value return for the \&quot;active\&quot; property will generally indicate that a given token has been issued by this authorization server, has not been revoked by the resource owner, and is within its given time window of validity (e.g., after its issuance time and before its expiration time).
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Active is a boolean indicator of whether or not the presented token is currently active.  The specifics of a token's \"active\" state will vary depending on the implementation of the authorization server and the information it keeps about its tokens, but a \"true\" value return for the \"active\" property will generally indicate that a given token has been issued by this authorization server, has not been revoked by the resource owner, and is within its given time window of validity (e.g., after its issuance time and before its expiration time).")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public IntrospectedOAuth2Token aud(List<String> aud) {
    
    this.aud = aud;
    return this;
  }

  public IntrospectedOAuth2Token addAudItem(String audItem) {
    if (this.aud == null) {
      this.aud = new ArrayList<>();
    }
    this.aud.add(audItem);
    return this;
  }

   /**
   * Audience contains a list of the token&#39;s intended audiences.
   * @return aud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Audience contains a list of the token's intended audiences.")

  public List<String> getAud() {
    return aud;
  }


  public void setAud(List<String> aud) {
    this.aud = aud;
  }


  public IntrospectedOAuth2Token clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * ID is aclient identifier for the OAuth 2.0 client that requested this token.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID is aclient identifier for the OAuth 2.0 client that requested this token.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public IntrospectedOAuth2Token exp(Long exp) {
    
    this.exp = exp;
    return this;
  }

   /**
   * Expires at is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token will expire.
   * @return exp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expires at is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token will expire.")

  public Long getExp() {
    return exp;
  }


  public void setExp(Long exp) {
    this.exp = exp;
  }


  public IntrospectedOAuth2Token ext(Map<String, Object> ext) {
    
    this.ext = ext;
    return this;
  }

  public IntrospectedOAuth2Token putExtItem(String key, Object extItem) {
    if (this.ext == null) {
      this.ext = new HashMap<>();
    }
    this.ext.put(key, extItem);
    return this;
  }

   /**
   * Extra is arbitrary data set by the session.
   * @return ext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra is arbitrary data set by the session.")

  public Map<String, Object> getExt() {
    return ext;
  }


  public void setExt(Map<String, Object> ext) {
    this.ext = ext;
  }


  public IntrospectedOAuth2Token iat(Long iat) {
    
    this.iat = iat;
    return this;
  }

   /**
   * Issued at is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token was originally issued.
   * @return iat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Issued at is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token was originally issued.")

  public Long getIat() {
    return iat;
  }


  public void setIat(Long iat) {
    this.iat = iat;
  }


  public IntrospectedOAuth2Token iss(String iss) {
    
    this.iss = iss;
    return this;
  }

   /**
   * IssuerURL is a string representing the issuer of this token
   * @return iss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IssuerURL is a string representing the issuer of this token")

  public String getIss() {
    return iss;
  }


  public void setIss(String iss) {
    this.iss = iss;
  }


  public IntrospectedOAuth2Token nbf(Long nbf) {
    
    this.nbf = nbf;
    return this;
  }

   /**
   * NotBefore is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token is not to be used before.
   * @return nbf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NotBefore is an integer timestamp, measured in the number of seconds since January 1 1970 UTC, indicating when this token is not to be used before.")

  public Long getNbf() {
    return nbf;
  }


  public void setNbf(Long nbf) {
    this.nbf = nbf;
  }


  public IntrospectedOAuth2Token obfuscatedSubject(String obfuscatedSubject) {
    
    this.obfuscatedSubject = obfuscatedSubject;
    return this;
  }

   /**
   * ObfuscatedSubject is set when the subject identifier algorithm was set to \&quot;pairwise\&quot; during authorization. It is the &#x60;sub&#x60; value of the ID Token that was issued.
   * @return obfuscatedSubject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ObfuscatedSubject is set when the subject identifier algorithm was set to \"pairwise\" during authorization. It is the `sub` value of the ID Token that was issued.")

  public String getObfuscatedSubject() {
    return obfuscatedSubject;
  }


  public void setObfuscatedSubject(String obfuscatedSubject) {
    this.obfuscatedSubject = obfuscatedSubject;
  }


  public IntrospectedOAuth2Token scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Scope is a JSON string containing a space-separated list of scopes associated with this token.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scope is a JSON string containing a space-separated list of scopes associated with this token.")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public IntrospectedOAuth2Token sub(String sub) {
    
    this.sub = sub;
    return this;
  }

   /**
   * Subject of the token, as defined in JWT [RFC7519]. Usually a machine-readable identifier of the resource owner who authorized this token.
   * @return sub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject of the token, as defined in JWT [RFC7519]. Usually a machine-readable identifier of the resource owner who authorized this token.")

  public String getSub() {
    return sub;
  }


  public void setSub(String sub) {
    this.sub = sub;
  }


  public IntrospectedOAuth2Token tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * TokenType is the introspected token&#39;s type, typically &#x60;Bearer&#x60;.
   * @return tokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TokenType is the introspected token's type, typically `Bearer`.")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  public IntrospectedOAuth2Token tokenUse(String tokenUse) {
    
    this.tokenUse = tokenUse;
    return this;
  }

   /**
   * TokenUse is the introspected token&#39;s use, for example &#x60;access_token&#x60; or &#x60;refresh_token&#x60;.
   * @return tokenUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TokenUse is the introspected token's use, for example `access_token` or `refresh_token`.")

  public String getTokenUse() {
    return tokenUse;
  }


  public void setTokenUse(String tokenUse) {
    this.tokenUse = tokenUse;
  }


  public IntrospectedOAuth2Token username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Username is a human-readable identifier for the resource owner who authorized this token.
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Username is a human-readable identifier for the resource owner who authorized this token.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntrospectedOAuth2Token introspectedOAuth2Token = (IntrospectedOAuth2Token) o;
    return Objects.equals(this.active, introspectedOAuth2Token.active) &&
        Objects.equals(this.aud, introspectedOAuth2Token.aud) &&
        Objects.equals(this.clientId, introspectedOAuth2Token.clientId) &&
        Objects.equals(this.exp, introspectedOAuth2Token.exp) &&
        Objects.equals(this.ext, introspectedOAuth2Token.ext) &&
        Objects.equals(this.iat, introspectedOAuth2Token.iat) &&
        Objects.equals(this.iss, introspectedOAuth2Token.iss) &&
        Objects.equals(this.nbf, introspectedOAuth2Token.nbf) &&
        Objects.equals(this.obfuscatedSubject, introspectedOAuth2Token.obfuscatedSubject) &&
        Objects.equals(this.scope, introspectedOAuth2Token.scope) &&
        Objects.equals(this.sub, introspectedOAuth2Token.sub) &&
        Objects.equals(this.tokenType, introspectedOAuth2Token.tokenType) &&
        Objects.equals(this.tokenUse, introspectedOAuth2Token.tokenUse) &&
        Objects.equals(this.username, introspectedOAuth2Token.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, aud, clientId, exp, ext, iat, iss, nbf, obfuscatedSubject, scope, sub, tokenType, tokenUse, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntrospectedOAuth2Token {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    aud: ").append(toIndentedString(aud)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    exp: ").append(toIndentedString(exp)).append("\n");
    sb.append("    ext: ").append(toIndentedString(ext)).append("\n");
    sb.append("    iat: ").append(toIndentedString(iat)).append("\n");
    sb.append("    iss: ").append(toIndentedString(iss)).append("\n");
    sb.append("    nbf: ").append(toIndentedString(nbf)).append("\n");
    sb.append("    obfuscatedSubject: ").append(toIndentedString(obfuscatedSubject)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    tokenUse: ").append(toIndentedString(tokenUse)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("aud");
    openapiFields.add("client_id");
    openapiFields.add("exp");
    openapiFields.add("ext");
    openapiFields.add("iat");
    openapiFields.add("iss");
    openapiFields.add("nbf");
    openapiFields.add("obfuscated_subject");
    openapiFields.add("scope");
    openapiFields.add("sub");
    openapiFields.add("token_type");
    openapiFields.add("token_use");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IntrospectedOAuth2Token
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IntrospectedOAuth2Token.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IntrospectedOAuth2Token is not found in the empty JSON string", IntrospectedOAuth2Token.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IntrospectedOAuth2Token.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IntrospectedOAuth2Token` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IntrospectedOAuth2Token.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("aud") != null && !jsonObj.get("aud").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `aud` to be an array in the JSON string but got `%s`", jsonObj.get("aud").toString()));
      }
      if ((jsonObj.get("client_id") != null && !jsonObj.get("client_id").isJsonNull()) && !jsonObj.get("client_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_id").toString()));
      }
      if ((jsonObj.get("iss") != null && !jsonObj.get("iss").isJsonNull()) && !jsonObj.get("iss").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iss` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iss").toString()));
      }
      if ((jsonObj.get("obfuscated_subject") != null && !jsonObj.get("obfuscated_subject").isJsonNull()) && !jsonObj.get("obfuscated_subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `obfuscated_subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("obfuscated_subject").toString()));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if ((jsonObj.get("sub") != null && !jsonObj.get("sub").isJsonNull()) && !jsonObj.get("sub").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub").toString()));
      }
      if ((jsonObj.get("token_type") != null && !jsonObj.get("token_type").isJsonNull()) && !jsonObj.get("token_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_type").toString()));
      }
      if ((jsonObj.get("token_use") != null && !jsonObj.get("token_use").isJsonNull()) && !jsonObj.get("token_use").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_use` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_use").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IntrospectedOAuth2Token.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IntrospectedOAuth2Token' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IntrospectedOAuth2Token> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IntrospectedOAuth2Token.class));

       return (TypeAdapter<T>) new TypeAdapter<IntrospectedOAuth2Token>() {
           @Override
           public void write(JsonWriter out, IntrospectedOAuth2Token value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IntrospectedOAuth2Token read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IntrospectedOAuth2Token given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IntrospectedOAuth2Token
  * @throws IOException if the JSON string is invalid with respect to IntrospectedOAuth2Token
  */
  public static IntrospectedOAuth2Token fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IntrospectedOAuth2Token.class);
  }

 /**
  * Convert an instance of IntrospectedOAuth2Token to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

