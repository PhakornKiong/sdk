/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.25
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// JsonPatch : A JSONPatch document as defined by RFC 6902



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct JsonPatch {
    /// This field is used together with operation \"move\" and uses JSON Pointer notation.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
    #[serde(rename = "from", skip_serializing_if = "Option::is_none")]
    pub from: Option<String>,
    /// The operation to be performed. One of \"add\", \"remove\", \"replace\", \"move\", \"copy\", or \"test\".
    #[serde(rename = "op")]
    pub op: OpEnum,
    /// The path to the target path. Uses JSON pointer notation.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
    #[serde(rename = "path")]
    pub path: String,
    /// The value to be used within the operations.  Learn more [about JSON Pointers](https://datatracker.ietf.org/doc/html/rfc6901#section-5).
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<serde_json::Value>,
}


impl JsonPatch {
    /// A JSONPatch document as defined by RFC 6902
    pub fn new(op: OpEnum, path: String) -> JsonPatch {
        JsonPatch {
                from: None,
                op,
                path,
                value: None,
        }
    }
}

/// The operation to be performed. One of \"add\", \"remove\", \"replace\", \"move\", \"copy\", or \"test\".
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum OpEnum {
    #[serde(rename = "add")]
    Add,
    #[serde(rename = "remove")]
    Remove,
    #[serde(rename = "replace")]
    Replace,
    #[serde(rename = "move")]
    _Move,
    #[serde(rename = "copy")]
    Copy,
    #[serde(rename = "test")]
    Test,
}

