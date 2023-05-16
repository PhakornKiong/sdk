/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.13.2
 * Contact: office@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// IdentityWithCredentialsOidcConfigProvider : Create Identity and Import Social Sign In Credentials Configuration



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct IdentityWithCredentialsOidcConfigProvider {
    /// The OpenID Connect provider to link the subject to. Usually something like `google` or `github`.
    #[serde(rename = "provider")]
    pub provider: String,
    /// The subject (`sub`) of the OpenID Connect connection. Usually the `sub` field of the ID Token.
    #[serde(rename = "subject")]
    pub subject: String,
}


impl IdentityWithCredentialsOidcConfigProvider {
    /// Create Identity and Import Social Sign In Credentials Configuration
    pub fn new(provider: String, subject: String) -> IdentityWithCredentialsOidcConfigProvider {
        IdentityWithCredentialsOidcConfigProvider {
                provider,
                subject,
        }
    }
}


