/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.5.5-alpha.4
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
import java.util.ArrayList;
import java.util.List;
import sh.ory.kratos.model.FormField;
import sh.ory.kratos.model.Message;

/**
 * VerificationFlowMethodConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-24T22:43:30.696930295Z[Etc/UTC]")
public class VerificationFlowMethodConfig {
  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FormField> fields = new ArrayList<>();

  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<Message> messages = null;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;


  public VerificationFlowMethodConfig action(String action) {
    
    this.action = action;
    return this;
  }

   /**
   * Action should be used as the form action URL &#x60;&lt;form action&#x3D;\&quot;{{ .Action }}\&quot; method&#x3D;\&quot;post\&quot;&gt;&#x60;.
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Action should be used as the form action URL `<form action=\"{{ .Action }}\" method=\"post\">`.")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    this.action = action;
  }


  public VerificationFlowMethodConfig fields(List<FormField> fields) {
    
    this.fields = fields;
    return this;
  }

  public VerificationFlowMethodConfig addFieldsItem(FormField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields contains multiple fields
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "Fields contains multiple fields")

  public List<FormField> getFields() {
    return fields;
  }


  public void setFields(List<FormField> fields) {
    this.fields = fields;
  }


  public VerificationFlowMethodConfig messages(List<Message> messages) {
    
    this.messages = messages;
    return this;
  }

  public VerificationFlowMethodConfig addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Message> getMessages() {
    return messages;
  }


  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }


  public VerificationFlowMethodConfig method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method is the form method (e.g. POST)
   * @return method
  **/
  @ApiModelProperty(required = true, value = "Method is the form method (e.g. POST)")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationFlowMethodConfig verificationFlowMethodConfig = (VerificationFlowMethodConfig) o;
    return Objects.equals(this.action, verificationFlowMethodConfig.action) &&
        Objects.equals(this.fields, verificationFlowMethodConfig.fields) &&
        Objects.equals(this.messages, verificationFlowMethodConfig.messages) &&
        Objects.equals(this.method, verificationFlowMethodConfig.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, fields, messages, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationFlowMethodConfig {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

}

