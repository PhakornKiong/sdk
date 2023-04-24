/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.25
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// CreateIdentityBody Create Identity Body
type CreateIdentityBody struct {
	Credentials *IdentityWithCredentials `json:"credentials,omitempty"`
	// Store metadata about the user which is only accessible through admin APIs such as `GET /admin/identities/<id>`.
	MetadataAdmin interface{} `json:"metadata_admin,omitempty"`
	// Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field.
	MetadataPublic interface{} `json:"metadata_public,omitempty"`
	// RecoveryAddresses contains all the addresses that can be used to recover an identity.  Use this structure to import recovery addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
	RecoveryAddresses []RecoveryIdentityAddress `json:"recovery_addresses,omitempty"`
	// SchemaID is the ID of the JSON Schema to be used for validating the identity's traits.
	SchemaId string `json:"schema_id"`
	State *IdentityState `json:"state,omitempty"`
	// Traits represent an identity's traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in `schema_url`.
	Traits map[string]interface{} `json:"traits"`
	// VerifiableAddresses contains all the addresses that can be verified by the user.  Use this structure to import verified addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
	VerifiableAddresses []VerifiableIdentityAddress `json:"verifiable_addresses,omitempty"`
}

// NewCreateIdentityBody instantiates a new CreateIdentityBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateIdentityBody(schemaId string, traits map[string]interface{}) *CreateIdentityBody {
	this := CreateIdentityBody{}
	this.SchemaId = schemaId
	this.Traits = traits
	return &this
}

// NewCreateIdentityBodyWithDefaults instantiates a new CreateIdentityBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateIdentityBodyWithDefaults() *CreateIdentityBody {
	this := CreateIdentityBody{}
	return &this
}

// GetCredentials returns the Credentials field value if set, zero value otherwise.
func (o *CreateIdentityBody) GetCredentials() IdentityWithCredentials {
	if o == nil || o.Credentials == nil {
		var ret IdentityWithCredentials
		return ret
	}
	return *o.Credentials
}

// GetCredentialsOk returns a tuple with the Credentials field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateIdentityBody) GetCredentialsOk() (*IdentityWithCredentials, bool) {
	if o == nil || o.Credentials == nil {
		return nil, false
	}
	return o.Credentials, true
}

// HasCredentials returns a boolean if a field has been set.
func (o *CreateIdentityBody) HasCredentials() bool {
	if o != nil && o.Credentials != nil {
		return true
	}

	return false
}

// SetCredentials gets a reference to the given IdentityWithCredentials and assigns it to the Credentials field.
func (o *CreateIdentityBody) SetCredentials(v IdentityWithCredentials) {
	o.Credentials = &v
}

// GetMetadataAdmin returns the MetadataAdmin field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateIdentityBody) GetMetadataAdmin() interface{} {
	if o == nil {
		var ret interface{}
		return ret
	}
	return o.MetadataAdmin
}

// GetMetadataAdminOk returns a tuple with the MetadataAdmin field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateIdentityBody) GetMetadataAdminOk() (*interface{}, bool) {
	if o == nil || o.MetadataAdmin == nil {
		return nil, false
	}
	return &o.MetadataAdmin, true
}

// HasMetadataAdmin returns a boolean if a field has been set.
func (o *CreateIdentityBody) HasMetadataAdmin() bool {
	if o != nil && o.MetadataAdmin != nil {
		return true
	}

	return false
}

// SetMetadataAdmin gets a reference to the given interface{} and assigns it to the MetadataAdmin field.
func (o *CreateIdentityBody) SetMetadataAdmin(v interface{}) {
	o.MetadataAdmin = v
}

// GetMetadataPublic returns the MetadataPublic field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *CreateIdentityBody) GetMetadataPublic() interface{} {
	if o == nil {
		var ret interface{}
		return ret
	}
	return o.MetadataPublic
}

// GetMetadataPublicOk returns a tuple with the MetadataPublic field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *CreateIdentityBody) GetMetadataPublicOk() (*interface{}, bool) {
	if o == nil || o.MetadataPublic == nil {
		return nil, false
	}
	return &o.MetadataPublic, true
}

// HasMetadataPublic returns a boolean if a field has been set.
func (o *CreateIdentityBody) HasMetadataPublic() bool {
	if o != nil && o.MetadataPublic != nil {
		return true
	}

	return false
}

// SetMetadataPublic gets a reference to the given interface{} and assigns it to the MetadataPublic field.
func (o *CreateIdentityBody) SetMetadataPublic(v interface{}) {
	o.MetadataPublic = v
}

// GetRecoveryAddresses returns the RecoveryAddresses field value if set, zero value otherwise.
func (o *CreateIdentityBody) GetRecoveryAddresses() []RecoveryIdentityAddress {
	if o == nil || o.RecoveryAddresses == nil {
		var ret []RecoveryIdentityAddress
		return ret
	}
	return o.RecoveryAddresses
}

