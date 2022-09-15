/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v0.2.0-alpha.48
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// CreateCustomHostnameBody struct for CreateCustomHostnameBody
type CreateCustomHostnameBody struct {
	// The domain where cookies will be set. Has to be a parent domain of the custom hostname to work.
	CookieDomain *string `json:"cookie_domain,omitempty"`
	// CORS Allowed origins for the custom hostname.
	CorsAllowedOrigins []string `json:"cors_allowed_origins,omitempty"`
	// CORS Enabled for the custom hostname.
	CorsEnabled *bool `json:"cors_enabled,omitempty"`
	// The custom hostname where the API will be exposed.
	Hostname *string `json:"hostname,omitempty"`
}

// NewCreateCustomHostnameBody instantiates a new CreateCustomHostnameBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateCustomHostnameBody() *CreateCustomHostnameBody {
	this := CreateCustomHostnameBody{}
	return &this
}

// NewCreateCustomHostnameBodyWithDefaults instantiates a new CreateCustomHostnameBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateCustomHostnameBodyWithDefaults() *CreateCustomHostnameBody {
	this := CreateCustomHostnameBody{}
	return &this
}

// GetCookieDomain returns the CookieDomain field value if set, zero value otherwise.
func (o *CreateCustomHostnameBody) GetCookieDomain() string {
	if o == nil || o.CookieDomain == nil {
		var ret string
		return ret
	}
	return *o.CookieDomain
}

// GetCookieDomainOk returns a tuple with the CookieDomain field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateCustomHostnameBody) GetCookieDomainOk() (*string, bool) {
	if o == nil || o.CookieDomain == nil {
		return nil, false
	}
	return o.CookieDomain, true
}

// HasCookieDomain returns a boolean if a field has been set.
func (o *CreateCustomHostnameBody) HasCookieDomain() bool {
	if o != nil && o.CookieDomain != nil {
		return true
	}

	return false
}

// SetCookieDomain gets a reference to the given string and assigns it to the CookieDomain field.
func (o *CreateCustomHostnameBody) SetCookieDomain(v string) {
	o.CookieDomain = &v
}

// GetCorsAllowedOrigins returns the CorsAllowedOrigins field value if set, zero value otherwise.
func (o *CreateCustomHostnameBody) GetCorsAllowedOrigins() []string {
	if o == nil || o.CorsAllowedOrigins == nil {
		var ret []string
		return ret
	}
	return o.CorsAllowedOrigins
}

// GetCorsAllowedOriginsOk returns a tuple with the CorsAllowedOrigins field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateCustomHostnameBody) GetCorsAllowedOriginsOk() ([]string, bool) {
	if o == nil || o.CorsAllowedOrigins == nil {
		return nil, false
	}
	return o.CorsAllowedOrigins, true
}

// HasCorsAllowedOrigins returns a boolean if a field has been set.
func (o *CreateCustomHostnameBody) HasCorsAllowedOrigins() bool {
	if o != nil && o.CorsAllowedOrigins != nil {
		return true
	}

	return false
}

// SetCorsAllowedOrigins gets a reference to the given []string and assigns it to the CorsAllowedOrigins field.
func (o *CreateCustomHostnameBody) SetCorsAllowedOrigins(v []string) {
	o.CorsAllowedOrigins = v
}

// GetCorsEnabled returns the CorsEnabled field value if set, zero value otherwise.
func (o *CreateCustomHostnameBody) GetCorsEnabled() bool {
	if o == nil || o.CorsEnabled == nil {
		var ret bool
		return ret
	}
	return *o.CorsEnabled
}

// GetCorsEnabledOk returns a tuple with the CorsEnabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateCustomHostnameBody) GetCorsEnabledOk() (*bool, bool) {
	if o == nil || o.CorsEnabled == nil {
		return nil, false
	}
	return o.CorsEnabled, true
}

// HasCorsEnabled returns a boolean if a field has been set.
func (o *CreateCustomHostnameBody) HasCorsEnabled() bool {
	if o != nil && o.CorsEnabled != nil {
		return true
	}

	return false
}

// SetCorsEnabled gets a reference to the given bool and assigns it to the CorsEnabled field.
func (o *CreateCustomHostnameBody) SetCorsEnabled(v bool) {
	o.CorsEnabled = &v
}

// GetHostname returns the Hostname field value if set, zero value otherwise.
func (o *CreateCustomHostnameBody) GetHostname() string {
	if o == nil || o.Hostname == nil {
		var ret string
		return ret
	}
	return *o.Hostname
}

// GetHostnameOk returns a tuple with the Hostname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateCustomHostnameBody) GetHostnameOk() (*string, bool) {
	if o == nil || o.Hostname == nil {
		return nil, false
	}
	return o.Hostname, true
}

// HasHostname returns a boolean if a field has been set.
func (o *CreateCustomHostnameBody) HasHostname() bool {
	if o != nil && o.Hostname != nil {
		return true
	}

	return false
}

// SetHostname gets a reference to the given string and assigns it to the Hostname field.
func (o *CreateCustomHostnameBody) SetHostname(v string) {
	o.Hostname = &v
}

func (o CreateCustomHostnameBody) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.CookieDomain != nil {
		toSerialize["cookie_domain"] = o.CookieDomain
	}
	if o.CorsAllowedOrigins != nil {
		toSerialize["cors_allowed_origins"] = o.CorsAllowedOrigins
	}
	if o.CorsEnabled != nil {
		toSerialize["cors_enabled"] = o.CorsEnabled
	}
	if o.Hostname != nil {
		toSerialize["hostname"] = o.Hostname
	}
	return json.Marshal(toSerialize)
}

type NullableCreateCustomHostnameBody struct {
	value *CreateCustomHostnameBody
	isSet bool
}

func (v NullableCreateCustomHostnameBody) Get() *CreateCustomHostnameBody {
	return v.value
}

func (v *NullableCreateCustomHostnameBody) Set(val *CreateCustomHostnameBody) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateCustomHostnameBody) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateCustomHostnameBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateCustomHostnameBody(val *CreateCustomHostnameBody) *NullableCreateCustomHostnameBody {
	return &NullableCreateCustomHostnameBody{value: val, isSet: true}
}

func (v NullableCreateCustomHostnameBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateCustomHostnameBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


