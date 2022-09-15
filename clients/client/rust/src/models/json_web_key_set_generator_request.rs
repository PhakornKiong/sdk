/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.48
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct JsonWebKeySetGeneratorRequest {
    /// The algorithm to be used for creating the key. Supports \"RS256\", \"ES256\", \"ES512\", \"HS512\", and \"HS256\"
    #[serde(rename = "alg")]
    pub alg: String,
    /// The kid of the key to be created
    #[serde(rename = "kid")]
    pub kid: String,
    /// The \"use\" (public key use) parameter identifies the intended use of the public key. The \"use\" parameter is employed to indicate whether a public key is used for encrypting data or verifying the signature on data. Valid values are \"enc\" and \"sig\".
    #[serde(rename = "use")]
    pub _use: String,
}


impl JsonWebKeySetGeneratorRequest {
    pub fn new(alg: String, kid: String, _use: String) -> JsonWebKeySetGeneratorRequest {
        JsonWebKeySetGeneratorRequest {
                alg,
                kid,
                _use,
        }
    }
}


