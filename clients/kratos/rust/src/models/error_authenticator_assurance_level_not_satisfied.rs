/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.13.2
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ErrorAuthenticatorAssuranceLevelNotSatisfied {
    #[serde(rename = "error", skip_serializing_if = "Option::is_none")]
    pub error: Option<Box<crate::models::GenericError>>,
    /// Points to where to redirect the user to next.
    #[serde(rename = "redirect_browser_to", skip_serializing_if = "Option::is_none")]
    pub redirect_browser_to: Option<String>,
}

impl Default for ErrorAuthenticatorAssuranceLevelNotSatisfied {
    fn default() -> Self {
        Self::new()
    }
}

impl ErrorAuthenticatorAssuranceLevelNotSatisfied {
    pub fn new() -> ErrorAuthenticatorAssuranceLevelNotSatisfied {
        ErrorAuthenticatorAssuranceLevelNotSatisfied {
                error: None,
                redirect_browser_to: None,
        }
    }
}


