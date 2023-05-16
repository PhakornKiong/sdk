/*
Ory Identities API

This is the API specification for Ory Identities with features such as registration, login, recovery, account verification, profile settings, password reset, identity management, session management, email and sms delivery, and more. 

API version: v0.13.2
Contact: office@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"time"
)

// Session A Session
type Session struct {
	// Active state. If false the session is no longer active.
	Active *bool `json:"active,omitempty"`
	// The Session Authentication Timestamp  When this session was authenticated at. If multi-factor authentication was used this is the time when the last factor was authenticated (e.g. the TOTP code challenge was completed).
	AuthenticatedAt *time.Time `json:"authenticated_at,omitempty"`
	// A list of authenticators which were used to authenticate the session.
	AuthenticationMethods []SessionAuthenticationMethod `json:"authentication_methods,omitempty"`
	AuthenticatorAssuranceLevel *AuthenticatorAssuranceLevel `json:"authenticator_assurance_level,omitempty"`
	// Devices has history of all endpoints where the session was used
	Devices []SessionDevice `json:"devices,omitempty"`
	// The Session Expiry  When this session expires at.
	ExpiresAt *time.Time `json:"expires_at,omitempty"`
	// Session ID
	Id string `json:"id"`
	Identity Identity `json:"identity"`
	// The Session Issuance Timestamp  When this session was issued at. Usually equal or close to `authenticated_at`.
	IssuedAt *time.Time `json:"issued_at,omitempty"`
}

// NewSession instantiates a new Session object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSession(id string, identity Identity) *Session {
	this := Session{}
	this.Id = id
	this.Identity = identity
	return &this
}

// NewSessionWithDefaults instantiates a new Session object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSessionWithDefaults() *Session {
	this := Session{}
	return &this
}

// GetActive returns the Active field value if set, zero value otherwise.
func (o *Session) GetActive() bool {
	if o == nil || o.Active == nil {
		var ret bool
		return ret
	}
	return *o.Active
}

// GetActiveOk returns a tuple with the Active field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Session) GetActiveOk() (*bool, bool) {
	if o == nil || o.Active == nil {
		return nil, false
	}
	return o.Active, true
}

// HasActive returns a boolean if a field has been set.
func (o *Session) HasActive() bool {
	if o != nil && o.Active != nil {
		return true
	}

	return false
}

// SetActive gets a reference to the given bool and assigns it to the Active field.
func (o *Session) SetActive(v bool) {
	o.Active = &v
}

// GetAuthenticatedAt returns the AuthenticatedAt field value if set, zero value otherwise.
func (o *Session) GetAuthenticatedAt() time.Time {
	if o == nil || o.AuthenticatedAt == nil {
		var ret time.Time
		return ret
	}
	return *o.AuthenticatedAt
}

// GetAuthenticatedAtOk returns a tuple with the AuthenticatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Session) GetAuthenticatedAtOk() (*time.Time, bool) {
	if o == nil || o.AuthenticatedAt == nil {
		return nil, false
	}
	return o.AuthenticatedAt, true
}

// HasAuthenticatedAt returns a boolean if a field has been set.
func (o *Session) HasAuthenticatedAt() bool {
	if o != nil && o.AuthenticatedAt != nil {
		return true
	}

	return false
}

// SetAuthenticatedAt gets a reference to the given time.Time and assigns it to the AuthenticatedAt field.
func (o *Session) SetAuthenticatedAt(v time.Time) {
	o.AuthenticatedAt = &v
}

// GetAuthenticationMethods returns the AuthenticationMethods field value if set, zero value otherwise.
func (o *Session) GetAuthenticationMethods() []SessionAuthenticationMethod {
	if o == nil || o.AuthenticationMethods == nil {
		var ret []SessionAuthenticationMethod
		return ret
	}
	return o.AuthenticationMethods
}

// GetAuthenticationMethodsOk returns a tuple with the AuthenticationMethods field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Session) GetAuthenticationMethodsOk() ([]SessionAuthenticationMethod, bool) {
	if o == nil || o.AuthenticationMethods == nil {
		return nil, false
	}
	return o.AuthenticationMethods, true
}

// HasAuthenticationMethods returns a boolean if a field has been set.
func (o *Session) HasAuthenticationMethods() bool {
	if o != nil && o.AuthenticationMethods != nil {
		return true
	}

	return false
}

// SetAuthenticationMethods gets a reference to the given []SessionAuthenticationMethod and assigns it to the AuthenticationMethods field.
func (o *Session) SetAuthenticationMethods(v []SessionAuthenticationMethod) {
	o.AuthenticationMethods = v
}

// GetAuthenticatorAssuranceLevel returns the AuthenticatorAssuranceLevel field value if set, zero value otherwise.
func (o *Session) GetAuthenticatorAssuranceLevel() AuthenticatorAssuranceLevel {
	if o == nil || o.AuthenticatorAssuranceLevel == nil {
		var ret AuthenticatorAssuranceLevel
		return ret
	}
	return *o.AuthenticatorAssuranceLevel
}

// GetAuthenticatorAssuranceLevelOk returns a tuple with the AuthenticatorAssuranceLevel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Session) GetAuthenticatorAssuranceLevelOk() (*AuthenticatorAssuranceLevel, bool) {
	if o == nil || o.AuthenticatorAssuranceLevel == nil {
		return nil, false
	}
	return o.AuthenticatorAssuranceLevel, true
}

// HasAuthenticatorAssuranceLevel returns a boolean if a field has been set.
func (o *Session) HasAuthenticatorAssuranceLevel() bool {
	if o != nil && o.AuthenticatorAssuranceLevel != nil {
		return true
	}

	return false
}

// SetAuthenticatorAssuranceLevel gets a reference to the given AuthenticatorAssuranceLevel and assigns it to the AuthenticatorAssuranceLevel field.
func (o *Session) SetAuthenticatorAssuranceLevel(v AuthenticatorAssuranceLevel) {
	o.AuthenticatorAssuranceLevel = &v
}

// GetDevices returns the Devices field value if set, zero value otherwise.
func (o *Session) GetDevices() []SessionDevice {
	if o == nil || o.Devices == nil {
		var ret []SessionDevice
		return ret
	}
	return o.Devices
}

// GetDevicesOk returns a tuple with the Devices field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Session) GetDevicesOk() ([]SessionDevice, bool) {
	if o == nil || o.Devices == nil {
		return nil, false
	}
	return o.Devices, true
}

// HasDevices returns a boolean if a field has been set.
func (o *Session) HasDevices() bool {
	if o != nil && o.Devices != nil {
		return true
	}

	return false
}

// SetDevices gets a reference to the given []SessionDevice and assigns it to the Devices field.
func (o *Session) SetDevices(v []SessionDevice) {
	o.Devices = v
}

// GetExpiresAt returns the ExpiresAt field value if set, zero value otherwise.
func (o *Session) GetExpiresAt() time.Time {
	if o == nil || o.ExpiresAt == nil {
		var ret time.Time
		return ret
	}
	return *o.ExpiresAt
}

// GetExpiresAtOk returns a tuple with the ExpiresAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Session) GetExpiresAtOk() (*time.Time, bool) {
	if o == nil || o.ExpiresAt == nil {
		return nil, false
	}
	return o.ExpiresAt, true
}

// HasExpiresAt returns a boolean if a field has been set.
func (o *Session) HasExpiresAt() bool {
	if o != nil && o.ExpiresAt != nil {
		return true
	}

	return false
}

// SetExpiresAt gets a reference to the given time.Time and assigns it to the ExpiresAt field.
func (o *Session) SetExpiresAt(v time.Time) {
	o.ExpiresAt = &v
}

// GetId returns the Id field value
func (o *Session) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *Session) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *Session) SetId(v string) {
	o.Id = v
}

// GetIdentity returns the Identity field value
func (o *Session) GetIdentity() Identity {
	if o == nil {
		var ret Identity
		return ret
	}

	return o.Identity
}

// GetIdentityOk returns a tuple with the Identity field value
// and a boolean to check if the value has been set.
func (o *Session) GetIdentityOk() (*Identity, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Identity, true
}

// SetIdentity sets field value
func (o *Session) SetIdentity(v Identity) {
	o.Identity = v
}

// GetIssuedAt returns the IssuedAt field value if set, zero value otherwise.
func (o *Session) GetIssuedAt() time.Time {
	if o == nil || o.IssuedAt == nil {
		var ret time.Time
		return ret
	}
	return *o.IssuedAt
}

// GetIssuedAtOk returns a tuple with the IssuedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Session) GetIssuedAtOk() (*time.Time, bool) {
	if o == nil || o.IssuedAt == nil {
		return nil, false
	}
	return o.IssuedAt, true
}

// HasIssuedAt returns a boolean if a field has been set.
func (o *Session) HasIssuedAt() bool {
	if o != nil && o.IssuedAt != nil {
		return true
	}

	return false
}

// SetIssuedAt gets a reference to the given time.Time and assigns it to the IssuedAt field.
func (o *Session) SetIssuedAt(v time.Time) {
	o.IssuedAt = &v
}

func (o Session) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Active != nil {
		toSerialize["active"] = o.Active
	}
	if o.AuthenticatedAt != nil {
		toSerialize["authenticated_at"] = o.AuthenticatedAt
	}
	if o.AuthenticationMethods != nil {
		toSerialize["authentication_methods"] = o.AuthenticationMethods
	}
	if o.AuthenticatorAssuranceLevel != nil {
		toSerialize["authenticator_assurance_level"] = o.AuthenticatorAssuranceLevel
	}
	if o.Devices != nil {
		toSerialize["devices"] = o.Devices
	}
	if o.ExpiresAt != nil {
		toSerialize["expires_at"] = o.ExpiresAt
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["identity"] = o.Identity
	}
	if o.IssuedAt != nil {
		toSerialize["issued_at"] = o.IssuedAt
	}
	return json.Marshal(toSerialize)
}

type NullableSession struct {
	value *Session
	isSet bool
}

func (v NullableSession) Get() *Session {
	return v.value
}

func (v *NullableSession) Set(val *Session) {
	v.value = val
	v.isSet = true
}

func (v NullableSession) IsSet() bool {
	return v.isSet
}

func (v *NullableSession) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSession(val *Session) *NullableSession {
	return &NullableSession{value: val, isSet: true}
}

func (v NullableSession) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSession) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


