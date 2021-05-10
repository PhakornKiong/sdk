/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.6.0-alpha.15
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SubmitSelfServiceSettingsFlowWithPasswordMethod {
    /// CSRFToken is the anti-CSRF token  type: string
    #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
    pub csrf_token: Option<String>,
    /// Method  Should be set to password when trying to update a password.  type: string
    #[serde(rename = "method", skip_serializing_if = "Option::is_none")]
    pub method: Option<String>,
    /// Password is the updated password  type: string
    #[serde(rename = "password")]
    pub password: String,
}

impl SubmitSelfServiceSettingsFlowWithPasswordMethod {
    pub fn new(password: String) -> SubmitSelfServiceSettingsFlowWithPasswordMethod {
        SubmitSelfServiceSettingsFlowWithPasswordMethod {
            csrf_token: None,
            method: None,
            password,
        }
    }
}


