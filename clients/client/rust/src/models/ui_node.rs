/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.184
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// UiNode : Nodes are represented as HTML elements or their native UI equivalents. For example, a node can be an `<img>` tag, or an `<input element>` but also `some plain text`.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct UiNode {
    #[serde(rename = "attributes")]
    pub attributes: Box<crate::models::UiNodeAttributes>,
    /// Group specifies which group (e.g. password authenticator) this node belongs to.
    #[serde(rename = "group")]
    pub group: Group,
    #[serde(rename = "messages")]
    pub messages: Vec<crate::models::UiText>,
    #[serde(rename = "meta")]
    pub meta: Box<crate::models::UiNodeMeta>,
    /// The node's type
    #[serde(rename = "type")]
    pub _type: Type,
}

impl UiNode {
    /// Nodes are represented as HTML elements or their native UI equivalents. For example, a node can be an `<img>` tag, or an `<input element>` but also `some plain text`.
    pub fn new(attributes: crate::models::UiNodeAttributes, group: Group, messages: Vec<crate::models::UiText>, meta: crate::models::UiNodeMeta, _type: Type) -> UiNode {
        UiNode {
            attributes: Box::new(attributes),
            group,
            messages,
            meta: Box::new(meta),
            _type,
        }
    }
}

/// Group specifies which group (e.g. password authenticator) this node belongs to.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Group {
    #[serde(rename = "default")]
    Default,
    #[serde(rename = "password")]
    Password,
    #[serde(rename = "oidc")]
    Oidc,
    #[serde(rename = "profile")]
    Profile,
    #[serde(rename = "link")]
    Link,
    #[serde(rename = "totp")]
    Totp,
    #[serde(rename = "lookup_secret")]
    LookupSecret,
    #[serde(rename = "webauthn")]
    Webauthn,
}
/// The node's type
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Type {
    #[serde(rename = "text")]
    Text,
    #[serde(rename = "input")]
    Input,
    #[serde(rename = "img")]
    Img,
    #[serde(rename = "a")]
    A,
    #[serde(rename = "script")]
    Script,
}

