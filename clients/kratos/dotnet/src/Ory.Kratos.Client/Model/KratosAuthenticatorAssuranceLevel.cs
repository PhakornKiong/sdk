/*
 * Ory Identities API
 *
 * This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 
 *
 * The version of the OpenAPI document: v0.13.2
 * Contact: office@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Kratos.Client.Client.OpenAPIDateConverter;

namespace Ory.Kratos.Client.Model
{
    /// <summary>
    /// The authenticator assurance level can be one of \&quot;aal1\&quot;, \&quot;aal2\&quot;, or \&quot;aal3\&quot;. A higher number means that it is harder for an attacker to compromise the account.  Generally, \&quot;aal1\&quot; implies that one authentication factor was used while AAL2 implies that two factors (e.g. password + TOTP) have been used.  To learn more about these levels please head over to: https://www.ory.sh/kratos/docs/concepts/credentials
    /// </summary>
    /// <value>The authenticator assurance level can be one of \&quot;aal1\&quot;, \&quot;aal2\&quot;, or \&quot;aal3\&quot;. A higher number means that it is harder for an attacker to compromise the account.  Generally, \&quot;aal1\&quot; implies that one authentication factor was used while AAL2 implies that two factors (e.g. password + TOTP) have been used.  To learn more about these levels please head over to: https://www.ory.sh/kratos/docs/concepts/credentials</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum KratosAuthenticatorAssuranceLevel
    {
        /// <summary>
        /// Enum Aal0 for value: aal0
        /// </summary>
        [EnumMember(Value = "aal0")]
        Aal0 = 1,

        /// <summary>
        /// Enum Aal1 for value: aal1
        /// </summary>
        [EnumMember(Value = "aal1")]
        Aal1 = 2,

        /// <summary>
        /// Enum Aal2 for value: aal2
        /// </summary>
        [EnumMember(Value = "aal2")]
        Aal2 = 3,

        /// <summary>
        /// Enum Aal3 for value: aal3
        /// </summary>
        [EnumMember(Value = "aal3")]
        Aal3 = 4

    }

}