// GetRecoveryAddressesOk returns a tuple with the RecoveryAddresses field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateIdentityBody) GetRecoveryAddressesOk() ([]RecoveryIdentityAddress, bool) {
	if o == nil || o.RecoveryAddresses == nil {
		return nil, false
	}
	return o.RecoveryAddresses, true
}

// HasRecoveryAddresses returns a boolean if a field has been set.
func (o *CreateIdentityBody) HasRecoveryAddresses() bool {
	if o != nil && o.RecoveryAddresses != nil {
		return true
	}

	return false
}

// SetRecoveryAddresses gets a reference to the given []RecoveryIdentityAddress and assigns it to the RecoveryAddresses field.
func (o *CreateIdentityBody) SetRecoveryAddresses(v []RecoveryIdentityAddress) {
	o.RecoveryAddresses = v
}

// GetSchemaId returns the SchemaId field value
func (o *CreateIdentityBody) GetSchemaId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.SchemaId
}

// GetSchemaIdOk returns a tuple with the SchemaId field value
// and a boolean to check if the value has been set.
func (o *CreateIdentityBody) GetSchemaIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.SchemaId, true
}

// SetSchemaId sets field value
func (o *CreateIdentityBody) SetSchemaId(v string) {
	o.SchemaId = v
}

// GetState returns the State field value if set, zero value otherwise.
func (o *CreateIdentityBody) GetState() IdentityState {
	if o == nil || o.State == nil {
		var ret IdentityState
		return ret
	}
	return *o.State
}

// GetStateOk returns a tuple with the State field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateIdentityBody) GetStateOk() (*IdentityState, bool) {
	if o == nil || o.State == nil {
		return nil, false
	}
	return o.State, true
}

// HasState returns a boolean if a field has been set.
func (o *CreateIdentityBody) HasState() bool {
	if o != nil && o.State != nil {
		return true
	}

	return false
}

// SetState gets a reference to the given IdentityState and assigns it to the State field.
func (o *CreateIdentityBody) SetState(v IdentityState) {
	o.State = &v
}

// GetTraits returns the Traits field value
func (o *CreateIdentityBody) GetTraits() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}

	return o.Traits
}

// GetTraitsOk returns a tuple with the Traits field value
// and a boolean to check if the value has been set.
func (o *CreateIdentityBody) GetTraitsOk() (map[string]interface{}, bool) {
	if o == nil {
		return nil, false
	}
	return o.Traits, true
}

// SetTraits sets field value
func (o *CreateIdentityBody) SetTraits(v map[string]interface{}) {
	o.Traits = v
}

// GetVerifiableAddresses returns the VerifiableAddresses field value if set, zero value otherwise.
func (o *CreateIdentityBody) GetVerifiableAddresses() []VerifiableIdentityAddress {
	if o == nil || o.VerifiableAddresses == nil {
		var ret []VerifiableIdentityAddress
		return ret
	}
	return o.VerifiableAddresses
}

// GetVerifiableAddressesOk returns a tuple with the VerifiableAddresses field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateIdentityBody) GetVerifiableAddressesOk() ([]VerifiableIdentityAddress, bool) {
	if o == nil || o.VerifiableAddresses == nil {
		return nil, false
	}
	return o.VerifiableAddresses, true
}

// HasVerifiableAddresses returns a boolean if a field has been set.
func (o *CreateIdentityBody) HasVerifiableAddresses() bool {
	if o != nil && o.VerifiableAddresses != nil {
		return true
	}

	return false
}

// SetVerifiableAddresses gets a reference to the given []VerifiableIdentityAddress and assigns it to the VerifiableAddresses field.
func (o *CreateIdentityBody) SetVerifiableAddresses(v []VerifiableIdentityAddress) {
	o.VerifiableAddresses = v
}

func (o CreateIdentityBody) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Credentials != nil {
		toSerialize["credentials"] = o.Credentials
	}
	if o.MetadataAdmin != nil {
		toSerialize["metadata_admin"] = o.MetadataAdmin
	}
	if o.MetadataPublic != nil {
		toSerialize["metadata_public"] = o.MetadataPublic
	}
	if o.RecoveryAddresses != nil {
		toSerialize["recovery_addresses"] = o.RecoveryAddresses
	}
	if true {
		toSerialize["schema_id"] = o.SchemaId
	}
	if o.State != nil {
		toSerialize["state"] = o.State
	}
	if true {
		toSerialize["traits"] = o.Traits
	}
	if o.VerifiableAddresses != nil {
		toSerialize["verifiable_addresses"] = o.VerifiableAddresses
	}
	return json.Marshal(toSerialize)
}

type NullableCreateIdentityBody struct {
	value *CreateIdentityBody
	isSet bool
}

func (v NullableCreateIdentityBody) Get() *CreateIdentityBody {
	return v.value
}

func (v *NullableCreateIdentityBody) Set(val *CreateIdentityBody) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateIdentityBody) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateIdentityBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateIdentityBody(val *CreateIdentityBody) *NullableCreateIdentityBody {
	return &NullableCreateIdentityBody{value: val, isSet: true}
}

func (v NullableCreateIdentityBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateIdentityBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


