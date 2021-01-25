/*
 * ORY Keto
 *
 * A cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0
 * Contact: hi@ory.sh
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
using OpenAPIDateConverter = Ory.Keto.Client.Client.OpenAPIDateConverter;

namespace Ory.Keto.Client.Model
{
    /// <summary>
    /// AddOryAccessControlPolicyRoleMembers add ory access control policy role members
    /// </summary>
    [DataContract(Name = "addOryAccessControlPolicyRoleMembers")]
    public partial class KetoAddOryAccessControlPolicyRoleMembers : IEquatable<KetoAddOryAccessControlPolicyRoleMembers>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KetoAddOryAccessControlPolicyRoleMembers" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KetoAddOryAccessControlPolicyRoleMembers() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="KetoAddOryAccessControlPolicyRoleMembers" /> class.
        /// </summary>
        /// <param name="body">body.</param>
        /// <param name="flavor">The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.  in: path (required).</param>
        /// <param name="id">The ID of the ORY Access Control Policy Role.  in: path (required).</param>
        public KetoAddOryAccessControlPolicyRoleMembers(KetoAddOryAccessControlPolicyRoleMembersBody body = default(KetoAddOryAccessControlPolicyRoleMembersBody), string flavor = default(string), string id = default(string))
        {
            // to ensure "flavor" is required (not null)
            this.Flavor = flavor ?? throw new ArgumentNullException("flavor is a required property for KetoAddOryAccessControlPolicyRoleMembers and cannot be null");
            // to ensure "id" is required (not null)
            this.Id = id ?? throw new ArgumentNullException("id is a required property for KetoAddOryAccessControlPolicyRoleMembers and cannot be null");
            this.Body = body;
        }

        /// <summary>
        /// Gets or Sets Body
        /// </summary>
        [DataMember(Name = "Body", EmitDefaultValue = false)]
        public KetoAddOryAccessControlPolicyRoleMembersBody Body { get; set; }

        /// <summary>
        /// The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.  in: path
        /// </summary>
        /// <value>The ORY Access Control Policy flavor. Can be \&quot;regex\&quot;, \&quot;glob\&quot;, and \&quot;exact\&quot;.  in: path</value>
        [DataMember(Name = "flavor", IsRequired = true, EmitDefaultValue = false)]
        public string Flavor { get; set; }

        /// <summary>
        /// The ID of the ORY Access Control Policy Role.  in: path
        /// </summary>
        /// <value>The ID of the ORY Access Control Policy Role.  in: path</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KetoAddOryAccessControlPolicyRoleMembers {\n");
            sb.Append("  Body: ").Append(Body).Append("\n");
            sb.Append("  Flavor: ").Append(Flavor).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as KetoAddOryAccessControlPolicyRoleMembers);
        }

        /// <summary>
        /// Returns true if KetoAddOryAccessControlPolicyRoleMembers instances are equal
        /// </summary>
        /// <param name="input">Instance of KetoAddOryAccessControlPolicyRoleMembers to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KetoAddOryAccessControlPolicyRoleMembers input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Body == input.Body ||
                    (this.Body != null &&
                    this.Body.Equals(input.Body))
                ) && 
                (
                    this.Flavor == input.Flavor ||
                    (this.Flavor != null &&
                    this.Flavor.Equals(input.Flavor))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Body != null)
                    hashCode = hashCode * 59 + this.Body.GetHashCode();
                if (this.Flavor != null)
                    hashCode = hashCode * 59 + this.Flavor.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}