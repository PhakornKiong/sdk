/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.13.2
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// ErrorGeneric : The standard Ory JSON API error format.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ErrorGeneric {
    #[serde(rename = "error")]
    pub error: Box<crate::models::GenericError>,
}


impl ErrorGeneric {
    /// The standard Ory JSON API error format.
    pub fn new(error: crate::models::GenericError) -> ErrorGeneric {
        ErrorGeneric {
                error: Box::new(error),
        }
    }
}


